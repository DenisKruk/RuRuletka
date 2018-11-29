package ruRuletka.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ruRuletka.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
