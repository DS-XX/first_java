package ds.demo.controller;

import ds.demo.entity.User;
import ds.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService service;
    @RequestMapping(    value = "/getUserItem",method = RequestMethod.GET)
    public String getUserItem(){
        User user = service.getUserInfo();
        System.out.println(user.getName());
        return user.toString();
    }
}