public class FileSystemTest {
    public static void main(String[] args) {
        System.out.println();

        // Create a folder
        Folder folder = new Folder("Folder 1");

        // Add two files to the folder
        folder.addFile(new File("File 1", "Content 1"));

        // Display the folder contents
        System.out.println(folder + "\n");

        // Add another file to the folder
        folder.addFile(new File("File 2", "Content 2"));

        // Display the folder contents
        System.out.println(folder + "\n");

        // Remove the named file from the folder
        folder.removeFileByName("File 1");

        // Display the folder contents
        System.out.println(folder + "\n");
    }
}
