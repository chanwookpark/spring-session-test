package server1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by chanwook on 2015. 1. 30..
 */
@Controller
public class MainController {
    private final Logger logger = LoggerFactory.getLogger(MainController.class);

    @RequestMapping("/")
    public String main(HttpSession session,
                       @RequestParam(value = "v", required = false) String message) {
        if (StringUtils.hasText(message)) {
            session.setAttribute("key", message);
        }
        logger.info("Server1 Session Value: {}", session.getAttribute("key"));
        return "main";
    }
}
