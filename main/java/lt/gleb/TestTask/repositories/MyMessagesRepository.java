package lt.gleb.TestTask.repositories;

import lt.gleb.TestTask.models.MyMessage;
import org.springframework.data.repository.CrudRepository;

public interface MyMessagesRepository extends CrudRepository<MyMessage,Integer> {

}
