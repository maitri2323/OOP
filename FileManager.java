import java.io.*;

public class FileManager {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Usage:");
            System.out.println("Copy: java FileManager copy source destination");
            System.out.println("Delete: java FileManager delete filename");
            System.out.println("Rename: java FileManager rename oldname newname");
            return;
        }

        String command = args[0];

        try {
            switch (command.toLowerCase()) {

                case "copy":
                    if (args.length != 3) {
                        System.out.println("Invalid arguments for copy");
                        return;
                    }
                    copyFile(args[1], args[2]);
                    printFileProperties(new File(args[2]));
                    break;

                case "delete":
                    File fileToDelete = new File(args[1]);
                    if (fileToDelete.delete()) {
                        System.out.println("File deleted successfully.");
                    } else {
                        System.out.println("Failed to delete file.");
                    }
                    break;

                case "rename":
                    if (args.length != 3) {
                        System.out.println("Invalid arguments for rename");
                        return;
                    }
                    File oldFile = new File(args[1]);
                    File newFile = new File(args[2]);

                    if (oldFile.renameTo(newFile)) {
                        System.out.println("File renamed successfully.");
                        printFileProperties(newFile);
                    } else {
                        System.out.println("Rename failed.");
                    }
                    break;

                default:
                    System.out.println("Unknown command.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }

        System.out.println("Maitri chauhan");
        System.out.println("250393107003");
    }

    public static void copyFile(String source, String destination) throws IOException {

        File srcFile = new File(source);
        File destFile = new File(destination);

        if (!srcFile.exists()) {
            throw new FileNotFoundException("Source file does not exist.");
        }

        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        int data;
        while ((data = fis.read()) != -1) {
            fos.write(data);
        }

        fis.close();
        fos.close();

        System.out.println("File copied successfully.");
    }

    public static void printFileProperties(File file) {

        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        System.out.println("\n--- File Properties ---");
        System.out.println("File Name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("File Size: " + file.length() + " bytes");
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Last Modified: " + new java.util.Date(file.lastModified()));
    }
}