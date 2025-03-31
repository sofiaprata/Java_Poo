package ContratoPlanoDeSaúde;

import java.util.List;

public class Contrato {
		//atributos
	    private String numero;
	    private String dataAssinatura;
	    private Titular titular;
	    private List<Dependente> dependentes;
	    private Fatura fatura;

	    //construtores
	    public Contrato(String numero, String dataAssinatura, Titular titular, List<Dependente> dependentes, Fatura fatura) {
	        this.numero = numero;
	        this.dataAssinatura = dataAssinatura;
	        this.setTitular(titular);
	        this.dependentes = dependentes;
	        this.fatura = fatura;
	    }
	    
	    //operações
	    public void adicionarPessoa(Dependente dependente) {
	        dependentes.add(dependente);
	    }

	    public Fatura gerarFatura() {
	    	return fatura;
	    }

	    //getters e setters
	    public String getNumero() { 
	    	return numero;
	    	}
	    public void setNumero(String numero) {
	    	this.numero = numero; 
	    	}
	    public String getDataAssinatura() {
	    	return dataAssinatura; 
	    	}
	    public void setDataAssinatura(String dataAssinatura) {
	    	this.dataAssinatura = dataAssinatura; 
	    	}

		public Titular getTitular() {
			return titular;
		}

		public void setTitular(Titular titular) {
			this.titular = titular;
		}
	}

