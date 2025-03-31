package ContratoPlanoDeSaúde;


public class Exame {
	//atributos
    private String data;
    private String tipo;
    private ProfissionalSaude profissional;

    //construtores
    public Exame(String data, String tipo, ProfissionalSaude profissional) {
        this.data = data;
        this.setTipo(tipo);
        this.setProfissional(profissional);
    }
    
    //getters e setters
    public String getData() {
    	return data;
    	}
    public void setData(String data) {
    	this.data = data;
    	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public ProfissionalSaude getProfissional() {
		return profissional;
	}
	public void setProfissional(ProfissionalSaude profissional) {
		this.profissional = profissional;
	}
}
