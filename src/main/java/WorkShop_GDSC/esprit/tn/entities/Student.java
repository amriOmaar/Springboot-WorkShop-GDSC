package WorkShop_GDSC.esprit.tn.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStudent;

    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String email;


    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ManyToOne()
    @JoinColumn(name = "idClassroom")
    @JsonIgnoreProperties({"students"})
    private Classroom classroom;



    public Student() {

    }
}
