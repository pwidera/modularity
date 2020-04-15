package pl.moduleApp.mn.infra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.moduleApp.base.external.event.EmailEvent;
import pl.moduleApp.base.external.EventBus;
import pl.moduleApp.base.external.event.UserEvent;
import pl.moduleApp.mn.domain.UserNotificationLogic;

@Component
public class EmailListener {

    @Autowired
    EventBus eventBus;

    @EventListener
    public void handleUserEvent(UserEvent userEvent) {
        UserNotificationLogic logic = new UserNotificationLogic();
        EmailEvent emailEvent = logic.generateMessageForCustomer(userEvent);
        eventBus.publishEmailEvent(emailEvent);
    }

}
