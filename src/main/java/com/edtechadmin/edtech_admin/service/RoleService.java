package com.edtechadmin.edtech_admin.service;

import com.edtechadmin.edtech_admin.entity.Role;

public interface RoleService {
    Role loadRoleByName(String roleName);
    Role createRole(String roleName);
}

