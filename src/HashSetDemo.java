import java.util.HashSet;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> autos = new HashSet<String>();
		
		autos.add("BMW");
		autos.add("Volvo");
		autos.add("Audi");
		autos.add("Nissan");
		autos.add("BMW");
		autos.add("Honda");
		
		
		System.out.println(autos);
		System.out.println(autos.size());
		autos.remove("Honda");
		
		System.out.println(autos);
		System.out.println(autos.size());
		
		autos.clear(); //Elimina todos los elementos
		
		System.out.println(autos);
		System.out.println(autos.size());
		
	}

}
