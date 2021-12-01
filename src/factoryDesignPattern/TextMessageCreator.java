package factoryDesignPattern;
import factoryDesignPattern.message.Message;
import factoryDesignPattern.message.TextMessage;

public class TextMessageCreator extends MessageCreator{

    @Override
    public Message createMessage(){
        return new TextMessage();
    }
}
