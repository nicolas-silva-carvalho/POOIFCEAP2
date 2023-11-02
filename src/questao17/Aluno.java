package questao17;

public class Aluno extends Pessoa{
	public Aluno(int idade, String nome) {
		super(idade, nome);
	}
}

//O que acontece se vocÃª nÃ£o usar a palavra-chave super() no construtor de uma classe filha? A classe pai ainda Ã© inicializada?
/*Se o construtor da classe pai for padrão não é necessario chamar o super pois debaixo dos panos o java inicia esse construtor
implicitamente para o usuario, porém se a pessoa criar um construtor com algum parametro é necesario chamar o super do
construtor da classe pai na classe filha passando o parametro necessario para iniciar a classe pai*/ 