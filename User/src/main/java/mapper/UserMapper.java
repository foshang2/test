package mapper;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.LinkedList;
import java.util.List;


//@Mapper
public interface UserMapper  extends BaseMapper<User> {

    LinkedList<User> selectAllUser();

    void addUser(User user);

}
