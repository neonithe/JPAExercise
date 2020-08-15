package se.lexicon.mattias.JPAExercise.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.lexicon.mattias.JPAExercise.entity.AppUser;

import javax.persistence.EntityManager;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UserDAOImplTest {

    UserDAO testDAO;
    AppUser testObject;
    EntityManager entityManager;

    @BeforeEach
    void setUp() {
        testObject =  new AppUser(
                "testUser",
                "test",
                "testsson",
                LocalDate.parse("2020-01-01"),
                true,
                "test");
    }

    @Test
    void findById() {

    }

    @Test
    void findAll() {
    }

    @Test
    void update() {
    }

    @Test
    void save() {
        AppUser user = new AppUser("testuser2",
                "test",
                "testsson",
                LocalDate.parse("2020-01-02"),
                true,
                "test");
        testDAO.save(user);
        assertEquals(user, entityManager.find(AppUser.class, user.getId()));
    }

    @Test
    void delete() {
    }
}