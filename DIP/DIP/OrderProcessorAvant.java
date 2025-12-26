public class OrderProcessorAvant {
    private MySQLDatabaseAvant database;

    public OrderProcessorAvant() {
        this.database = new MySQLDatabaseAvant();
    }

    public void processOrder(String orderId) {
        database.save(orderId);
    }
}
