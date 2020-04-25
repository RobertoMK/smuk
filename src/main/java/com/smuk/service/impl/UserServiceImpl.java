package com.smuk.service.impl;


import com.smuk.repository.UserRepository;
import com.smuk.service.UserService;
import com.smuk.service.dto.UserListDTO;
import com.smuk.service.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    @Override
    public List<UserListDTO> findAllUsers() {
        return userMapper.toListDto(userRepository.findAll());
    }
}
