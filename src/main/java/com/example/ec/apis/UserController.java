package com.example.ec.apis;

import com.example.ec.entities.Role;
import com.example.ec.entities.User;
import com.example.ec.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/client/login")
    public String login(@RequestParam(value="username") String username, @RequestParam(value="password") String password) {
        return "client login";
    }

    @RequestMapping("/client/register")
    public String register(@RequestParam(value="username") String username, @RequestParam(value="password") String password){
        //first name and last name
        //password
        //email
        //phone number
        User user = userService.getByUserName(username);
        if(user == null) {
            user = new User();
            user.setUsername(username);
            user.setPassword(password);
            List<Role> roles = Arrays.asList(new Role("USER"), new Role("CLIENT"));
            user.setActive(true);
            user.setRoles(roles);
            userService.save(user);

            return "{status: 'created'}";
        } else {
            return "{status: 'exists'}";
        }


    }
}
