package entity;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.stream.Collectors;

@Repository
@Getter
public enum UserStatus {

    ACTIVATE(1),
    UNACTIVATE(2);


    @EnumValue
    private final Integer status;


    UserStatus(Integer i) {
        this.status = i;
    }

    public static UserStatus transition(int status){
        return Arrays.stream(UserStatus.values()).filter((userStatus)->{
            return userStatus.getStatus() == status;
        }).collect(Collectors.toList()).get(0);
    }

}
