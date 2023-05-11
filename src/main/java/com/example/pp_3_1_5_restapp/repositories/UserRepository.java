package com.example.pp_3_1_5_restapp.repositories;

import com.example.pp_3_1_5_restapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Интерфейс репозитория с CRUD-операциями и дополнительным методом
 * для поиска учетной записи по email пользователя.
 * Spring Data JPA автоматически генерирует реализацию интерфейса во время выполнения.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
