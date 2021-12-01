package factoryDesignPattern;
import factoryDesignPattern.message.JSONMessage;
import factoryDesignPattern.message.Message;

public class JSONMessageCreator extends MessageCreator{

    @Override
    public Message createMessage(){
        return new JSONMessage();
    }
}
