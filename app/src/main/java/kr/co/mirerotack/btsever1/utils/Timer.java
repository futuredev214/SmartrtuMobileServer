package kr.co.mirerotack.btsever1.utils;

public class Timer {

    private long startTime = 0;
    private long stopTime = 0;
    private long timeout = 0;

    public Timer(long timeout) {
        this.timeout = timeout;
    }

    public Timer start() {
        this.startTime = System.currentTimeMillis();
        this.stopTime = 0;
        return this;
    }

    public void stop() {
        this.stopTime = System.currentTimeMillis();
    }

    public boolean isExpired() {
        return (System.currentTimeMillis() > startTime + timeout);
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getStopTime() {
        return this.stopTime;
    }

    public long getTotalTime() {
        return this.stopTime - this.startTime;
    }

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    public boolean isWorking() {
        return (stopTime != 0);
    }
}
