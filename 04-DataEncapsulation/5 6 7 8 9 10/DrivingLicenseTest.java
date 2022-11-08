public class DrivingLicenseTest {
    public static void main(String[] args) {

        // Create new DrivingLicense instance
        DrivingLicense drivingLicense = new DrivingLicense();

        // Set private attributes using setter methods
        drivingLicense.setName("bOb");
        drivingLicense.setSurname("pIrAtE");
        drivingLicense.setAddress("Sunny Avenue 4/3");
        drivingLicense.setPostalCode("12-345");
        drivingLicense.setIssuanceYear(2022);
        drivingLicense.setLicenseCategory("AM");

        // Display driving license info using displayInfo() method
        drivingLicense.displayInfo();
        
        System.out.println();

        // Display driving license info using toString() method
        System.out.println(drivingLicense);

        System.out.println();

        // Tests year validation and throws IllegalArgumentException
        drivingLicense.setIssuanceYear(1970);
    }
}
