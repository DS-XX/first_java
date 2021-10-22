package register.service;

import register.entity.User;

import java.util.List;

public interface UserService {
    void addUser(String name,String password,int phone);
    List<User> queryByName(String name);
}
