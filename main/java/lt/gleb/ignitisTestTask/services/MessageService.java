package lt.pusnis.ignitisTestTask.services;

import lt.pusnis.ignitisTestTask.models.MyMessage;
import lt.pusnis.ignitisTestTask.repositories.MyMessagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private MyMessagesRepository myMessagesRepository;

    @Autowired
    public MessageService (MyMessagesRepository myMessagesRepository){
        this.myMessagesRepository = myMessagesRepository;
    }

    public Iterable<MyMessage> getAllMyMessages(){
        return myMessagesRepository.findAll();
    }
}
