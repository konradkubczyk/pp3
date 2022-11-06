public class Clock {
    
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;

    Clock() {
        this.setClock();
    }

    Clock(int hour, int minute) {
        this.setClock(hour, minute);
    }

    public void setClock(int hour, int minute) {
        this.validateTime(hour, minute);

        this.hour = hour;
        this.minute = minute;
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

        if (this.hour == this.alarmHour && this.minute == this.alarmMinute) {
            this.runAlarm();
        }
    }

    private void validateTime(int hour, int minute) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Hour must be between 0 and 23.");
        } else if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Minute must be between 0 and 59.");
        }
    }

    public void setAlarm(int hour, int minute) {
        this.validateTime(hour, minute);

        this.alarmHour = hour;
        this.alarmMinute = minute;
    }

    public void runAlarm() {
        System.out.println("beep-beep-beep-beep !!");
    }

    public static void main(String[] args) {
        Clock clock = new Clock(12, 47);
        clock.setAlarm(23, 59);
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