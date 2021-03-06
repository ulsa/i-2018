package integracao2018;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio3 {

	public static void main(String[] args) throws IOException {

		/*
		 * Escreva um programa (linha de comandos) que exibe o conte�do de arquivo
		 * texto, formato UTF-8, na sa�da padr�o. O �nico argumento � o nome do arquivo
		 * a ser exibido.
		 */

		// Get the input file and data
		File file = new File(args[0]);
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(isr);
		
		String linha;
		while ((linha = br.readLine()) != null) {
		   System.out.println(linha);
		}
		
		br.close();
		// 
		try {
			int ch;
			while ((ch = fis.read()) != -1) {
				sb.append((char) ch);
			}

			fis.close();
			System.out.println(sb);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
