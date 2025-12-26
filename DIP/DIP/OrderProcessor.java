public class OrderProcessor {
    private Database database;

    // Injection de dépendance
    public OrderProcessor(Database database) {
        this.database = database;
    }

    public void processOrder(String orderId) {
        database.save(orderId);
    }
}
