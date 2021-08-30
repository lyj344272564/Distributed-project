package user;

import com.lagou.entity.User;
import com.lagou.mapper.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class TestUser {

    @Autowired
    private UserDao userDao;

    @Test
    public void login() {
        User user = userDao.login("110", "123");
        System.out.println(user);
    }

    @Test
    public void checkPhone() {
        Integer integer = userDao.checkPhone("1101");
        System.out.println(integer);
    }

//    @Test
//    public void register() {
//        Integer integer = userDao.register("1144", "123");
//        System.out.println(integer);
//
//
//    }
}
