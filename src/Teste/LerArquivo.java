package Teste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
	public static void main(String[] args) {

		try {
			File diretorio = new File("C:/Users/const/Desktop/");

			File arquivo = new File(diretorio, "arquivo.txt");
			FileReader ler = new FileReader(arquivo);

			BufferedReader leitura = new BufferedReader(ler);
			

			String linha = ""; 

			while ((linha = leitura.readLine()) != null) {
				System.out.println(linha);
			}
			System.out.println(linha);
			leitura.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
