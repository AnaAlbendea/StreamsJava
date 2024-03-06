package Streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

import Streams.excepciones.MiReaderexcepcion;

public class S04LeerEntrada {

	public static void main(String[] args) throws IOException {
		//String respuesta=leer(System.in);
		//String respuesta=leer(new FileReader("d:\\Datos\\ContactoDao.java"));
		//String respuesta=leer(new URL("https://www.google.es").openStream());
		String respuesta=leer(new URL("https://www.elmundo.es/index.html").openStream());
		
		System.out.println(respuesta);
	}

	
	public static String leer(Reader r) {
		StringBuilder resultado=new StringBuilder();//se utiliza el StringBuilder para no estar concatenando y no cree objetos nuevo y sature la memoria
		try(BufferedReader br=new BufferedReader(r)){ //autoclose metiendo esto en el try se cierra solo el bufferedRead solo lee linea a linea
			String leido;
			while((leido=br.readLine())!=null){
				resultado.append(leido+"\n");
			}
		} catch(IOException e) {
			throw new MiReaderexcepcion("Error de lectura");//convertimos una cache a uncache.creamos una excepcion propia
		}
		return resultado.toString();	
		
	}
	
	public static String leer(InputStream is) throws MiReaderexcepcion {
		
		return leer( new InputStreamReader(is));
	}


}