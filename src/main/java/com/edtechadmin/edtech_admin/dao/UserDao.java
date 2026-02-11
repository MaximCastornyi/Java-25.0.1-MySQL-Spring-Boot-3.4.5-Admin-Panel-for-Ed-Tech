package com.edtechadmin.edtech_admin.dao;

import com.edtechadmin.edtech_admin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
