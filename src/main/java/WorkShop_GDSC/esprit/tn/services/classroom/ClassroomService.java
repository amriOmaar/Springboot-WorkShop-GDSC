package WorkShop_GDSC.esprit.tn.services.classroom;


import WorkShop_GDSC.esprit.tn.entities.Classroom;
import WorkShop_GDSC.esprit.tn.repository.ClassroomRepository;
import WorkShop_GDSC.esprit.tn.services.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService implements IClassroomService, ICrudService<Classroom, Long> {


    @Autowired
    private ClassroomRepository classroomRepository;

    @Override
    public List<Classroom> getAll() {
        return classroomRepository.findAll();
    }

    @Override
    public Classroom add(Classroom classroom) throws Exception {
        if(classroomRepository.findByName(classroom.getName()) != null)
            throw new Exception("Classroom already exists");
        return classroomRepository.save(classroom);
    }

    @Override
    public Classroom update(Long id, Classroom classroom) {
        if(classroomRepository.findById(id).isPresent()){
            Classroom toUpdateClassroom = classroomRepository.findById(id).get();
            toUpdateClassroom.setName(classroom.getName());
            return classroomRepository.save(toUpdateClassroom);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        classroomRepository.deleteById(id);
    }

    @Override
    public Classroom findById(Long id) {
        return classroomRepository.findById(id).get();
    }

}
