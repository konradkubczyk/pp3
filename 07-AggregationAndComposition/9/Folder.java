import java.util.ArrayList;
import java.util.Date;

public class Folder {
    private String name;
    private Date creationDate;
    private Date lastModificationDate;
    private ArrayList<File> files;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastModificationDate() {
        return lastModificationDate;
    }

    public void setLastModificationDate(Date lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    public Folder(String name) {
        this.setName(name);
        this.setCreationDate(new Date());
        this.setLastModificationDate(new Date());
        this.setFiles(new ArrayList<File>());
    }

    public String toString() {
        String string = this.getName() +
                        "\n- creation:" + this.getCreationDate() +
                        "\n- last modification:" + this.getLastModificationDate() +
                        "\n- files:";
        for (int i = 0; i < this.files.size(); i++) {
            string += "\n  " + this.files.get(i).toString();
        }
        return string;
    }

    public void rename(String name) {
        this.setName(name);
        this.setLastModificationDate(new Date());
    }

    public void addFile(File file) {
        this.files.add(file);
        this.setLastModificationDate(new Date());
    }

    public void removeFileByName(String name) {
        for (int i = 0; i < this.files.size(); i++) {
            if (this.files.get(i).getName().equals(name)) {
                this.files.remove(i);
                this.setLastModificationDate(new Date());
                break;
            }
        }
    }

    public void removeAllFiles() {
        this.files.clear();
        this.setLastModificationDate(new Date());
    }
}
