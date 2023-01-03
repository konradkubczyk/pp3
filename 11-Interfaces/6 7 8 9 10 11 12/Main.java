public class Main {
    // public static void main(String[] args) {
    //     TV tv = new TV();
    //     tv.on();
    //     tv.printStatus();
    //     tv.channelUp();
    //     tv.setChannel(7);
    //     tv.setChannel(142);
    //     tv.printStatus();
    //     tv.channelDown();
    //     tv.printStatus();
    //     tv.off();
    //     tv.printStatus();
    // }

    public static void main(String[] args) {
        TV tv = new TV();
        tv.on();
        tv.printStatus();
        tv.setChannel(15);
        tv.setVolumeLevel(7);
        tv.printStatus();
        tv.off();
        tv.printStatus();
    }
}
