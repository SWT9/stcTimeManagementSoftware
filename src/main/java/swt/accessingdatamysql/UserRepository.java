package swt.accessingdatamysql;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import swt.accessingdatamysql.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete


public interface UserRepository extends CrudRepository<User, Integer> {

   // @Query("SELECT u FROM user u where u.username = ?")
   // User findNameByUsername(String username);

    User findByUsername(String username);
}
