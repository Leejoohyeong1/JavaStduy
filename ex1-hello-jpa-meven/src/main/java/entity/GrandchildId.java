package entity;

import java.io.Serializable;

public class GrandchildId implements Serializable {

    private Child child;
    private Long id;
    // equals hashCode code...
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GrandchildId)) return false;

        GrandchildId that = (GrandchildId) o;

        if (!child.equals(that.child)) return false;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        int result = child.hashCode();
        result = 31 * result + id.hashCode();
        return result;
    }
}
