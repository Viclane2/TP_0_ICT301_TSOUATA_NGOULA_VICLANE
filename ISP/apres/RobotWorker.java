package isp.apres;

public class RobotWorker implements Workable {
    @Override
    public void work() {
        System.out.println("Robot travaille");
    }
    // N'implémente PAS Eatable : c'est correct!
}