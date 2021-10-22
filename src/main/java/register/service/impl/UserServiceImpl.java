package register.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import register.entity.User;
import register.mapper.userMapper;
import register.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    userMapper mapper;
    public void addUser(String name, String password, int phone) {
        User user = new User(name,password,phone);
        mapper.addUser(user);
    }
    public List<User> queryByName(String name){
        List <User> userList = mapper.queryByName(name);
        return userList;
    }
}
