package br.com.ventidue.events.service;

import br.com.ventidue.events.SubscriptionRepository;
import br.com.ventidue.events.model.Event;
import br.com.ventidue.events.model.Subscription;
import br.com.ventidue.events.model.User;
import br.com.ventidue.events.repository.EventRepo;
import br.com.ventidue.events.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class SubscriptionService {

    @Autowired
    private EventRepo eventRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    public Subscription createNewSubscription(String eventName, User user) {
        Subscription subs = new Subscription();
        Event evt = eventRepo.findByPrettyName(eventName);
        user = userRepo.save(user);
        subs.setEvent(evt);
        subs.setSubscriber(user);
        return subscriptionRepository.save(subs);
    }
}
