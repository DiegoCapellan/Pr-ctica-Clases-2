package principal;
import java.util.Random;
import java.util.Scanner;

public class PrincipalPassword {


	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int tamaño = 0;
		Password[] vPassword;
		boolean[] vSeguridad;
		
		System.out.println("Dime el Tamaño del Array de Contraseñas");
		tamaño = leer.nextInt();
		vPassword = new Password[tamaño];
		vSeguridad = new boolean[tamaño];
		
		System.out.println("Dime la Longitud de las Contraseñas");
		tamaño = leer.nextInt();
		
		
		for (int i = 0; i < vPassword.length; i++) {
			vPassword[i] = new Password(tamaño);
			vSeguridad[i] = vPassword[i].esFuerte();
			System.out.println(vPassword[i].getContraseña() + " - " + vSeguridad[i]);
		}
		
		Usuario usu = new Usuario("Diego");
		usu.añadirContraseña();
		usu.añadirContraseña();
		usu.añadirContraseña();
		usu.verTodasContraseñas();
		
		
	}
}