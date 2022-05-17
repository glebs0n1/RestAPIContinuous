package lt.gleb.ignitisTestTask.repositories;

import lt.pusnis.ignitisTestTask.models.MyMessage;
import org.springframework.data.repository.CrudRepository;

public interface MyMessagesRepository extends CrudRepository<MyMessage,Integer> {

}
