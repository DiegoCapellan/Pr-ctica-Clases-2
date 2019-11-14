package principal;

import java.util.Arrays;
import java.util.Scanner;

public class Usuario {

	private String nombre;
	private Password[] vContraseñas;
	
	public Usuario() {
		nombre = "";
		vContraseñas = new Password[100];
	}
	
	public Usuario (String nombre, int numPassword) {
		this.nombre = nombre;
		vContraseñas = new Password[numPassword];
	}
	
	public Usuario(String nombre) {
		this.nombre = nombre;
		vContraseñas = new Password[100];
	}
	
	public void añadirContraseña() {
		Scanner leer = new Scanner(System.in);
		int tamaño;
		
		System.out.println("Dime el Tamaño de la Contraseña");
		tamaño = leer.nextInt();
		
		for (int i = 0; i < vContraseñas.length; i++) {
			if (vContraseñas[i]==null) {
				vContraseñas[i] = new Password(tamaño);
				break;
			}
		}
	}
	
	public void verTodasContraseñas() {
		for (int i = 0; i < vContraseñas.length; i++) {
			if (vContraseñas[i]!=null) {
				System.out.println(vContraseñas[i]);
			}
		}
	}

	@Override
	public String toString() {
		String contraseñas = "";
		for (int i = 0; i < vContraseñas.length; i++) {
			if (vContraseñas[i]!=null) {
				contraseñas += vContraseñas[i] + "\n";
				}
			}
		return nombre + "Contraseñas: \n"
				+ contraseñas;
	}
}
