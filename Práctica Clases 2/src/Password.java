package principal;
import java.util.Random;
import java.util.Scanner;

public class Password {
	
	private int longitud;
	private String contrase�a;

	public Password() {
		longitud = 8;
		generarContrase�a();
	}
	
	public Password(int longitud) {
		generarContrase�a();
		this.longitud = longitud;
	}
	
	
	public boolean esFuerte() { //True: la password es fuerte, False: la password es debil
		int numMayusculas, numMinusculas, numNumeros;
		numMayusculas = 0;
		numMinusculas = 0;
		numNumeros = 0;
		
		for (int i = 0; i < this.contrase�a.length(); i++) {
			char aux = contrase�a.charAt(i);
			
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
	
	private void generarContrase�a() {
		Scanner leer = new Scanner(System.in);
		Random r = new Random();
		
		String contrase�a= "";
		String mayusculas = "ABCDEFGHIJKLMN�OPQRSTUVWXYZ";
		String minusculas = "abcdefghijklmn�opqrstuvwxyz"; 
		
		for (int i= 0; i < longitud; i++) {
			switch (r.nextInt(3)) {
			case 0:
				contrase�a += Integer.toString(r.nextInt(10));
				break;
			case 1:
				int pos = r.nextInt(mayusculas.length());
				//Primera Opci�n para lo mismo
				contrase�a += mayusculas.substring(pos, pos+1);
				break;
			default:
				pos = r.nextInt(minusculas.length());
				//Seguna Opci�n
				contrase�a += minusculas.charAt(pos);
				break;
			}
		}
		this.contrase�a = contrase�a;
	}

	private void generarContrase�a(int ascii) {
		Scanner leer = new Scanner(System.in);
		Random r = new Random();
		
		String contrase�a= ""; 
		
		for (int i= 0; i < longitud; i++) {
			switch (r.nextInt(3)) {
			case 0:
				contrase�a += Integer.toString(r.nextInt(10));
				break;
			case 1:
				char aux = (char) (r.nextInt(26)+65);
				contrase�a += aux;
				break;
			default:
				aux = (char) (r.nextInt(26)+97);
				contrase�a += aux;
				break;
			}
		}
		this.contrase�a = contrase�a;
	}
	
	@Override
	public String toString() {
		String fuerte = "";
		if (this.esFuerte())
			fuerte = "Fuerte";
		else
			fuerte = "D�bil";
			
		return "Contrase�a =" + contrase�a + " es " + fuerte;
	}
	
	//Getter's y Setter's

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}
	
}