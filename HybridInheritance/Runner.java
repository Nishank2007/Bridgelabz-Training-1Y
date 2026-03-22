package out.gla.Inheritance.HybridInheritance;

public class Runner {
    public static void main(String[] args) {

        Worker w1 = new Chef("Ravi", 101, "Indian");
        Worker w2 = new Waiter("Aman", 102, 5);

        Worker[] staff = {w1, w2};

        for (int i = 0; i < staff.length; i++) {
            staff[i].performDuties();
        }
    }
}