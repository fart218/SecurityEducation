package jp.co.exam.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.exam.controller.dto.LoginUserObj;
import jp.co.exam.controller.dto.LoginUserResponse;
import jp.co.exam.service.AuthService;

@Controller
@RequestMapping("/api")
public class LoginController {
	
	@Autowired
	AuthService authService;

    private HttpHeaders headers;
    private HttpStatus status;

    public LoginController() {
        headers = new HttpHeaders();
        status = HttpStatus.OK;
    }

	@PostMapping("/login")
	public ResponseEntity<LoginUserResponse> login(
			@RequestBody LoginUserObj loginUserObj, HttpSession session) {
		LoginUserResponse response = authService.authenticateUser(loginUserObj);
        if(response.isAuthResult() == true) {
        	session.setAttribute("isAuthenticated", response.isAuthResult());
        } else {
        	session.setAttribute("isAuthenticated", null);
        }
        return new ResponseEntity<LoginUserResponse>(response, headers, status);
	}

	@PostMapping("/noLocklogin")
	public ResponseEntity<LoginUserResponse> noLocklogin(
			@RequestBody LoginUserObj loginUserObj, HttpSession session) {
		LoginUserResponse response = authService.noLockOut(loginUserObj);
        if(response.isAuthResult() == true) {
        	session.setAttribute("isAuthenticated", response.isAuthResult());
        } else {
        	session.setAttribute("isAuthenticated", null);
        }
        return new ResponseEntity<LoginUserResponse>(response, headers, status);
	}
}
