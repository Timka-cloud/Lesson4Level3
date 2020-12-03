package MaksHomework;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args) {

    }



    private static void printLastNLinesSecond(int lines) {
        File file = new File("test.txt");

        try {
            RandomAccessFile raf = new RandomAccessFile(file, "r");
            long fileLength = file.length() - 1;
            StringBuilder sb = new StringBuilder();
            int reachedLines = 0;

            raf.seek(fileLength);

            for (long ptr = fileLength; ptr >= 0 ; ptr--) {
                raf.seek(ptr);
                char c = (char) raf.read();

                if (c == '\n') {
                    reachedLines++;

                    if (reachedLines == lines) {
                        break;
                    }
                }

                sb.append(c);
            }

            sb.reverse();

            System.out.println(sb.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    } // Вывести n количество строк из файла вариант номер 2

    private static void printLastNLines(int count){
        try {

            BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream("text.txt")));
            String line;
            List<String> tempLines = new ArrayList<>();
            while ((line = bf.readLine()) != null){
                tempLines.add(line);

            }
            for (int i = count; i < tempLines.size(); i++) {
                System.out.println(tempLines.get(i));
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    } // Вывести n количество строк из файла вариант номер 1
}