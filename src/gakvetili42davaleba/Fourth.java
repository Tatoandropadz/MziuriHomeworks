package gakvetili42davaleba;

import java.util.*;

class WorkerThread implements Runnable {

    public static void generateSecretCode(){
        try {
            Thread.sleep(2000);
        }catch (Exception e){}

        System.out.println((new Object()).hashCode());
    }


    @Override
    public void run() {
        generateSecretCode();
    }
}

public class Fourth {
    public static void main(String[] args) {
        ArrayList <Thread> threads = new ArrayList<>();
        int numberOfThreads = 100;

        for (int i = 0; i < numberOfThreads; i++) {
            Thread thread = new Thread(new WorkerThread());
            threads.add(thread);
            thread.start();
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (Exception e) {}

        }
    }
}

