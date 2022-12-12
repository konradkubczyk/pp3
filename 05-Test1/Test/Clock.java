public class Clock {
    private int hour;
    private int minute;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >=0 && minute <= 59) {
            this.minute = minute;
        }
    }

    public Clock(int hour, int minute) {
        this.setHour(hour);
        this.setMinute(minute);
    }

    public void addMinute() {
        if (this.getMinute() == 59) {
            if (this.getHour() == 23) {
                this.setHour(0);
                this.setMinute(0);
            } else {
                this.hour++;
                this.setMinute(0);;
            }
        } else {
            this.minute++;
        }
    }    
}
