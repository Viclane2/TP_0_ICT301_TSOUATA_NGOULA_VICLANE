package dip.apres;

public class OrderProcessor {
    private Database database; // Dépend de l'interface
    
    public OrderProcessor(Database database) { // INJECTION
        this.database = database;
    }
    
    public void processOrder(String order) {
        database.save(order);
    }
}