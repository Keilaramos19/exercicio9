package entidades;

public class ProdutoImport extends Produto {

	private Double taxaAlfandegaria;

	public ProdutoImport(String nome, Double preco, Double taxaAlfandegaria) {
		super(nome, preco);
		this.taxaAlfandegaria = taxaAlfandegaria;
	}

	public Double gettaxaAlfandegaria() {
		return taxaAlfandegaria;
	}

	public void settaxaAlfandegaria(Double taxaAlfandegaria) {
		this.taxaAlfandegaria = taxaAlfandegaria;
	}
	
	public Double totalPreco() {
		return getPreco() + taxaAlfandegaria;
	}
	
	@Override
	public String etiquetaPreco() {
		return getNome() 
				+ " $ " 
				+ String.format("%.2f", totalPreco())
				+ " (Taxa da Alfandegaria: $ " 
				+ String.format("%.2f", taxaAlfandegaria)
				+ ")";

	}
}