package entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

public class ChildId implements Serializable {

    private  Parent parent;
    private  Long id;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChildId)) return false;

        ChildId childId1 = (ChildId) o;

        if (!parent.equals(childId1.parent)) return false;
        return id.equals(childId1.id);
    }

    @Override
    public int hashCode() {
        int result = parent.hashCode();
        result = 31 * result + id.hashCode()
        return result;
    }
}
