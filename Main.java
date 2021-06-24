import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {

    List<String> nomes = new ArrayList<>();

    nomes.add("Juliana");
    nomes.add("Pedro");
    nomes.add("Carlos");
    nomes.add("Larissa");
    nomes.add("João");

    System.out.println("Lista --> " + nomes);

    nomes.set(2, "Roberto");

    System.out.println("Carlos por Roberto --> " + nomes);

    System.out.println("Posição 1 --> "+ nomes.get(1));

    nomes.remove(4);

    System.out.println("Remove posição 4 --> "+ nomes);

  

  }
}