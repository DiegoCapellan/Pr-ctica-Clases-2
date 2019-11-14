package principal;

import java.util.Arrays;
import java.util.Scanner;

public class Usuario {

	private String nombre;
	private Password[] vContrase�as;
	
	public Usuario() {
		nombre = "";
		vContrase�as = new Password[100];
	}
	
	public Usuario (String nombre, int numPassword) {
		this.nombre = nombre;
		vContrase�as = new Password[numPassword];
	}
	
	public Usuario(String nombre) {
		this.nombre = nombre;
		vContrase�as = new Password[100];
	}
	
	public void a�adirContrase�a() {
		Scanner leer = new Scanner(System.in);
		int tama�o;
		
		System.out.println("Dime el Tama�o de la Contrase�a");
		tama�o = leer.nextInt();
		
		for (int i = 0; i < vContrase�as.length; i++) {
			if (vContrase�as[i]==null) {
				vContrase�as[i] = new Password(tama�o);
				break;
			}
		}
	}
	
	public void verTodasContrase�as() {
		for (int i = 0; i < vContrase�as.length; i++) {
			if (vContrase�as[i]!=null) {
				System.out.println(vContrase�as[i]);
			}
		}
	}

	@Override
	public String toString() {
		String contrase�as = "";
		for (int i = 0; i < vContrase�as.length; i++) {
			if (vContrase�as[i]!=null) {
				contrase�as += vContrase�as[i] + "\n";
				}
			}
		return nombre + "Contrase�as: \n"
				+ contrase�as;
	}
}
