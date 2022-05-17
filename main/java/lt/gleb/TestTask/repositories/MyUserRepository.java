package lt.gleb.TestTask.repositories;

import lt.gleb.TestTask.models.MyUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

public interface MyUserRepository extends CrudRepository<MyUser, Integer> {

    Iterable<MyUser> findByTokenLike(String token);
    MyUser findByName(String username);

}
