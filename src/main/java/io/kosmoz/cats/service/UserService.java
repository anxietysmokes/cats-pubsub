package io.kosmoz.cats.service;

import io.kosmoz.cats.data.EventBus;
import io.kosmoz.cats.entity.User;
import io.kosmoz.cats.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUser(long userId) {
        Optional<User> user = userRepository.findById(userId);
        return user.orElse(null);
    }
}
