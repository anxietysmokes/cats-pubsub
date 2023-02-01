package io.kosmoz.cats.repository;

import io.kosmoz.cats.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class CatRepository implements JpaRepository<Cat, Long> {
}
