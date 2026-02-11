package com.edtechadmin.edtech_admin.service;

import com.edtechadmin.edtech_admin.entity.User;

public interface UserService {

    User loadUserByEmail(String email);
    User createUser(String email, String password);
    void assignRoleToUser(String email, String roleName);
    boolean doesCurrentUserHasRole(String roleName);
}

