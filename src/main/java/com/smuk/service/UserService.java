package com.smuk.service;

import com.smuk.service.dto.UserListDTO;

import java.util.List;


public interface UserService {

    List<UserListDTO> findAllUsers();

}
