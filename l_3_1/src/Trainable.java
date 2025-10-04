public interface Trainable {
    void attendTraining();
    default void defaultWelcome() {
        System.out.println("Welcome to the training program");
    }
}
