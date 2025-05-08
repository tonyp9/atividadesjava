import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Noelle");
		list.add("Asta");
		list.add("Yuno");
		list.add("Yami");
		list.add(2, "Mimosa");
		System.out.println(list.size());
		//list.remove(3);
		//list.removeIf(x -> x.charAt(0) == 'M');
		System.out.println("Index of Asta: " + list.indexOf("Asta"));
		for (String nomes : list) {
			System.out.println(nomes);
		}
		System.out.println("------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String resultados: result) {
			System.out.println(resultados);
		}
		System.out.println("------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'V').findFirst().orElse(null);
		if (name == null) {
			System.out.println("Não encontrado");
		}
		

	}

}
