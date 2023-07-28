package jp.co.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class SecurityExamApplication {
	public static void main(String[] args) {
		SpringApplication.run(SecurityExamApplication.class, args);
	}
}
