package dip.apres;

public class Main {
    public static void main(String[] args) {
        // Peut utiliser MySQL
        Database mysql = new MySQLDatabase();
        OrderProcessor processor1 = new OrderProcessor(mysql);
        processor1.processOrder("Commande MySQL");
        
        // Peut utiliser MongoDB SANS modifier OrderProcessor
        Database mongo = new MongoDBDatabase();
        OrderProcessor processor2 = new OrderProcessor(mongo);
        processor2.processOrder("Commande MongoDB");
    }
}