package Streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class S03LeerFicheroV1 {

	public static void main(String[] args) {
		String fichero="d:\\Datos\\ContactoDao.java";
		System.out.println(leeFichero(fichero));
	
	}
	public static String leeFichero(String fichero) { //caso tipico  stringBuilder
		StringBuilder resultado=new StringBuilder();
		try (BufferedReader br=new BufferedReader(new FileReader(fichero));) { //se cierra automaticamente
			String leido;
			while((leido = br.readLine())!=null) {
				resultado.append(leido+"\n");
				System.out.println(leido);		
			}	

		} catch(FileNotFoundException e) {
			System.out.println("El fichero"+ fichero +"no existe o no tiene acceso");
		} catch(IOException e) {
			System.out.println("No se puede leer"+fichero);
		} 
		return resultado.toString();
	}
}
