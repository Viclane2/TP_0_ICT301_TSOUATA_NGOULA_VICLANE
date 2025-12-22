package dip.apres;

public class MongoDBDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Sauvegarde MongoDB: " + data);
    }
}