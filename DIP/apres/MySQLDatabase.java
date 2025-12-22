package dip.apres;

public class MySQLDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Sauvegarde MySQL: " + data);
    }
}