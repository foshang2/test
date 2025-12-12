import mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


public class TwoTest {

    private UserMapper userMapper;

    @Test
    public void test1(){
        userMapper.selectAllUser().forEach(System.out::println);
    }


}
