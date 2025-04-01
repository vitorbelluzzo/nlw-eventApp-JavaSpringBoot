package br.com.ventidue.events.repository;

import br.com.ventidue.events.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {
    public User findByEmail(String email);

}
