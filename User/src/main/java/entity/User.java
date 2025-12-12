package entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import org.springframework.stereotype.Repository;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Repository
//@TableName(value = "user", resultMap = "")
public class User {

    private String id;
    private String phone;
    private String password;
    private String name;
    private UserStatus status;

    //参数校验


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", status=" + status.name() + ": " +status.getStatus() +
                '}';
    }
}
