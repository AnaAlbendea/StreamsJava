package Streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class S01TecladoYConsola {

	public static void main(String[] args) throws IOException {
		System.out.println("Mensaje normal");
		System.err.println("Mensaje de error");
		
		
		Scanner tec=new Scanner(System.in);
		String algo=tec.nextLine();
		System.out.println("Leido con Scanner"+algo);
		
		//antes
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		algo=br.readLine();
		System.out.println("Leido con BufferedReader"+algo);

	}

}
