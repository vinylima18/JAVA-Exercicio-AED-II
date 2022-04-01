import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


class Serie {
	private String nome;
	private String formato;
	private String duracao;
	private String paisOrigem;
	private String idiomaOrigem;
	private String emissoraTv;
	private String dataInicioTransmissao;
	private int numTemporadas;
	private int numEpisodios;



	Serie() {
		nome = "";
		formato = "";
		duracao = "";
		paisOrigem = "";
		idiomaOrigem = "";
		emissoraTv = "";
		dataInicioTransmissao = "";
		numTemporadas = 0;
		numEpisodios = 0;
	}


	public void imprimir( ) {
		System.out.println(this.nome+  " ## ");
		System.out.println(  this.formato+  " ## ");
		System.out.println(  this.duracao+  " ## ");
		System.out.println(  this.paisOrigem+  " ## ");
		System.out.println(  this.idiomaOrigem+  " ## ");
		System.out.println(  this.emissoraTv+  " ## ");
		System.out.println(  this.dataInicioTransmissao+  " ## ");
		System.out.println(  this.numTemporadas+  " ## ");
		System.out.println(  this.numEpisodios);
		System.out.println();

	}

	public void ler(String linha) {

		String[] info = linha.split(";");

		this.setNome(info[0]);
		this.setFormato(info[1]);
		this.setDuracao(info[2]);
		this.setPaisOrigem(info[3]);
		this.setIdiomaOrigem(info[4]);
		this.setEmissoraTv(info[5]);
		this.setDataInicioTransmissao(info[6]);
		this.setNumTemporadas(Integer.parseInt(info[7]));
		this.setNumEpisodios(Integer.parseInt(info[8]));

	}





	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getPaisOrigem() {
		return paisOrigem;
	}
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	public String getIdiomaOrigem() {
		return idiomaOrigem;
	}
	public void setIdiomaOrigem(String idiomaOrigem) {
		this.idiomaOrigem = idiomaOrigem;
	}
	public String getEmissoraTv() {
		return emissoraTv;
	}
	public void setEmissoraTv(String emissoraTv) {
		this.emissoraTv = emissoraTv;
	}
	public String getDataInicioTransmissao() {
		return dataInicioTransmissao;
	}
	public void setDataInicioTransmissao(String dataInicioTransmissao) {
		this.dataInicioTransmissao = dataInicioTransmissao;
	}
	public int getNumTemporadas() {
		return numTemporadas;
	}
	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}
	public int getNumEpisodios() {
		return numEpisodios;
	}
	public void setNumEpisodios(int numEpisodios) {
		this.numEpisodios = numEpisodios;
	}



}


public class Main {

	public static void main(String[] args) {
			
		
		
			
		
		
		try {
			
			File f = new File("C:\\Users\\viniciusrl\\Documents\\aed serie\\entrada.in");
			
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String tamVetor = br.readLine();
			int num = Integer.parseInt(tamVetor);
			
			
			Serie vetorSerie [] = new Serie [num];
			
			
			for(int i = 0; i < num;i++) {



				vetorSerie[i] = new Serie();
				vetorSerie[i].ler(br.readLine());
			}



			
			do {
				
				
				
				
				String line  = br.readLine();
				
				
				for(int i = 0; i<num;i++) {
					if(vetorSerie[i].getNome().equals(line)) {
						vetorSerie[i].imprimir();
					}
				}
				
				
				
				
			} while (!br.equals("FIM"));
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		

	}

}
