package isp.avant;

public class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Robot travaille");
    }
    
    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robot ne mange pas!");
    }
}