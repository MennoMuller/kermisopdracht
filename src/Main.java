import control.Carnival;

public class Main {
    public static void main(String[] args) {
        Carnival carnival = new Carnival();
        while (carnival.isActive()) {
            carnival.processInput();
        }
    }
}