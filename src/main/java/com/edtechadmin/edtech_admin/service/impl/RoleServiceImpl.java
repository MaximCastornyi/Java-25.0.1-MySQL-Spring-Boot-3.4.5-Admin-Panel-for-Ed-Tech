package com.edtechadmin.edtech_admin.service.impl;

import com.edtechadmin.edtech_admin.dao.RoleDao;
import com.edtechadmin.edtech_admin.entity.Role;
import com.edtechadmin.edtech_admin.service.RoleService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    private RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role loadRoleByName(String roleName) {
        return roleDao.findByName(roleName);
    }

    @Override
    public Role createRole(String roleName) {
        return roleDao.save(new Role(roleName));
    }
}
