package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("user")



public class UserController {
    @GetMapping

    public String displayAddUserForm() {
        return "/user/add";
    }

    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        if(user.getPassword().equals(verify)){
            return "user/index.html";
        } else {
            return this.displayAddUserForm();
        }
    }


}
