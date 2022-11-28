import java.util.Date;

public class AnyObject {
    private String name;
    private String owner;
    private Date creationDate;
    private String description;
    private boolean isPhisical;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPhisical() {
        return isPhisical;
    }

    public void setPhisical(boolean isPhisical) {
        this.isPhisical = isPhisical;
    }

    public String toString() {
        return "Object details:" +
                "\nName: " + name +
                "\nOwner: " + owner +
                "\nCreation date: " + creationDate +
                "\nDescription: " + description +
                "\nIs phisical: " + isPhisical;
    }

    public AnyObject(String name, String owner, Date creationDate, String description, boolean isPhisical) {
        this.setName(name);
        this.setOwner(owner);
        this.setCreationDate(creationDate);
        this.setDescription(description);
        this.setPhisical(isPhisical);
    }
}
