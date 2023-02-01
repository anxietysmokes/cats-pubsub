package io.kosmoz.cats.service;

import io.kosmoz.cats.entity.logic.Topic;
import io.kosmoz.cats.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    TopicRepository topicRepository;

    public Topic getTopic(long topicId) {
        Optional<Topic> topic = topicRepository.findById(topicId);
        return topic.orElse(null);
    }
}
