package com.bttc.work.web.mapper;

import com.bttc.work.web.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UsersMapper {
    @Select("select * from users")
    List<Users> select();
}
