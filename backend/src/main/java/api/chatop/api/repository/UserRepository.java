package api.chatop.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import api.chatop.api.model.DBUser;

@Repository
public interface UserRepository extends JpaRepository<DBUser, Integer> {
  DBUser findByUsername(String username);
}
