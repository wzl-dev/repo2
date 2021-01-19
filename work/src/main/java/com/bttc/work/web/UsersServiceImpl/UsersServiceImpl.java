package com.bttc.work.web.UsersServiceImpl;

import com.bttc.work.web.UsersService.UsersService;
import com.bttc.work.web.mapper.UsersMapper;
import com.bttc.work.web.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.ws.ServiceMode;
import java.util.List;
@Service
public class UsersServiceImpl  implements UsersService {
   @Resource
    private UsersMapper usersMapper;
    @Override
    public List<Users> sel() {
        return usersMapper.select();
    }
}
