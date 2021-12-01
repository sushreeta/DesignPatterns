package singletonDesignPattern;

public class client {
    public static void main(String args[]){

        DBConnection db1 = DBConnection.getInstance();
        DBConnection db2 = DBConnection.getInstance();

//         enum singleton
//        enum is thread safe and serialized by default in java
        enumDBConnection obj1 = enumDBConnection.INSTANCE;
        obj1.getDbURL();

        enumDBConnection obj2 = enumDBConnection.INSTANCE;
        obj1.getDbURL();
//        obj1 and obj2 have the same address and are same
    }

}
