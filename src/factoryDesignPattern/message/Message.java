package factoryDesignPattern.message;

public abstract class Message {
    public abstract String getContent();

    public void addDefaultHeaders(){
//    add some header content here
    }

    public void encrypt(){
//    add encryption logic here
    }
}
