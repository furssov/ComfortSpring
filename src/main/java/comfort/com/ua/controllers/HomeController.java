package comfort.com.ua.controllers;

import comfort.com.ua.repos.TypeOfOrderRepository;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class HomeController {

    @Autowired
    private TypeOfOrderRepository typeOfOrderRepository;

    @GetMapping("/")
    public String homePage(Model model)
    {
        log.info("Home page has been visited");
        model.addAttribute("types", typeOfOrderRepository.findAll());
        return "home";
    }



}
