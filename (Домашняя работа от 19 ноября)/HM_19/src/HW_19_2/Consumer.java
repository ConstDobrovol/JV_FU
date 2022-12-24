package HW_19_2;

import java.util.ArrayList;

class Consumer implements Runnable {
    private ArrayList<Integer> list;

    public Consumer(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            if (!list.isEmpty()) {
                System.out.println("Size is " + list.size());
                System.out.println(list.remove(list.size() - 1));
            } else {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
