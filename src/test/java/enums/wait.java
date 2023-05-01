package enums;

public enum wait {
    EXPLICIT_WAIT(10L),
    sleep_one_sec(100l),
    SLEEP_TWO_SEC(200L);
    private long waitTime;

    private wait(long waitTime){
        this.waitTime = waitTime;
    }
    public long getWaitTime(){
        return waitTime;
    }
}