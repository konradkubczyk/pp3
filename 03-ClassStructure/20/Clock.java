public class Clock {
    
    int hour;
    int minute;

    Clock() {
        this.setClock();
    }

    Clock(int hour, int minute) {
        this.setClock(hour, minute);
    }

    public void setClock(int hour, int minute) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Hour must be between 0 and 23.");
        }

        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Minute must be between 0 and 59.");
        }
    }

    public void setClock() {
        this.hour = 0;
        this.minute = 0;
    }

    public void displayTime() {
        if (minute > 9) {
            System.out.println(this.hour + ":" + this.minute);
        } else if (hour > 9) {
            System.out.println(this.hour + ":0" + this.minute);
        } else {
            System.out.println("0" + this.hour + ":0" + this.minute);
        }
    }

    public void addOneMinute() {
        if (this.minute < 59) {
            this.minute++;
        } else if (this.hour < 23) {
            this.minute = 0;
            this.hour++;
        } else {
            this.setClock();
        }
    }

    public static void main(String[] args) {
        Clock clock = new Clock(12, 47);
        clock.displayTime();
        clock.setClock(18, 14);
        clock.displayTime();
        clock.setClock(9, 3);
        clock.displayTime();
        clock.setClock(23, 58);
        clock.displayTime();
        clock.addOneMinute();
        clock.displayTime();
        clock.addOneMinute();
        clock.displayTime();
    }
}