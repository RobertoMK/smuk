package com.smuk.web.rest;

import com.smuk.domain.User;
import com.smuk.service.UserService;
import com.smuk.service.dto.UserListDTO;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class UserResource {
    private final Logger log = LoggerFactory.getLogger(User.class);

    private static final String ENTITY_NAME = "user";

    private final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<UserListDTO>> getAllUsers(){
        log.debug("REST request to get a of Users");
        return new ResponseEntity<>(userService.findAllUsers(),HttpStatus.OK);
    }
}
