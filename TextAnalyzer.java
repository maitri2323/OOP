import java.io.*;

public class TextAnalyzer {
    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            System.out.println("File name missing");
            return;
        }

        BufferedReader br = new BufferedReader(new FileReader(args[0]));

        int chars = 0, words = 0, lines = 0;
        String data;

        while ((data = br.readLine()) != null) {
            lines++;
            chars += data.length();

            String w[] = data.trim().split("\\s+");
            if (data.trim().length() > 0) {
                words += w.length;
            }
        }

        br.close();

        System.out.println("Chars = " + chars);
        System.out.println("Words = " + words);
        System.out.println("Lines = " + lines);
        System.out.println("Maitri chauhan");
        System.out.println("250393107003");
    }
}