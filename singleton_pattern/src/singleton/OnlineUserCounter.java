package singleton;

import java.util.concurrent.atomic.AtomicInteger;

public class OnlineUserCounter {
    private static OnlineUserCounter instance = new OnlineUserCounter();
    private AtomicInteger count = new AtomicInteger(0);

    private OnlineUserCounter() {
    }

    public static OnlineUserCounter getInstance() {
        return instance;
    }

    public void userLoggedIn() {
        count.incrementAndGet();
    }

    public void userLoggedOut() {
        count.decrementAndGet();
    }

    public int getOnlineUsers() {
        return count.get();
    }
}
