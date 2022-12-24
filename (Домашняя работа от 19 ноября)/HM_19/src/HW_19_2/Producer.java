package HW_19_2;
import java.util.ArrayList;
import java.util.Random;
class Producer extends Thread {
    private final ArrayList<Integer> list;
    Random random = new Random();

    public Producer(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            if (list.size() < 10) {
                list.add(random.nextInt());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}