package ds.demo.service.impl;
import ds.demo.entity.User;
import ds.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    public User getUserInfo(){
        User user = new User();
        user.setName("jack");
        user.setPassword("1212334");
        return user;
    }
}