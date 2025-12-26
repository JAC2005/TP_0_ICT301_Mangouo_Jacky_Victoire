public class MainISP {
    public static void main(String[] args) {
        Workable human = new HumanWorker();
        Workable robot = new RobotWorker();
        Eatable humanEater = new HumanWorker();

        human.work();      // OK
        robot.work();      // OK
        humanEater.eat();  // OK

        // robot.eat();    // Impossible → compilation error → c'est voulu !
    }
}
