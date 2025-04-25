

// encapsulamento
// public
// private
// protected
// package

public class Aluno {
    
    // variaveis = atributos
    // caracteristicas
    
    private String nome; // atributo do tipo String
    private int idade; // atributo do tipo Numero
    private boolean temFaculdade; // atributo do tipo Booleano (0 e 1)
    // classes wrappers
    public static void main(String[] args) throws Exception {
    
        
        
    
    }

    public String getNome() { // metodo para pegar o nome
        return nome;
    }
    public int getIdade() { // metodo para pegar a idade
        return idade;
    }
    public boolean getTemFaculdade() { // metodo para pegar temFaculdade
        return temFaculdade;
    }

    public Aluno(){

    }

    public Aluno(String nome, int idade, boolean temFaculdade){
        this.nome = nome;
        this.idade = idade;
        this.temFaculdade = temFaculdade;
    }




}
