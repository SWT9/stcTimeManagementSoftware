package swt.accessingdatamysql;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface SicknessTimeRepository extends CrudRepository<SicknessTime, Integer>{
    SicknessTime findById(int id);

    List<SicknessTime> findAllByUserId(int userId);
}

