public class Filename {
    private String filename;

    public Filename(String filename) {
        this.filename = filename;
    }

    public String m1() {
        return filename.substring(0, filename.lastIndexOf('.'));
    }

    public String m2() {
        return filename.substring(filename.lastIndexOf('.'));
    }
}
