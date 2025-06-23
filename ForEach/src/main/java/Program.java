import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

    List<String> list = new ArrayList<>();

    list.add("Maria");
    list.add("Alex");
    list.add("Bob");
    list.add("Anna");
    list.add(2,"Marco");
    System.out.println(list.size());
    for ( String nome : list){
        System.out.println(nome);
    }

    list.removeIf(nome -> nome.charAt(0) == 'M');
    System.out.println("Index do Bob: " + list.indexOf("Bob"));
    System.out.println("Index do Marco: " + list.indexOf("Marco"));
    List<String> result = list.stream().filter(nome -> nome.charAt(0) == 'A').toList();
    System.out.println(result);
    String name = list.stream().filter(nome -> nome.charAt(0) == 'J').findFirst().orElse(null);
System.out.println(name);

    }


}
