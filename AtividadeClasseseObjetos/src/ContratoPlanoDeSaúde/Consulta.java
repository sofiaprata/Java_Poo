package ContratoPlanoDeSaúde;


public class Consulta {
	//atributos
    private String data;
    private String descricao;
    private ProfissionalSaude profissional;

    //construtores
    public Consulta(String data, String descricao, ProfissionalSaude profissional) {
        this.data = data;
        this.descricao = descricao;
        this.setProfissional(profissional);
    }
    //getters e setters
    public String getData() {
    	return data;
    	}
    public void setData(String data) {
    	this.data = data;
    	}
    public String getDescricao() { 
    	return descricao;
    	}
    public void setDescricao(String descricao) {
    	this.descricao = descricao;
    	}
	public ProfissionalSaude getProfissional() {
		return profissional;
	}
	public void setProfissional(ProfissionalSaude profissional) {
		this.profissional = profissional;
	}
}
