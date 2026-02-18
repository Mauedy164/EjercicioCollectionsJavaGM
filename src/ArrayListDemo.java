import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(5);
		numeros.add(5);
		numeros.add(5);
		numeros.add(5);
		numeros.add(8);
		numeros.add(18);
		numeros.add(24);
		numeros.add(100);
		
		numeros.remove(7);
		
		
		System.out.println(numeros);
		System.out.println(numeros.size());
		
		System.out.println(numeros.indexOf(24));
		
		
		for(Integer numero : numeros){
			System.out.println(numero);
		}
	}

}
