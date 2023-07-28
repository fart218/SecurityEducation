package jp.co.exam.service.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LoginTryInfo {
    private String id;
	private int tryCount = 1;
	private LocalDateTime lastTryTime;
	private boolean locked = false;

    public LoginTryInfo(String id) {
		this.id = id;
	}
}
