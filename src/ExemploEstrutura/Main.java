package ExemploEstrutura;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import Models.GestaoEstudantes;
import Models.MenuHandler;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(new String("Pedro") == new String("Pedro"));
		System.out.println(new String("Pedro").equals(new String("Pedro")));
		GestaoEstudantes gs = new GestaoEstudantes();
		MenuHandler menu = new MenuHandler();
		System.out.println(gs.hashCode());
		System.out.println(menu.hashCode());
		System.out.println(gs);
		HashSet<String> set = new HashSet<>();
		set.add("Moto");
		System.out.print("Elementos do HashSet: ");
		for(String veiculo: set) {
			System.out.println(veiculo);
		}
		Iterator<String> iterator = set.iterator();
		LinkedHashSet<String> lkhash = new LinkedHashSet<String>();
		Iterator<String> iteratorLinked = lkhash.iterator();
		Set<String> setMap = new TreeSet<String>();
		Iterator<String> setMapIterator = setMap.iterator();
		System.out.print("Listando com iterator: ");
		while(iterator.hasNext()) {
			String item = iterator.next();
			System.out.println(item);
		}
		LinkedHashSet<String> set1 = new LinkedHashSet();
		set1.add("Carro");
		System.out.print("Elementos do LinkedHashSet: ");
		for(String veiculo: set1) {
			System.out.println(veiculo);
		}
 
		HashSet<Integer> number = new HashSet<Integer>();
		number.add(1);
		number.add(221);
		number.add(33);
		number.add(44);
		number.add(668);
		System.out.println("Elementos do HashSet: ");
		for (Integer numero : number) {
			System.out.println(numero);
		}
		System.out.println();
		LinkedHashSet<Integer> number1 = new LinkedHashSet<Integer>();
		number1.add(1);
		number1.add(221);
		number1.add(33);
		number1.add(44);
		System.out.println("Elementos do LinkedHashSet: ");
		for (Integer numeros : number1) {
			System.out.println(numeros);
		}
		Set treeSet = new TreeSet<Integer>(number);
		
		
		
		
		
		
		
		
		
		
		
	}			
	}


