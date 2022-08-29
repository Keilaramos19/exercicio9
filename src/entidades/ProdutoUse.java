package entidades;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUse extends Produto {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
		private Date dataFabricacao;

		public ProdutoUse(String nome, Double preco, Date dataFabricacao) {
			super(nome, preco);
			this.dataFabricacao = dataFabricacao;
	}

	public Date getdataFabricacao() {
		return dataFabricacao;
	}

	public void setdataFabricacao(Date dataFabricacao) {
			this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public String etiquetaPreco() {
		return getNome() 
				+ " (usado) $ " 
				+ String.format("%.2f", getPreco())
				+ " (Data de Fabricação: "
				+ sdf.format(dataFabricacao)
				+ ")";
	}
}