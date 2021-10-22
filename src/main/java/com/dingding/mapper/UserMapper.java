package com.dingding.mapper;
import com.dingding.entity.User;
import org.springframework.stereotype.Repository;
/**
 * Created by xpwu on 2019/6/27.
 */
@Repository
public interface UserMapper{
    int addUserInfo(User user);
}
