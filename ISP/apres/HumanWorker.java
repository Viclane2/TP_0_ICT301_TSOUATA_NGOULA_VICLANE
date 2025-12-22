package isp.apres;

public class HumanWorker implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Humain travaille");
    }
    
    @Override
    public void eat() {
        System.out.println("Humain mange");
    }
}