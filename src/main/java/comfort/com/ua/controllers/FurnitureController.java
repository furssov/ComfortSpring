package comfort.com.ua.controllers;

import comfort.com.ua.repos.FurnitureTypeOfOrderRepository;
import comfort.com.ua.services.FurnitureTypeOfOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/furniture")
public class FurnitureController {

    @Autowired
    private FurnitureTypeOfOrderService furnitureTypeOfOrderService;

    @GetMapping("/{id}")
    public String pullingPage(@PathVariable long id, Model model)
    {
        model.addAttribute("furnitureOrders", furnitureTypeOfOrderService.findByOrderId(id));
        return "furniture-types-of-order";
    }



}
