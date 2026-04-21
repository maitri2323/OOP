import java.io.*;

public class StudentApp {
    public static void main(String[] args) {

        FileWriter writer = null;
        BufferedReader reader = null;

        try {
            writer = new FileWriter("students.txt");

            writer.write("101 Maitri 90\n");
            writer.write("102 Komal 85\n");
            writer.write("103 Archi 78\n");

            writer.close();

            reader = new BufferedReader(new FileReader("students.txt"));

            String data;
            while ((data = reader.readLine()) != null) {
                System.out.println(data);
            }

        } catch (IOException e) {
            System.out.println("File handling error");
        } finally {
            try {
                if (writer != null) writer.close();
                if (reader != null) reader.close();
            } catch (IOException e) {
            }
        }

        System.out.println("Maitri chauhan");
        System.out.println("250393107003");
    }
}