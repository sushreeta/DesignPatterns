package factoryDesignPattern.message;

public class TextMessage extends Message{

    @Override
    public String getContent(){
        return "TEXT";
    }
}
