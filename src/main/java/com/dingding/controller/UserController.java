package com.dingding.controller;
import com.dingding.entity.Response;
import com.dingding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xpwu on 2019/6/18.
 */
@RestController
public class UserController {
    @Autowired
    private UserService service;
    @RequestMapping(value = "addUserInfo",method = RequestMethod.GET)
    public Response addUserInfo(){
        service.addUserInfo();
        Response res = new Response();
        res.setMsg("添加成功");
        res.setCode(1);
        return res;
    }
}
