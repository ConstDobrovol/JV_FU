import java.io.PrintStream;
import java.nio.charset.StandardCharsets;



public class Main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        var controller = new TaskController();
        controller.Start();
    }
}