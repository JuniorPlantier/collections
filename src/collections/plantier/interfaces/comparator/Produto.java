package collections.plantier.interfaces.comparator;

public class Produto implements Comparable<Produto>{

	private int id;
	private String descricao;
	private double valor;
	
	public Produto(int id, String descricao, double valor) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", valor=" + valor + "]";
	}

	@Override
	public int compareTo(Produto o) {
		if(this.valor == o.valor) {
			return 0;
		}
		
		if(this.valor > o.valor) {
			return 1;
		}
	
		return -1;
	}

}
