package ExemploEstrutura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploCollections {

	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Amanda");
		arrayList.add("Evelyn");
		arrayList.add("Roger");
		arrayList.add("Arthur");
		
		// Ordenar

		Collections.sort(arrayList);
		
		// Imprimindo o resultado
		System.out.println(arrayList);




	}

}
