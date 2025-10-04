public class Manager extends Employee implements Trainable {
    public Manager(String name, int id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println("Manager");
    }

    @Override
    public void attendTraining() {
        System.out.println("Manager attended");
    }
}
