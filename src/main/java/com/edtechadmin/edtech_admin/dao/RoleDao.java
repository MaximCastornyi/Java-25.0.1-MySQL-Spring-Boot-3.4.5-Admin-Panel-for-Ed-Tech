package com.edtechadmin.edtech_admin.dao;

import com.edtechadmin.edtech_admin.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
