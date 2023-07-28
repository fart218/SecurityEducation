package jp.co.exam.common;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorPageController implements ErrorController {
    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error(HttpServletRequest request) {
    	Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        if(status != null){
            int statusCode = Integer.valueOf(status.toString());
            return "/errorPage?" + "code=" + statusCode;
        }
        return "/errorPage";
    }
}