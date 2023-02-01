package io.kosmoz.cats.controller;

import io.kosmoz.cats.data.EventBus;
import io.kosmoz.cats.entity.User;
import io.kosmoz.cats.entity.logic.Topic;
import io.kosmoz.cats.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    EventBus eventBus;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User newUser = userService.createUser(user);
        if (newUser == null) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> addSubscriber(@RequestBody long userId, @RequestBody long topicId) {
        eventBus.addSubscriber(userId, topicId);

        return null;
    }
}
