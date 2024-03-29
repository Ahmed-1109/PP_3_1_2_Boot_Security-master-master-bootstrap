package ru.kata.spring.boot_security.demo.repositories;

import ru.kata.spring.boot_security.demo.models.Role;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface RoleRepository {
    void addRole(Role role);

    Optional<Role> getRoleByName(String name);

    List<Role> getRoles();

    Set<Role> getRoleByNames(Set<String> roleNames);

    Optional<Role> getRoleById(Long id);
}
