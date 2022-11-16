package WorkShop_GDSC.esprit.tn.services.classroom;


import WorkShop_GDSC.esprit.tn.entities.Classroom;
import WorkShop_GDSC.esprit.tn.services.ICrudService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService implements IClassroomService, ICrudService<Classroom, Long> {
    @Override
    public List<Classroom> getAll() {
        return null;
    }

    @Override
    public Classroom add(Classroom class1) throws Exception {
        return null;
    }

    @Override
    public Classroom update(Long aLong, Classroom class1) throws Exception {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public Classroom findById(Long id) {
        return null;
    }
}
