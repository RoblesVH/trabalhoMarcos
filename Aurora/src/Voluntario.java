import java.time.LocalDate;

public class Voluntario extends Pessoa implements PainelTriagem {

    private int senha;

    public Voluntario(String nome, LocalDate dataNascimento, String email,
                      int senha, String tipo) {

        super(nome, dataNascimento, email, tipo);
        this.senha = senha;
    }

    @Override
    public void acionarEmergencia() {
        System.out.println("Emergência Acionada");
    }
}