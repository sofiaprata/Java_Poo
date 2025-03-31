package ContratoPlanoDeSaúde;

public class ProfissionalSaude {
	//atributos
    private String nome;
    private String especialidade;

    //construtores
    public ProfissionalSaude(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    //getters e setters
    public String getNome() {
    	return nome;
    	}
    public void setNome(String nome) {
    	this.nome = nome;
    	}
    public String getEspecialidade() {
    	return especialidade;
    	}
    public void setEspecialidade(String especialidade) {
    	this.especialidade = especialidade;
    	}
}
