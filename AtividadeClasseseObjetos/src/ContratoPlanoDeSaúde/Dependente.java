package ContratoPlanoDeSaúde;

public class Dependente extends Pessoa{
	//atributos
	String relacaoComTitular;
	
	//construtor
	public Dependente(String nome, String endereco, String dataDeNascimento,String sexo ,String relacaoComTitular) {
		super(nome,endereco,dataDeNascimento,sexo);
		this.relacaoComTitular = relacaoComTitular;
	}
	//getters e setters
	public String getrelacaoComTitular() {
		return relacaoComTitular;
	}
	public void setrelacaoComTitular(String relacaoComTitular) {
		this.relacaoComTitular = relacaoComTitular;
	}
	
}
