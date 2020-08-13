package se.lexicon.mattias.JPAExercise.data;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.mattias.JPAExercise.entity.AppUser;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

/** @Transactional = Defines the scope for a single DB transaction,
 *  the DB transaction happens inside the scope of a persistence context.
 *  @Repository = This indicates that the class provides the functions for
 *  storage, retrieval, search, update and delete of objects**/

@Transactional
@Repository
public class UserDAOImpl implements UserDAO{

/** @PersistenceContext = Handles a set of entities that should be stored (DB)
 *  It manages the different stages the entity can have (managed, detached)
 *  in realation to the context**/
    @PersistenceContext
    private EntityManager entityManager; //Connection to DB, and commands for DB


    @Override
    public Optional<AppUser> findById(int id) {
        //?
        AppUser appUser = entityManager.find(AppUser.class, id);
        Optional<AppUser> returnOptional = Optional.of(appUser);

        return returnOptional;
    }

    @Override
    public List<AppUser> findAll() {
        // Ask Question to DB -> Why S?
        Query query = entityManager.createQuery("SELECT s FROM AppUser s");
        return null;
    }

    @Override
    public AppUser update(AppUser appUser) {
        //?
        AppUser update = entityManager.merge(appUser);
        return update;
    }

    @Override
    public AppUser save(AppUser appUser) {
        //?
        entityManager.persist(appUser);
        return appUser;
    }

    @Override
    public boolean delete(AppUser appUser) {
        Optional<AppUser> user = findById(appUser.getId());
        if(user != null) {
            entityManager.remove(user);
            return true;
        }
        return false;
    }
}
