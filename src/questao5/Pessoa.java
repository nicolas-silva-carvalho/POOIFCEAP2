package questao5;

//Modificadores de Acesso (Visibilidade):    
//Crie uma classe com membros privados e forneÃ§a mÃ©todos pÃºblicos para acessar e modificar esses membros.

public class Pessoa {
	private String nome;
	private int idade;
	private String cpf;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getidade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
