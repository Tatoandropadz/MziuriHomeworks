package gakvetili42davaleba;

class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {}
        }
    }
}

public class First {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        t1.run();
    }
}
