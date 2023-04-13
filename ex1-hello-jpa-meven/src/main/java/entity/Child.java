package entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@IdClass(ChildId.class)
public class Child {

    @Id
    @ManyToOne
    @JoinColumn(name = "PARENT_ID"
              , foreignKey = @ForeignKey(name = "CHILD_FK")
    )
    private  Parent parent;

    @Id
    @GeneratedValue
    @Column(name = "CHILD_ID")
    private  Long id;

    private String name;

    public Child(Parent parent, String name) {
        this.parent = parent;
        this.name = name;
    }
}
