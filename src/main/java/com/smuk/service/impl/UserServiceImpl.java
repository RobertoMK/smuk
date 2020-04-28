package com.smuk.service.impl;


import com.smuk.repository.UserRepository;
import com.smuk.service.UserService;
import com.smuk.service.dto.UserListDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public Page<UserListDTO> findAllUsers(UserListDTO userListDTO, Pageable pageable) {
        return userRepository.findAllUsers(userListDTO, pageable);
    }
}
