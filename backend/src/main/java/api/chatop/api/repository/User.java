package api.chatop.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import api.chatop.api.model.users;

@Repository
interface UserRepository extends CrudRepository<users, Integer> {

}
