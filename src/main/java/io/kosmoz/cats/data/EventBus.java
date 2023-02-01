package io.kosmoz.cats.data;

import io.kosmoz.cats.entity.Cat;
import io.kosmoz.cats.entity.User;
import io.kosmoz.cats.entity.logic.Topic;
import io.kosmoz.cats.repository.CatRepository;
import io.kosmoz.cats.service.TopicService;
import io.kosmoz.cats.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Hashtable;
import java.util.List;

@Component
@Scope("singleton")
public class EventBus {

    @Autowired
    UserService userService;

    @Autowired
    TopicService topicService;

    @Autowired
    CatRepository catRepository;

    private Hashtable<Topic, List<User>> userTopicTable;

    public Cat addMessage(Cat cat) {
        return catRepository.save(cat);
    }

//    public void registerUser(Topic t, User u) {
//        userTopicTable.get(t).add(u);
//    }

    public void addSubscriber(long userId, long topicId) {
        User user = userService.getUser(userId);
        Topic topic = topicService.getTopic(topicId);
    }
}
