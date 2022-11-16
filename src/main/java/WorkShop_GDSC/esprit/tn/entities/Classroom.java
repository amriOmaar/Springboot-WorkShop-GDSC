package WorkShop_GDSC.esprit.tn.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClassroom;

    @Column(unique = true)
    private String name;

    @OneToMany()
    @JoinColumn(name = "idClassroom")
    List<Student> students;

    public Classroom() {
    }

}
