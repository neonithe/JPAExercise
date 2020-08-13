package se.lexicon.mattias.JPAExercise.data;

import se.lexicon.mattias.JPAExercise.entity.AppUser;

import java.util.List;
import java.util.Optional;

public interface UserDAO {

    /** CRUD **/

    Optional<AppUser> findById(int id);
    List<AppUser> findAll();
    AppUser update(AppUser appUser);
    AppUser save(AppUser appUser);
    boolean delete(AppUser appUser);

}
