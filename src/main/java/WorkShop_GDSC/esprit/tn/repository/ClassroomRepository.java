package WorkShop_GDSC.esprit.tn.repository;

import WorkShop_GDSC.esprit.tn.entities.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {

    Classroom findByName(String name);

}
