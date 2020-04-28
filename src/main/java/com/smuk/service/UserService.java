package com.smuk.service;

import com.smuk.service.dto.UserListDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface UserService {

    Page<UserListDTO> findAllUsers( UserListDTO userListDTO, Pageable pageable);

}
