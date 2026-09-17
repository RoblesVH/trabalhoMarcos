import java.time.LocalDate;

public abstract class Pessoa {

    protected String nome;
    protected LocalDate dataNascimento;
    protected String email;
    protected String tipo;

    public Pessoa(String nome, LocalDate dataNascimento, String email, String tipo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.tipo = tipo;
    }
}
