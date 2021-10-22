package register.mapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import register.entity.User;

import java.util.List;

@Repository
@Mapper
public interface userMapper {
    void addUser(User user);
    List<User> queryByName(String name);
}
