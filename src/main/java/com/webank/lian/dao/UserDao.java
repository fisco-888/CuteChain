package com.webank.lian.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.webank.lian.domain.User;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {
    
    int insert(@Param("user") User user);

    User getUserByName(@Param("name") String name);
    
    User getUserByIdentification(@Param("identification") String identification);
    
    User getUserById(@Param("Id") Integer id);
}
