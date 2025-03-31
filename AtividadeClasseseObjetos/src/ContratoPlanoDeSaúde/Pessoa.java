package ContratoPlanoDeSaúde;

public class Pessoa {
	
	//atributos
	private String nome, endereco, sexo;
	private String dataDeNascimento;
	
	//construtor - inicialização dos objetos
    public Pessoa(String nome, String endereco, String dataDeNascimento, String sexo) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
    }
    
	//Getters e Setters
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	

}
