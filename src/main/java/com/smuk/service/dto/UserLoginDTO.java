package com.smuk.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String fullname;

    private String username;
}
