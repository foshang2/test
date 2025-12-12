package controller;

import entity.User;
import entity.UserStatus;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
//@Controller
public class UserOperation {

    @Autowired
    private UserMapper userMapper1;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("selectAllUser")
    public LinkedList<User> selectAllUser(){

        LinkedList<User> users = userMapper.selectAllUser();
        users.forEach(System.out::println);
        return users;
    }

    @GetMapping("selectAllUserPlus")
    public List<User> selectAllUser1(){
        List<User> users = userMapper.selectList(null);

        users.forEach(System.out::println);
        return users;
    }


    @PostMapping("addUser")
    public void addUser(@RequestBody User user){
        user.setStatus(UserStatus.ACTIVATE);
        System.out.println(user);
        userMapper.addUser(user);
    }



}
