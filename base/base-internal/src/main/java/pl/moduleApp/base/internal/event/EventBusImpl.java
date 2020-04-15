package pl.moduleApp.base.internal.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import pl.moduleApp.base.external.event.EmailEvent;
import pl.moduleApp.base.external.EventBus;
import pl.moduleApp.base.external.event.UserEvent;

@Component
public class EventBusImpl implements EventBus {

    @Autowired
    ApplicationEventPublisher eventPublisher;

    @Override
    public void publishEmailEvent(EmailEvent e) {
        eventPublisher.publishEvent(e);
    }

    @Override
    public void publishUserEvent(UserEvent e) {
        eventPublisher.publishEvent(e);
    }

}
