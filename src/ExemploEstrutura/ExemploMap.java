package ExemploEstrutura;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExemploMap {
	public static void main(String[] args) {

	HashMap<Integer, String> map = new HashMap<Integer, String>();
	
	map.put(1, "Amanda");
	map.put(2,"Evelyn");
	map.put(128,"Roger");
	
	map.forEach((key, valor) -> {
		System.out.println("posição no ranking" + key);
		System.out.println("nome: " +valor);
		
	}) ;
	Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
	while(iterator.hasNext()) {
		Map.Entry<Integer, String>entry = iterator.next();
		System.out.println("key" +entry.getKey() + "nome: " + entry.getValue());
	}
	for(Map.Entry<Integer, String> entry : map.entrySet()) {
		System.out.println(entry.getKey() + "==" + entry.getValue());
	}
	map.entrySet().stream().forEach(entry -> {
		System.out.println(entry.getKey() + "==" + entry.getValue());	
	});
	
	Hashtable<Integer, String> table = new Hashtable<Integer, String>();
	
	table.put(300, "Amanda");
	table.put(1, "Evelyn");
	table.put(2, "Roger");
	
	Enumeration<Integer> keys = table.keys();
	while(keys.hasMoreElements()){
		int key = keys.nextElement();
		String value = table.get(key);
		System.out.println(key + " = " + value );
		
	}
	for(Map.Entry<Integer, String>entry : table.entrySet()) {
		System.out.println(entry.getKey() + " = " + entry.getValue());
	}
	table.entrySet().stream().forEach(Entry -> {
		System.out.println(Entry.getKey() + " = " + Entry.getValue());
	});
	
	LinkedHashMap<String, Integer> map1 = new LinkedHashMap<>();
	map1.put("Um", 1);
	map1.put("Dois", 2);
	map1.put("Três", 3); 
	
	
	TreeMap<String, Integer> map2 = new TreeMap<>();
	map2.put("Um", 1);
	map2.put("Dois", 2);
	map2.put("Três", 3); 
	
	
	}
	}


