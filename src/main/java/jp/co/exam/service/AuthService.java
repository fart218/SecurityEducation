package jp.co.exam.service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import jp.co.exam.controller.dto.LoginUserObj;
import jp.co.exam.controller.dto.LoginUserResponse;
import jp.co.exam.service.dto.LoginTryInfo;

@Service
public class AuthService {
	
	@Value(value = "${app.id}")
	String id;
	@Value(value = "${app.password}")
	String password;
	@Value(value = "${app.lockCount}")
	int lockCount;
	@Value(value = "${app.lockRelease}")
	int lockRelease;
	
	Map<String, LoginTryInfo> loginHistory = new HashMap<>();

    public LoginUserResponse noLockOut(LoginUserObj loginUserObj) {
    	LoginUserResponse response = new LoginUserResponse();
    	response.setAuthResult(false);
    	response.setLockRelease(0);

    	if(loginUserObj.getId().equals("a") && loginUserObj.getPassword().equals("a")) {
        	response.setAuthResult(true);
    	}

    	return response;
    }

    public LoginUserResponse authenticateUser(LoginUserObj loginUserObj) {
    	LoginUserResponse response = new LoginUserResponse();
    	LoginTryInfo tempUser;

    	response.setAuthResult(false);
    	response.setLockRelease(lockRelease);
    	
    	if(loginHistory.containsKey(loginUserObj.getId())) {
    		tempUser = loginHistory.get(loginUserObj.getId());
    		if(tempUser.isLocked()) {
    			Duration duration = Duration.between(tempUser.getLastTryTime(), LocalDateTime.now());
    			if(duration.getSeconds() > lockRelease * 60) { // 分
    				tempUser.setLocked(false);
    				tempUser.setTryCount(1);
    				tempUser.setLastTryTime
    				(LocalDateTime.now());
    			} else {
    				response.setLockStatus(2);
    				return response;
    			}
    		} else {
    			tempUser.setTryCount(tempUser.getTryCount() + 1);
    			tempUser.setLastTryTime(LocalDateTime.now());
    			if(tempUser.getTryCount() >= lockCount) {
        			response.setLockStatus(1);
        			tempUser.setLocked(true);
        		}
    		}
    	} else {
    		tempUser = new LoginTryInfo(loginUserObj.getId());
    		tempUser.setLastTryTime(LocalDateTime.now());
    		loginHistory.put(loginUserObj.getId(), tempUser);
    	}
    	
    	if(loginUserObj.getId().equals(id) && loginUserObj.getPassword().equals(password)) {
        	response.setAuthResult(true);
        	tempUser.setTryCount(0);
    	}

    	return response;
    }
}
