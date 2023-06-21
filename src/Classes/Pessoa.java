package Classes;

public class Pessoa
{
    private String nome;
    private String dataNascimento;

    public Pessoa(String nome, String dataNascimento)
    {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString()
    {
        return "Nome: " + nome + "\nData de Nascimento: " + dataNascimento;
    }
}