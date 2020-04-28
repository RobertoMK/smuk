package com.smuk.web.rest;

import com.smuk.domain.User;
import com.smuk.service.UserService;
import com.smuk.service.dto.UserListDTO;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class UserResource {
    private final Logger log = LoggerFactory.getLogger(User.class);

    private final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<Page<UserListDTO>> getAllUsers(@RequestBody UserListDTO userListDTO, @ApiParam Pageable pageable){
        log.debug("REST request to get a of Users");

        return new ResponseEntity<>(userService.findAllUsers(userListDTO,pageable),HttpStatus.OK);
    }
}
