package collections.plantier.mapas;

public class Produto {

	private int id;
	private String descricao;
	
	public Produto(int id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + "]";
	}
		
}
