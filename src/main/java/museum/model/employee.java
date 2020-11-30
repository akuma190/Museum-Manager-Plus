package museum.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class employee {
    @Id@GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="staff_id")
    int staffid;
    @Column(name="staff_name")
    String staffname;
    @Column(name="creation_date")
    String creationdate;
    String role;

}
