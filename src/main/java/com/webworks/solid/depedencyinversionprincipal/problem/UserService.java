package com.webworks.solid.depedencyinversionprincipal.problem;

public class UserService {
    /**
     * Here we have created hard coupling instead of loose coupling
     */
    private MySQLDatabase database1 = new MySQLDatabase();
    /**
     * This forces me to create object of another type if needed. As we add more type of object
     * this class needs to be changed with it
     */
    private MongoDBDatabase database2 = new MongoDBDatabase();

    public void saveUser(String user) {
        database1.saveData(user);
    }

    public void storeDocument(String user) {
        database2.storeDocument(user);
    }
}