package org.senayinan.carbcounter.data;

import org.senayinan.carbcounter.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}
