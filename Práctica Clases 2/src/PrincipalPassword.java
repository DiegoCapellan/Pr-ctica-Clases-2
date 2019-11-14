package principal;
import java.util.Random;
import java.util.Scanner;

public class PrincipalPassword {


	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int tama�o = 0;
		Password[] vPassword;
		boolean[] vSeguridad;
		
		System.out.println("Dime el Tama�o del Array de Contrase�as");
		tama�o = leer.nextInt();
		vPassword = new Password[tama�o];
		vSeguridad = new boolean[tama�o];
		
		System.out.println("Dime la Longitud de las Contrase�as");
		tama�o = leer.nextInt();
		
		
		for (int i = 0; i < vPassword.length; i++) {
			vPassword[i] = new Password(tama�o);
			vSeguridad[i] = vPassword[i].esFuerte();
			System.out.println(vPassword[i].getContrase�a() + " - " + vSeguridad[i]);
		}
		
		Usuario usu = new Usuario("Diego");
		usu.a�adirContrase�a();
		usu.a�adirContrase�a();
		usu.a�adirContrase�a();
		usu.verTodasContrase�as();
		
		
	}
}