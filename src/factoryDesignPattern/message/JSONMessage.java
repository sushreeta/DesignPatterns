package factoryDesignPattern.message;

public class JSONMessage extends Message{

    @Override
    public String getContent(){
        return "{\"JSON\":[]}";
    }
}
