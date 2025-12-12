package entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Repository
@TableName("user_history")
public class UserHistory {

    private int id;
    private int userId;
    private int apartmentId;
    private Date date;


}
