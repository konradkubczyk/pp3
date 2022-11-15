public class Tester {
    public static void main(String[] args) {

        System.out.println(StringShifter.stringToArray("Test")[1]);
        // e

        System.out.println(StringShifter.everyLetterAppearsTwice("abeccbea"));
        // true

        System.out.println(StringShifter.everyLetterAppearsTwice("sfdsd"));
        // false

        System.out.println(StringShifter.getAlphabet());
        // abcdefghijklmnopqrstuvwxyz

        System.out.println(StringShifter.getAlphabet(true));
        // ABCDEFGHIJKLMNOPQRSTUVWXYZ

        StringShifter stringShifter1 = new StringShifter();
        System.out.println(stringShifter1);
        // StringShifter has 1 instance(s)

        StringShifter stringShifter2 = new StringShifter();
        System.out.println(stringShifter2);
        // StringShifter has 2 instance(s)
    }
}
