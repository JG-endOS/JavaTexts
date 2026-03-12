import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class NIO {
    public static void main(String[] args) {

        Path path = Paths.get("meuArquivo2.txt");

        try {
            //ESCREVENDO EM UM ARQUIVO
            Files.write(path, "Hello World! 2".getBytes());

            //LENDO DE UM ARQUIVO   
            byte[] bytes = Files.readAllBytes(path);

            String content = new String(bytes);

            System.out.println(content);

        } catch (IOException e) {
            System.out.println("Problemas de IO: " + e.getMessage());
        }
    }
}