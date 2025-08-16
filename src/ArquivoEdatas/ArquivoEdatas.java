package ArquivoEdatas;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class ArquivoEdatas {

	public static void main(String[] args) throws IOException {
		PrintStream escrita = new PrintStream("arquivo.txt");
	
		System.out.println("ESCREVENDO E LENDO ARQUIVOS COM DATA");
		
		//ESCREVENDO ARQUIVO
		String data = JOptionPane.showInputDialog("informe uma data:");
		String horario = JOptionPane.showInputDialog("informe o horário:");

		escrita.println(data);
		escrita.println(horario);
		
		escrita.close();
		
		System.out.println("arquivo escrito com sucesso!!");
		
		System.out.println("----------------------------------");
		

		//LENDO ARQUIVO
		InputStream leitura = new FileInputStream("arquivo.txt");
		Scanner sc = new Scanner(leitura);
		
		System.out.println("leitura do arquivo:");
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		sc.close();              
		leitura.close();
		
		System.out.println("----------------------------------");
		

		  //FORMATANDO DATA STRING PARA TIPO DATE
		
		
		    String[] dataSeparada = data.split("/");
			String[] horarioSeparado = horario.split(":");
			
			LocalDateTime formatter = LocalDateTime.of(Integer.parseInt(dataSeparada[2]), Integer.parseInt(dataSeparada[1]),Integer.parseInt(dataSeparada[0]), Integer.parseInt(horarioSeparado[0]), Integer.parseInt(horarioSeparado[1]));
			
			System.out.println("data formatada");
			System.out.println(formatter);
				

			System.out.println("----------------------------------");
			
			//FORMATANDO DATA STRING PARA TIPO PT-BR
			System.out.println("data em formato BR:");
			
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("[dd/MM/uuuu][dd 'de' MMM 'de' uuuu]", new Locale("pt", "BR"));
			LocalDate date = LocalDate.parse(data, formato); //OBTER A DATA

			DateTimeFormatter formatoSaida = DateTimeFormatter.ofPattern("dd/MM/uuuu");
			System.out.println(formatoSaida.format(date)+" "+ horario); 
		

		 
		
		

	
		
		
	}

}
