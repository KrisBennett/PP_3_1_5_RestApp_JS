package com.example.pp_3_1_5_restapp.repositories;

import com.example.pp_3_1_5_restapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
