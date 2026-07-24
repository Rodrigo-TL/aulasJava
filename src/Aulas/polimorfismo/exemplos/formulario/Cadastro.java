package Aulas.polimorfismo.exemplos.formulario;

public class Cadastro {
    private String nome;
    private int idade;
    private String cargo;
    private boolean ativo;

    public Cadastro (String nome, int idade, String cargo, boolean ativo){
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.ativo = ativo;
    }

    public Cadastro (String nome, int idade, boolean ativo){
        this.nome = nome;
        this.idade = idade;
        this.ativo = ativo;
    }

    public Cadastro (String nome, boolean ativo){
        this.nome = nome;
        this.ativo = ativo;
    }

    public Cadastro (String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cargo='" + cargo + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}