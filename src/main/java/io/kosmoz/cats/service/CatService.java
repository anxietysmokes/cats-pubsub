package io.kosmoz.cats.service;

import io.kosmoz.cats.data.EventBus;
import io.kosmoz.cats.entity.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatService {

    @Autowired
    EventBus eventBus;

    public Cat createCat(Cat cat) {
        return eventBus.addMessage(cat);
    }
}
