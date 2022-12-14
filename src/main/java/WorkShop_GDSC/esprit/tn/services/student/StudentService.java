package WorkShop_GDSC.esprit.tn.services.student;


import WorkShop_GDSC.esprit.tn.entities.Student;
import WorkShop_GDSC.esprit.tn.repository.StudentRepository;
import WorkShop_GDSC.esprit.tn.services.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService, ICrudService<Student, Long> {


    @Autowired
    StudentRepository studentRepository;


    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student add(Student student) throws Exception {
        if(studentRepository.findByEmail(student.getEmail()) != null)
            throw new Exception("Student already exists");
        return studentRepository.save(student);
    }

    @Override
    public Student update(Long id, Student student) {
        if (studentRepository.findById(id).isPresent()) {
            Student toUpdateStudent = studentRepository.findById(id).get();
            toUpdateStudent.setFirstName(student.getFirstName());
            toUpdateStudent.setLastName(student.getLastName());
            toUpdateStudent.setEmail(student.getEmail());
            toUpdateStudent.setGender(student.getGender());
            return studentRepository.save(toUpdateStudent);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).get();
    }
}
