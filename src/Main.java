import java.io.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {

            File input = new File("input.txt");
            File output = new File("output.txt");
            File first = new File("first.txt");
            //считать инф хотим

            Scanner in;
            PrintWriter writer;
            in = new Scanner(input);
            int length = 0;
            while (in.hasNextInt()) {
                length++;
                in.nextInt();
            }

            try{

                in = new Scanner(input);
                writer = new PrintWriter(output);


                for(int i = 0; i < length; i++){
                    if(i >= length/2)
                        writer.print(in.nextInt() + " ");
                    else
                        in.nextInt();
                }
                in = new Scanner(input);
                for(int i = 0; i < length/2; i++){
                    writer.print(in.nextInt() + " ");
                }

                /*writer.close();
                writer = new PrintWriter(output);
                while (in.hasNextInt()) {
                    writer.print(in.nextInt() + " ");
                }
                in = new Scanner(first);
                while (in.hasNextInt()) {
                    writer.print(in.nextInt() + " ");
                }*/
                in.close();
                writer.close();
            }
            catch (FileNotFoundException e){
                throw new RuntimeException(e);
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}