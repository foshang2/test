import entity.User;
import entity.UserStatus;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import controller.UserOperation;

import java.util.LinkedList;

@SpringBootTest(classes = ApplicationStart.class)
class OneTest {

    @MockBean
    private UserOperation userOperation;

    @Test
    public void testUserOperation(){

        LinkedList<User> users = new LinkedList<>();
        users.add(new User("1", "2", "3", "4", UserStatus.ACTIVATE));

        Mockito.when(userOperation.selectAllUser()).thenReturn(users);

        userOperation.selectAllUser().forEach(System.out::println);

    }

}
