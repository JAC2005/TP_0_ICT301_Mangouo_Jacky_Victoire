public class Main {
    public static void main(String[] args) {
        // Facile de changer de base sans toucher OrderProcessor
        Database mysql = new MySQLDatabase();
        Database mongo = new MongoDBDatabase();

        OrderProcessor processor1 = new OrderProcessor(mysql);
        OrderProcessor processor2 = new OrderProcessor(mongo);

        processor1.processOrder("ORD-001");
        processor2.processOrder("ORD-002");
    }
}
