package singletonDesignPattern;

public enum enumDBConnection {
    INSTANCE;

    private String dbURL = "https://something";
    public String getDbURL(){
        return dbURL;
    }
}
