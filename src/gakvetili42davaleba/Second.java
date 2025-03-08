package gakvetili42davaleba;

class MyCountableThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

            try {
                Thread.sleep(3000);
            } catch (Exception e) {}
        }
    }
}

public class Second {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyCountableThread());
        t1.run();
    }
}
