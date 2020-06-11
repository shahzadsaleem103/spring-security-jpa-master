package io.javabrains.springsecurityjpa;

import org.springframework.data.jpa.repository.JpaRepository;

import io.javabrains.springsecurityjpa.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
