public class RobotWorker implements Workable {
    @Override
    public void work() {
        System.out.println("Robot travaille");
    }
    // Pas de eat() → conforme à ISP !
}
