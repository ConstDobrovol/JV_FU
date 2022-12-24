package HW_19_2;

import java.util.ArrayList;

public class main {
    public static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Thread thread = new Thread(new Producer(list));
        Thread run = new Thread(new Consumer(list));
        thread.start();
        run.start();
    }
}