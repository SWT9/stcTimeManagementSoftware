package swt.accessingdatamysql.thirdTry;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import swt.accessingdatamysql.VacationTime;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface VacationTimeRepository extends CrudRepository<VacationTime, Integer>{
    VacationTime findById(int id);

    List<VacationTime> findAllByUserId(int userId);
}





