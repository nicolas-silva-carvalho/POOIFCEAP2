package questao4;

import java.util.Arrays;

//Relacionamento entre Classes:    
//Crie uma classe `Biblioteca` que contÃ©m uma lista de livros representados por outra classe `Livro`. 
//Implemente mÃ©todos para adicionar, remover e listar os livros na biblioteca.

public class Biblioteca {
    public Livro[] livros;
    int indice = 0;
    
    public void adicionar(Livro livro) {
        if (indice < livros.length) {
            livros[indice] = livro;
            indice++;
        }
    }
    
    public void remover(Livro livro) {
    	for (int i = 0; i < livros.length; i++) {
            if (livros[i].nomeDoLivro.equals(livro.nomeDoLivro)) {
                for (int j = i; j < livros.length - 1; j++) {
                    livros[j] = livros[j + 1];
                }
                livros[livros.length - 1] = null;
                break;
            }
        }
    }

    public void listar() {
    	System.out.println("====Biblioteca====");
    	for(Livro livro : livros) {
    		if (livro != null) {
                System.out.println("Livro: " + livro.nomeDoLivro);
            }
    	}
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.livros = new Livro[5];
        
        Livro star = new Livro();
        star.nomeDoLivro = "Star Wars";
        
        Livro cor = new Livro();
        cor.nomeDoLivro = "Cores da vida";
        
        Livro guerra = new Livro();
        guerra.nomeDoLivro = "Guerra infinita";
        
        biblioteca.adicionar(star);
        biblioteca.adicionar(cor);
        biblioteca.adicionar(guerra);
        
        biblioteca.remover(star);
        biblioteca.listar();
    }
}

