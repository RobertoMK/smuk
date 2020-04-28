package com.smuk.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserListDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String fullname;

    private String username;

    private Boolean enabled;

    private String type;
}
