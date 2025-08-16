package ArquivoEdatas;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FormatandoDatas {

	public static void main(String[] args) throws IOException {
		
		/*PrintStream escrita = new PrintStream("arquivo2.txt");
		
		System.out.println("ESCREVENDO E LENDO ARQUIVOS COM DATA");
		
		//ESCREVENDO ARQUIVO
		String dataHoje = JOptionPane.showInputDialog("informe a data de hoje:");
		String data = JOptionPane.showInputDialog("informe uma data:");
		
		escrita.println(dataHoje);
		escrita.println(data);
		
		escrita.close();
		
		System.out.println("arquivo escrito com sucesso!!");
		
		System.out.println("----------------------------------");
		*/

		//LENDO ARQUIVO
		InputStream leitura = new FileInputStream("arquivo.txt");
		Scanner sc = new Scanner(leitura);
		
		//LISTA PARA ARMAZENAR AS DATAS
		List<String> arquivoData = new ArrayList<>();
		
		System.out.println("leitura do arquivo:");
		while(sc.hasNextLine()) {
			//COLOCANDO AS DATAS DENTRO DA LISTA
			arquivoData.add(sc.nextLine());
		}
		//POSICAO DO MES
		int posicao = posicaoDoMes(arquivoData.get(0));
		
		
		sc.close();              
		leitura.close();
		
		System.out.println("----------------------------------");

		
			DateTimeFormatter formatando;
	
	        if(posicao == 0) {
	        	//INCLUINDO VARIAS MASCARAS PARA TER COMO FORMATO
	            formatando = DateTimeFormatter.ofPattern("[MM/dd/yyyy][MM-dd-yyyy][MM.dd.yyyy][MMddyyyy][MM dd yyyy][MM 'de' dd 'de' yyyy]");
	        }else {
	            formatando = DateTimeFormatter.ofPattern("[dd/MM/yyyy][dd-MM-yyyy][dd.MM.yyyy][ddMMyyyy][dd MM yyyy][dd 'de' MM 'de' yyyy]");
	        }
	       
	        LocalDate datas = LocalDate.parse(arquivoData.get(1), formatando);
	        System.out.println(datas);
	        DateTimeFormatter saida = DateTimeFormatter.ofPattern("[dd/MM/yyyy]");
	        System.out.println(saida.format(datas));
	    }

		//TRANSFORMANDO ARQUIVO EM LISTA
	 /* public static List<String> arquivoParaListaString(File file) throws FileNotFoundException, IOException {
	        List<String> datas = new ArrayList<>();
	        try (InputStream leitor = new FileInputStream(file); Scanner scanner = new Scanner(leitor)) {
	            while (scanner.hasNextLine()) {
	                datas.add(scanner.nextLine());
	            }
	        }
	        return datas;
	    }
	    */
	  
	    
	    public static int posicaoDoMes(String dataHoje) {
	        int mes = LocalDate.now().getMonthValue();
	        String[] aux = dataHoje.split("/");
	        int posicaoDoMes = 0;
	        for(int i = 0; i < aux.length; i++) {
	            if(Integer.parseInt(aux[i]) == mes) {
	                posicaoDoMes = i;
	                break;
	            }
	        }
	        return posicaoDoMes;

		
	}

}
