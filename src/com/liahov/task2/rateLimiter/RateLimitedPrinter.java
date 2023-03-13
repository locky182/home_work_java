package com.liahov.task2.rateLimiter;

public class RateLimitedPrinter {
    private final int INTERVAL;
    private long lastTime = 0;


    public RateLimitedPrinter(int interval) {
        this.INTERVAL = interval;

    }

    public void print(String message) {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastTime > INTERVAL) {
            System.out.println(message);
            lastTime = currentTime;
        }
    }
}
