package Entidades;

public class ProdutoPerecivel extends Produto {
	private String dataValidade;
	private double temperaturaResfriamento;
	
	public ProdutoPerecivel(String dataValidade, double temperaturaResfriamento) {
		super();
		this.dataValidade = dataValidade;
		this.temperaturaResfriamento = temperaturaResfriamento;
	}

	public ProdutoPerecivel() {
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public double getTemperaturaResfriamento() {
		return temperaturaResfriamento;
	}

	public void setTemperaturaResfriamento(double temperaturaResfriamento) {
		this.temperaturaResfriamento = temperaturaResfriamento;
	}

}
