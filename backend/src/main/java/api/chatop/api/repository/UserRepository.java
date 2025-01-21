package api.chatop.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import api.chatop.api.model.users;

@Repository
public interface UserRepository extends JpaRepository<users, Integer> {
  users findByUsername(String username);
}
