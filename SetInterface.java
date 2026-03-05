import java.util.Set;
import java.util.HashSet;
//import java.util.*; // Importa todas as classes do pacote java.util


public class SetInterface{
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();

        //adicionado elementos a collection
        conjunto.add("Java");

        conjunto.add("Python");

        conjunto.add("C++");

        conjunto.add("Ruby");
        
        System.out.println("Conjunto: " + conjunto);

        //verificado elementos da collection
        System.out.println("Contem 'Java'? " + conjunto.contains("Java")); //true

        System.out.println("Contem 'JavaScript'? " + conjunto.contains("JavaScripst")); //false

        //removendo elementos da collection
        conjunto.remove("Ruby");

        System.out.println("Conjunto alterado: " + conjunto);

        System.out.println("Contem 'Ruby'? " + conjunto.contains("Ruby")); //false

        //limpando a collection
        conjunto.clear();
        System.out.println("Conjunto apos limpeza: " + conjunto);
    }
}