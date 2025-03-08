package gakvetili42davaleba;


class OverworkedThread implements Runnable {
    Counter counter = new Counter();
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class Third {
    public static void main(String[] args) {
        Thread t1 = new Thread(new OverworkedThread());
        Thread t2 = new Thread(new OverworkedThread());
        Counter counter = new Counter();

        t1.run();
        t2.run();


        try {
            t1.join();
            t2.join();
        }catch (Exception e) {}


        counter.getCount();
    }
}
