package swt.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

import swt.accessingdatamysql.thirdTry.WorkHours;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface WorkHoursRepository extends CrudRepository<WorkHours, Integer>{
    
    String findById(int id);
}

