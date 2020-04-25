package com.smuk.web.rest;

import com.smuk.service.LoginService;
import com.smuk.service.dto.UserLoginDTO;
import com.smuk.util.ResponseUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class LoginResource {
    private final LoginService loginService;

    @GetMapping("/login/{username},{password}")
    public ResponseEntity<UserLoginDTO> login(@PathVariable String username, @PathVariable String password){
        log.debug("REST request to get user");

        return ResponseUtil.wrapOrNotFound(loginService.findUser(username, password));
    }
}
