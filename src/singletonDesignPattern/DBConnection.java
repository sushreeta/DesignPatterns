package singletonDesignPattern;

public class DBConnection {
    private static DBConnection INSTANCE = null;
    DBConnection (){
    }
//    Normal get instance method
//    public static DBConnection getInstance(){
//    Multi-threaded get instance method
//    public static synchronized DBConnection getInstance(){

    public static synchronized DBConnection getInstance(){
        if(INSTANCE==null){
            INSTANCE= new DBConnection();
        }
        return INSTANCE;
    }
}
