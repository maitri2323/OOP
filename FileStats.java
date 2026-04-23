import java.io.*;

public class FileStats {
    public static void main(String[] args) {

        int lines = 0, words = 0, chars = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String data;

            while ((data = br.readLine()) != null) {
                lines++;

                // Words count
                String[] w = data.trim().split("\\s+");
                if (data.trim().length() > 0) {
                    words += w.length;
                }

                // Characters count (excluding spaces)
                for (int i = 0; i < data.length(); i++) {
                    if (data.charAt(i) != ' ') {
                        chars++;
                    }
                }
            }

            br.close();

            System.out.println("Lines = " + lines);
            System.out.println("Words = " + words);
            System.out.println("Characters (excluding spaces) = " + chars);

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
	System.out.println("Maitri chauhan");
        System.out.println("250393107003");
    
    }
}