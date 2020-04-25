package com.smuk.service.mapper;



import com.smuk.domain.User;
import com.smuk.service.dto.UserListDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface UserMapper {

    List<UserListDTO> toListDto(List<User> entity);
}
