import java.io.*;

public class IO {
    public static void main (String[] args) {

        try {

            //escrevendo um arquivo 
            FileWriter writer = new FileWriter("meuArquivo.txt");

            writer.write("Hello world!"); // grava dados

            writer.close();

            //lendo um arquivo
            FileReader reader = new FileReader("meuArquivo.txt");

            int data = reader.read();

            while (data != -1) {

                System.out.print((char)data); //COM CASTING
                //System.out.print((char)data); //SEM CASTING

                data = reader.read();

            }

            reader.close();
        } catch (IOException e) {

            System.out.println("Problemas de IO: " + e.getMessage());
        }
    }
}
