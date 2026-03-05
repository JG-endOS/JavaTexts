import java.util.Set;
import java.util.HashSet;

public class SetExercise {
    public static void main (String[] args) {
        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(10);

        conjunto.add(120);

        conjunto.add(40);

        conjunto.add(560);
        
        System.out.println("Conjunto: " + conjunto);

        System.out.println("Contem '10'? " + conjunto.contains(10));
        System.out.println("Contem '11'? " + conjunto.contains(11));

        conjunto.remove(10);

        System.out.println("Novo conjunto:" + conjunto);
    }
}