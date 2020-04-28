package com.smuk.repository;

import com.smuk.domain.User;
import com.smuk.service.dto.UserListDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User,Long>, JpaSpecificationExecutor<User> {

    @Query("SELECT new com.smuk.service.dto.UserListDTO(u.id, u.fullname, u.username, u.enabled,u.type) FROM User u"+
            " WHERE (:#{#filtro.fullname} IS NULL OR LOWER(u.fullname) LIKE LOWER(CONCAT(CONCAT('%', :#{#filtro.fullname}), '%')))" +
            " AND (:#{#filtro.username} IS NULL OR LOWER(u.username) LIKE LOWER(CONCAT(CONCAT('%', :#{#filtro.username}), '%')))" +
            " AND (:#{#filtro.enabled} IS NULL OR u.enabled = %:#{#filtro.enabled}%)" +
            " AND (:#{#filtro.type} IS NULL OR u.type = %:#{#filtro.type}%)")
    Page<UserListDTO> findAllUsers(@Param("filtro")UserListDTO userListDTO, Pageable pageable);
}
