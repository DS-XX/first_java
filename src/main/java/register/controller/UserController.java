package register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import register.entity.Response;
import register.entity.User;
import register.service.UserService;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Response register(@RequestBody Map<String, String> person) {
        String name = person.get("username");
        String password = person.get("password");
        int phone = Integer.parseInt(person.get("phone"));
        if (name != "" && password != "" && phone > 0) {
            List<User> users = service.queryByName(name);
            return new Response("1",1,false,users.get(0));
//            if(users!=null && users.size()>0){
//                return new Response("注册失败，用户名重复,请更换",-1,false);
//            }
//            else {
//                service.addUser(name,password,phone);
//                return new Response("注册成功",1,true);
//            }
//        }
//        else{
//            return new Response("检查输入是否为空",-1,false);
//        }
        }
        List<User> users = service.queryByName("username");
        return new Response("登陆成功", 1, true, users.get(0));
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Response login(@RequestBody Map<String, String> person) {
        String username = person.get("username");
        String password = person.get("password");
        System.out.println(username + password);
        //1. 判断用户名、密码是否为空
        if (username != null && password != null) {
            List<User> users = service.queryByName(username);
            System.out.println(users);
            //2. 判断用户名是否存在
            if (users != null && users.size() > 0) {
                User user = users.get(0);
                //3. 判断密码是否正确
                if (password.equals(user.getPassword())) {
                    return new Response("登陆成功", 1, true,user);
                }
//                else {
//                    return new Response("登录失败,密码错误",-1,false);
//                }
//            }else {
//                return new Response("用户不存在",-1,false);
//            }
//        }else {
//            return new Response("登陆失败，请检查用户名、密码是否为空",-1,false);
//        }
            }
        }
        List<User> users = service.queryByName(username);
        return new Response("登陆成功", 1, true, users.get(0));
    }}
