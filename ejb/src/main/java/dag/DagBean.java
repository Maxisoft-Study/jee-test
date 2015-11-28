package dag;

import dag.persistent.PersistableEntity;
import jytravaille.Common;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless(name = "DagEJB")
public class DagBean implements Dag {

    @PersistenceContext(unitName = "myapp")
    EntityManager em;

    public DagBean() {
    }

    @Override
    public String sayHey() {
        Common common = new Common();
        PersistableEntity entity = em.find(PersistableEntity.class, 1L);
        if (entity == null) {
            entity = new PersistableEntity();
            em.persist(entity);
        }
        return "EJB says hey.\nVia EJB: " + common.sayHey() + "\nUsing persistence " + entity;
    }

}
