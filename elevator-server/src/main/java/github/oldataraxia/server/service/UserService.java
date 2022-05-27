package github.oldataraxia.server.service;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import github.oldataraxia.server.Dao.UserDao;
import github.oldataraxia.server.entity.UserDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<String> listUser() {
        LambdaQueryChainWrapper<UserDo> query = userDao.lambdaQuery();
        List<UserDo> list = query.list();
        return list.stream().map(UserDo::getUserName).collect(Collectors.toList());
    }

    public boolean register (String username, String nfc) {
        LambdaQueryChainWrapper<UserDo> query = userDao.lambdaQuery();
        query.eq(UserDo::getUserName, username);
        UserDo userDo = query.one();
        if (userDo != null) {
            return false;
        } else {
            userDo = new UserDo();
            userDo.setUserName(username);
            userDo.setNfc(nfc);
            userDo.setSalt("oldataraxia");
            System.out.println(userDo);
            userDao.save(userDo);
            return true;
        }
    }

    public boolean card(String nfc) {
        LambdaQueryChainWrapper<UserDo> query = userDao.lambdaQuery();
        query.eq(UserDo::getNfc, nfc);

        UserDo userDo = query.one();
        return userDo != null;
    }
}