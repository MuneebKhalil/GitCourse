public enum wait {
    private long waitTime;

    private wait(long waitTime){
        this.waitTime = waitTime;
    }
    public long getWaitTime(){
        return waitTime;
    }
}