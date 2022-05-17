package lt.gleb.TestTask.services;

import lt.gleb.TestTask.models.MyUser;
import lt.gleb.TestTask.repositories.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {
    private MyUserRepository myUserRepository;

    @Autowired
    public UserService(MyUserRepository myUserRepository) {
        this.myUserRepository = myUserRepository;
    }


    public Iterable<MyUser> getAllMyUsers(){
        return myUserRepository.findAll();
    }

    public Optional<MyUser> getMyUserById(int id){
        return myUserRepository.findById(id);
    }

}
