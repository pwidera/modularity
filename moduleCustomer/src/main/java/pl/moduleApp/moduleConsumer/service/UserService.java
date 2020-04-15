package pl.moduleApp.moduleConsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.moduleApp.base.external.EventBus;
import pl.moduleApp.base.external.event.UserEvent;
import pl.moduleApp.moduleConsumer.entity.UserEntity;
import pl.moduleApp.moduleConsumer.repository.UserRepository;

@Component
public class UserService {

    @Autowired
    EventBus eventBus;

    @Autowired
    UserRepository userRepository;

    public void processNewUser(String email) {
        userRepository.save(new UserEntity(email));
        eventBus.publishUserEvent(new UserEvent(email));
    }
}
