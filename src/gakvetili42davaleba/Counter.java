package gakvetili42davaleba;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    static private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public void getCount() {
        System.out.println(count);
    }
}
