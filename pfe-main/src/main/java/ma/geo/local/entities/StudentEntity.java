package ma.geo.local.entities;

import javax.persistence.*;

// @Embeddable @EmbeddedId
@Entity
public class StudentEntity {
    @Id
    @Column(name="id")
    private Long id;

    @Column(name = "name_student")
    private String name;

    @Column(name= "student_adresse")
    private String adresse;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
