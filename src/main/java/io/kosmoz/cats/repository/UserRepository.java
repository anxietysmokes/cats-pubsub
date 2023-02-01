package io.kosmoz.cats.repository;

import io.kosmoz.cats.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class UserRepository implements JpaRepository<User, Long> {
}
