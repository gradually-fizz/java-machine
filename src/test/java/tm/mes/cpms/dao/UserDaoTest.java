package tm.mes.cpms.dao;

import tm.mes.cpms.bean.MainMenu;
//import com.naughty.userlogin02.dao.MenuDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserDaoTest {

    @Autowired
    UserDao userDao;
    @Autowired
    MenuDao menuDao;

    @Test
    void contextLoads() {
        List<MainMenu> mainMenus = menuDao.getMainMenus();
        for (MainMenu mm:mainMenus) {
            System.out.println(mm);
        }
    }

}
