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
	public int hashCode() {
		//return (int) (Math.random() * 10); // Implementação errada; objetos iguais devem ir para o mesmo "balde"
		
		return String.valueOf(id).hashCode(); // ok!
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		if (this == obj)
			return true;
		
		if (!(obj instanceof Produto)){
			return false;
		}

		Produto other = (Produto) obj;
		if(this.id == other.getId()) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + "]";
	}
	
}
