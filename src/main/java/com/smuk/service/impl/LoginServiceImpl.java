package com.smuk.service.impl;

import com.smuk.repository.LoginRepository;
import com.smuk.service.LoginService;
import com.smuk.service.dto.UserLoginDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class LoginServiceImpl implements LoginService {

    private final LoginRepository loginRepository;

    @Override
    public Optional<UserLoginDTO> findUser(String cnpj, String password) {
        return loginRepository.findUser(cnpj, password);
    }
}
