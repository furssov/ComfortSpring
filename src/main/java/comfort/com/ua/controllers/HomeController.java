package comfort.com.ua.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
@Slf4j
public class HomeController {


    @GetMapping
    public String homePage()
    {
        log.info("Home page has been visited");
        return "home";
    }



}