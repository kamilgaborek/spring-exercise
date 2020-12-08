package schoolexcercise.demo.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import schoolexcercise.demo.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {
}
