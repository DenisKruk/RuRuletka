package ruRuletka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ruRuletka.model.User;
import ruRuletka.repo.UserRepo;


import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private UserRepo usertRepo;
    @GetMapping("/")
    public String main(Map<String,Object> model){
        Iterable<User> users = usertRepo.findAll();
        model.put("users", users);
        return "main";
    }
}
