package lt.gleb.TestTask.services;

import lt.gleb.TestTask.models.MyRole;
import lt.gleb.TestTask.repositories.MyRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    private MyRoleRepository myRoleRepository;

    @Autowired
    public RoleService(MyRoleRepository myRoleRepository) {
        this.myRoleRepository = myRoleRepository;
    }

    public Iterable<MyRole> getAllMyRoles(){
        return myRoleRepository.findAll();
    }
}
