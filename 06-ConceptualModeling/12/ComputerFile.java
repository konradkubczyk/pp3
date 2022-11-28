import java.util.Date;

public class ComputerFile {
    private String name;
    private String type;
    private Date creationDate;
    private Date lastModifiedDate;
    private int size;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String toString() {
        return "File Details:" +
                "\nName: " + name +
                "\nType: " + type +
                "\nCreation date: " + creationDate +
                "\nLast modified date: " + lastModifiedDate +
                "\nSize: " + size +
                "\nContent: " + content;
    }

    public ComputerFile(String name, String type, Date creationDate, Date lastModifiedDate, int size, String content) {
        this.setName(name);
        this.setType(type);
        this.setCreationDate(creationDate);
        this.setLastModifiedDate(lastModifiedDate);
        this.setSize(size);
        this.setContent(content);
    }
}
