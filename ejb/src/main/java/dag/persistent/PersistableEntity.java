package dag.persistent;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by maxisoft on 27/11/2015.
 */
@Entity
public class PersistableEntity {
    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "PersistableEntity{" +
                "id=" + id +
                '}';
    }
}
