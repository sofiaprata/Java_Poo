package ContratoPlanoDeSaúde;

public class Titular extends Pessoa {
	//atriutos
	private String numeroContrato;
	
	public Titular(String nome, String endereco, String dataNascimento, String sexo, String numeroContrato) {
        super(nome, endereco, dataNascimento, sexo);
        this.numeroContrato = numeroContrato;
    }

	
	//getters e setters
	public String getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

}
