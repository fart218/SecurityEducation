package jp.co.exam.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LoginUserResponse {
	private boolean authResult;
	private int lockStatus;
	private int lockRelease;
}
