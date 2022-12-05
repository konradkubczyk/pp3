import java.util.Date;

public class File {
    private String name;
    private String content;
    private Date creationDate;
    private Date lastModificationDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public File(String name, String content) {
        this.setName(name);
        this.setContent(content);
        this.setCreationDate(new Date());
        this.setLastModificationDate(new Date());
    }

    public String toString() {
        return "- " + this.getName() +
                "\n    - creation:" + this.getCreationDate() +
                "\n    - last modification:" + this.getLastModificationDate() +
                "\n    - content" + this.getContent();
    }

    public void swapContent(String content) {
        this.setContent(content);
        this.setLastModificationDate(new Date());
    }

    public void rename(String name) {
        this.setName(name);
        this.setLastModificationDate(new Date());
    }
}
