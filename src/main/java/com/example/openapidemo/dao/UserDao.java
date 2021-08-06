package com.example.openapidemo.dao;

import com.example.openapidemo.model.User;
import com.example.openapidemo.model.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    User getUserById(@Param("id") int id);

    User getUserByEmail(@Param("email") String email);

    UserInfo getUserInfoByEmail(@Param("email") String email);
}
