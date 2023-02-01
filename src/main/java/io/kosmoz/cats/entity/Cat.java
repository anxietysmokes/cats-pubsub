package io.kosmoz.cats.entity;

import io.kosmoz.cats.entity.logic.Topic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String caption;
    private byte[] image;
    private User user;
    private List<Topic> topicList;
}
