package com.smuk.service;

import com.smuk.service.dto.UserLoginDTO;

import java.util.Optional;

public interface LoginService {

    Optional<UserLoginDTO> findUser(String cnpj, String password);
}
