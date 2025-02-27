package br.com.ventidue.events.repository;

import br.com.ventidue.events.model.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepo extends CrudRepository <Event, Integer> {
}
