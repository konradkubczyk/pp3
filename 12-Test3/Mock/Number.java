public class Number {
    private int system;
    private String value;

    public int getSystem() {
        return system;
    }

    public void setSystem(int system) {
        this.system = system;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int get10() {
        int decimalValue = 0;

        for (int i = 0; i < this.getValue().length(); i++) {
            if (Integer.parseInt(String.valueOf(this.getValue().charAt(i))) < 0 || Integer.parseInt(String.valueOf(this.getValue().charAt(i))) > system - 1) {
                return -1;
            }
            decimalValue += Integer.parseInt(String.valueOf(this.getValue().charAt(i))) * Math.pow(system, this.getValue().length() - i - 1);
        }

        return decimalValue;
    }
}
