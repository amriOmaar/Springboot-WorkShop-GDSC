package WorkShop_GDSC.esprit.tn.repository;

import WorkShop_GDSC.esprit.tn.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByEmail(String email);
}
