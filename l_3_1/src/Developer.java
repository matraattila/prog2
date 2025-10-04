public class Developer extends Employee implements Trainable {
    public Developer(String name, int id) {
        super(name, id);
    }
    @Override
    public void work() {
        System.out.println("Developer");
    }

    @Override
    public void attendTraining() {
        System.out.println("Developer attended");
    }
}
