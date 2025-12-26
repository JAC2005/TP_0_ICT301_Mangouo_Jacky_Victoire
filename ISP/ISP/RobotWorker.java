public class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Robot travaille");
    }

    @Override
    public void eat() {
        // Le robot ne mange pas ! Mais il DOIT implémenter eat()
        throw new UnsupportedOperationException("Un robot ne mange pas !");
    }
}
