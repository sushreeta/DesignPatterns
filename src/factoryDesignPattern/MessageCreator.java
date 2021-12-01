package factoryDesignPattern;
import factoryDesignPattern.message.Message;

public abstract class MessageCreator {
    public Message getMessage() {
            Message msg = createMessage();

            msg.addDefaultHeaders();
            msg.encrypt();

            return msg;
            }

    //Factory method
    protected abstract Message createMessage();
}