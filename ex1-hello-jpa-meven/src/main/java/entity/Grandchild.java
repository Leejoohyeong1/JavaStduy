package entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@IdClass(GrandchildId.class)
public class Grandchild {
    @Id
    @ManyToOne
    @JoinColumns(value = {
              @JoinColumn(name = "PARENT_ID")
            , @JoinColumn(name = "CHILD_ID")
    },
    foreignKey = @ForeignKey(name = "GRANDCHILD_FK"))
    private Child child;

    @Id
    @GeneratedValue
    @Column(name = "GRANDCHILD_ID")
    private Long id;

    private String name;

    public Grandchild(Child child, String name) {
        this.child = child;
        this.name = name;
    }
}
