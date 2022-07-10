package Teste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeituraUTF {

	public static void main(String[] args) {
		try {
			File diretorio = new File("C:/Users/const/Desktop/");

			File arquivo = new File(diretorio, "arquivo.txt");

			BufferedReader leitura = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo), "UTF-8"));

			String linha = "";

			List<String> coisas = new ArrayList<>();

			while ((linha = leitura.readLine()) != null) {
				coisas = Arrays.asList(linha.split(";"));
			}

			System.out.println(coisas);
			
			leitura.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
