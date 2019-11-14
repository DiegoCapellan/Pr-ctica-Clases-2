package principal;
import java.util.Random;
import java.util.Scanner;

public class Password {
	
	private int longitud;
	private String contraseña;

	public Password() {
		longitud = 8;
		generarContraseña();
	}
	
	public Password(int longitud) {
		generarContraseña();
		this.longitud = longitud;
	}
	
	
	public boolean esFuerte() { //True: la password es fuerte, False: la password es debil
		int numMayusculas, numMinusculas, numNumeros;
		numMayusculas = 0;
		numMinusculas = 0;
		numNumeros = 0;
		
		for (int i = 0; i < this.contraseña.length(); i++) {
			char aux = contraseña.charAt(i);
			
			if ( ((int) aux) > 64 && ((int) aux) < 91) {
				numMayusculas++;
				}else {
					if ( ((int) aux) > 96 && ((int) aux) < 123) {
						numMinusculas++;
					}else {
						numNumeros++;
					}
				}
			}
		
		if (numMayusculas > 2 && numMinusculas > 1 && numNumeros > 5) {
			return true;
		}
		return false;
	}
	
	private void generarContraseña() {
		Scanner leer = new Scanner(System.in);
		Random r = new Random();
		
		String contraseña= "";
		String mayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		String minusculas = "abcdefghijklmnñopqrstuvwxyz"; 
		
		for (int i= 0; i < longitud; i++) {
			switch (r.nextInt(3)) {
			case 0:
				contraseña += Integer.toString(r.nextInt(10));
				break;
			case 1:
				int pos = r.nextInt(mayusculas.length());
				//Primera Opción para lo mismo
				contraseña += mayusculas.substring(pos, pos+1);
				break;
			default:
				pos = r.nextInt(minusculas.length());
				//Seguna Opción
				contraseña += minusculas.charAt(pos);
				break;
			}
		}
		this.contraseña = contraseña;
	}

	private void generarContraseña(int ascii) {
		Scanner leer = new Scanner(System.in);
		Random r = new Random();
		
		String contraseña= ""; 
		
		for (int i= 0; i < longitud; i++) {
			switch (r.nextInt(3)) {
			case 0:
				contraseña += Integer.toString(r.nextInt(10));
				break;
			case 1:
				char aux = (char) (r.nextInt(26)+65);
				contraseña += aux;
				break;
			default:
				aux = (char) (r.nextInt(26)+97);
				contraseña += aux;
				break;
			}
		}
		this.contraseña = contraseña;
	}
	
	@Override
	public String toString() {
		String fuerte = "";
		if (this.esFuerte())
			fuerte = "Fuerte";
		else
			fuerte = "Débil";
			
		return "Contraseña =" + contraseña + " es " + fuerte;
	}
	
	//Getter's y Setter's

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}
	
}