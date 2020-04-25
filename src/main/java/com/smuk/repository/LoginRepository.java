package com.smuk.repository;

import com.smuk.domain.User;
import com.smuk.service.dto.UserLoginDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface LoginRepository extends JpaRepository<User,Long> , JpaSpecificationExecutor<User> {

    @Query("SELECT new com.smuk.service.dto.UserLoginDTO(u.id, u.fullname, u.username) " +
            "FROM User u WHERE u.username =:username  AND u.password =:password")
    Optional<UserLoginDTO> findUser(@Param("username") String username, @Param("password") String password);
}
