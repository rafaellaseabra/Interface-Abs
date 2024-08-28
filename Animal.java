package Interface;

public abstract class Animal {

	String nome;
	String sexo;
	String raca;

	public String getnome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public abstract void som();

	public abstract void dormir();

	public abstract void comer();

	public abstract void andar();

}
