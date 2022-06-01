package github.oldataraxia.server.Dao;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import github.oldataraxia.server.Dao.Mapper.UserMapper;
import github.oldataraxia.server.Entity.UserDo;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends ServiceImpl<UserMapper, UserDo> {
}
