import java.time.Year;

public class DrivingLicense {
    
    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private int issuanceYear;
    private String licenseCategory;

    public void displayInfo() {
        System.out.println(this);
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public int getIssuanceYear() {
        return this.issuanceYear;
    }

    public String getLicenseCategory() {
        return this.licenseCategory;
    }

    public void setName(String name) {
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public void setSurname(String surname) {
        this.surname = surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase();
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setIssuanceYear(int issuanceYear) {
        if (issuanceYear >= 1980 && issuanceYear <= Year.now().getValue()) {
            this.issuanceYear = issuanceYear;
        } else {
            throw new IllegalArgumentException("Incorrect issuance year. Value should be between 1980 and " + Year.now().getValue() + ", got " + issuanceYear + ".");
        }
    }

    public void setLicenseCategory(String licenseCategory) {
        this.licenseCategory = licenseCategory;
    }

    public String toString() {
        return "Name: " + this.getName() +
        "\nSurname: " + this.getSurname() +
        "\nAddress: " + this.getAddress() +
        "\nPostal code: " + this.getPostalCode() +
        "\nIssuance year: " + this.getIssuanceYear() +
        "\nLicense category: " + this.getLicenseCategory();
    }
}
