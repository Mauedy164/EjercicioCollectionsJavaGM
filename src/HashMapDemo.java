import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> user = new HashMap<Integer, String>();
		
		
		user.put(1, "Jhon Doe");
		user.put(2, "Patrick Star");
		user.put(3, "Jane Doe");
		user.put(4, "Isaac Clarke");
		user.put(5, "Marie Curie");
		
		
		
		
		System.out.println(user);
		System.out.println(user.get(2));
		System.out.println(user.keySet());
		System.out.println(user.values());
		
		//Recorrer por key
		for(Integer clave : user.keySet()) {
			System.out.println(clave);
		} //for
		
		// Recorrer por valor
		
		for(String nombre : user.values()) {
			System.out.println(nombre);
		}
	}

}
