package controller;

import entity.UserHistory;
import mapper.UserHistoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserHistoryOperation {

    @Autowired
    private UserHistoryMapper userHistoryMapper;

    @GetMapping("selectAllUserHistory")
    public List<UserHistory> selectAllUserHistory(){
        List<UserHistory> usersHistory = userHistoryMapper.selectList(null);
        usersHistory.forEach(System.out::println);
        return usersHistory;
    }
}
