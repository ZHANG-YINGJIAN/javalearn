package model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_teacher")
public class Teacher {
    private long TeaId;
    private String name;

    public Teacher() {
    }

    @Id
    @GeneratedValue(generator = "_native")
    @GenericGenerator(name="_native",strategy = "native")
    public long getTeaId() {
        return TeaId;
    }

    public void setTeaId(long TeaId) {
        this.TeaId = TeaId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "TeaId=" + TeaId +
                ", name='" + name + '\'' +
                '}';
    }
}
