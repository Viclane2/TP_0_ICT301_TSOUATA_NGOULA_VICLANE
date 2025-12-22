package isp.avant;

public class HumanWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Humain travaille");
    }
    
    @Override
    public void eat() {
        System.out.println("Humain mange");
    }
}