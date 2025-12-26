public class MySQLDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Sauvegarde dans MySQL : " + data);
    }
}
