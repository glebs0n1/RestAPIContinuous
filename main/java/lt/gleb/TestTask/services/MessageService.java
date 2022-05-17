package lt.gleb.TestTask.services;

import lt.gleb.TestTask.models.MyMessage;
import lt.gleb.TestTask.repositories.MyMessagesRepository;
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
