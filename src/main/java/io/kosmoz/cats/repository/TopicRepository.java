package io.kosmoz.cats.repository;

import io.kosmoz.cats.entity.logic.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class TopicRepository implements JpaRepository<Topic, Long> {
}
