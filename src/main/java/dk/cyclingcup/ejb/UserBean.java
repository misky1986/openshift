package dk.cyclingcup.ejb;

import dk.cyclingcup.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserBean {

    @PersistenceContext
    EntityManager em;

    public void persist(User user) {
        User user1 = new User();
        user1.setName("Mil");
        user1.setAge(29);
        em.persist(user);
    }
}
