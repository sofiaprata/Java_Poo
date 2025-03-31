package ContratoPlanoDeSaúde;


public class Fatura {
	//atributos
    private double valorTotal;
    private String dataVencimento;
    private double percentualMulta;
    private double jurosPorDia;

    //construtores
    public Fatura(double valorTotal, String dataVencimento, double percentualMulta, double jurosPorDia) {
        this.valorTotal = valorTotal;
        this.setDataVencimento(dataVencimento);
        this.setPercentualMulta(percentualMulta);
        this.setJurosPorDia(jurosPorDia);
    }
    
    //getters e setters
    public double getValorTotal() {
    	return valorTotal;
    	}
    public void setValorTotal(double valorTotal) {
    	this.valorTotal = valorTotal;
    	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public double getPercentualMulta() {
		return percentualMulta;
	}

	public void setPercentualMulta(double percentualMulta) {
		this.percentualMulta = percentualMulta;
	}

	public double getJurosPorDia() {
		return jurosPorDia;
	}

	public void setJurosPorDia(double jurosPorDia) {
		this.jurosPorDia = jurosPorDia;
	}
}
