package jp.co.exam.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class ViewController {

	@GetMapping("/authControl")
	public String authControl(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "http://localhost:8080");
		response.setHeader("Access-Control-Allow-Headers", "Access-Control-Allow-Origin, Authorization, Origin, x-requested-with, Content-Type");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("Cache-Control", "no-store");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("X-Frame-Options", "SAMEORIGIN");
		response.setHeader("Strict-Transport-Security", "max-age=10886400");
		response.setHeader("X-Content-Type-Options", "nosniff");
		return "authControl";
	}

	@GetMapping("/noLockOut")
	public String noLockOut(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "http://localhost:8080");
		response.setHeader("Access-Control-Allow-Headers", "Access-Control-Allow-Origin, Authorization, Origin, x-requested-with, Content-Type");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("Cache-Control", "no-store");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("X-Frame-Options", "SAMEORIGIN");
		response.setHeader("Strict-Transport-Security", "max-age=10886400");
		response.setHeader("X-Content-Type-Options", "nosniff");
		return "noLockOut";
	}

	@GetMapping("/crossDomain")
	public String crossDomain(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Headers", "Access-Control-Allow-Origin, Authorization, Origin, x-requested-with, Content-Type");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("Cache-Control", "no-store");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("X-Frame-Options", "SAMEORIGIN");
		response.setHeader("Strict-Transport-Security", "max-age=10886400");
		response.setHeader("X-Content-Type-Options", "nosniff");
		return "crossDomain";
	}

	@GetMapping("/localCache")
	public String localCache(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Headers", "Access-Control-Allow-Origin, Authorization, Origin, x-requested-with, Content-Type");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("X-Frame-Options", "SAMEORIGIN");
		response.setHeader("Strict-Transport-Security", "max-age=10886400");
		response.setHeader("X-Content-Type-Options", "nosniff");
		return "localCache";
	}

	@GetMapping("/clickJacking")
	public String clickJacking(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "http://localhost:8080");
		response.setHeader("Access-Control-Allow-Headers", "Access-Control-Allow-Origin, Authorization, Origin, x-requested-with, Content-Type");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("Cache-Control", "no-store");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Strict-Transport-Security", "max-age=10886400");
		response.setHeader("X-Content-Type-Options", "nosniff");
		return "clickJacking";
	}

	@GetMapping("/strictTransportSecurity")
	public String strictTransportSecurity(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "http://localhost:8080");
		response.setHeader("Access-Control-Allow-Headers", "Access-Control-Allow-Origin, Authorization, Origin, x-requested-with, Content-Type");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("Cache-Control", "no-store");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("X-Frame-Options", "SAMEORIGIN");
		response.setHeader("X-Content-Type-Options", "nosniff");
		return "strictTransportSecurity";
	}

	@GetMapping("/xContentTypeOptions")
	public String xContentTypeOptions(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "http://localhost:8080");
		response.setHeader("Access-Control-Allow-Headers", "Access-Control-Allow-Origin, Authorization, Origin, x-requested-with, Content-Type");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("Cache-Control", "no-store");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("X-Frame-Options", "SAMEORIGIN");
		response.setHeader("Strict-Transport-Security", "max-age=10886400");
		return "xContentTypeOptions";
	}

	@GetMapping("/errorMessage")
	public String errorMessage(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "http://localhost:8080");
		response.setHeader("Access-Control-Allow-Headers", "Access-Control-Allow-Origin, Authorization, Origin, x-requested-with, Content-Type");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("Cache-Control", "no-store");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("X-Frame-Options", "SAMEORIGIN");
		response.setHeader("Strict-Transport-Security", "max-age=10886400");
		response.setHeader("X-Content-Type-Options", "nosniff");
		return "errorMessage";
	}

	@GetMapping("/security")
	public String security(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "http://localhost:8080");
		response.setHeader("Access-Control-Allow-Headers", "Access-Control-Allow-Origin, Authorization, Origin, x-requested-with, Content-Type");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("Cache-Control", "no-store");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("X-Frame-Options", "SAMEORIGIN");
		response.setHeader("Strict-Transport-Security", "max-age=10886400");
		response.setHeader("X-Content-Type-Options", "nosniff");
		return "security";
	}
}
