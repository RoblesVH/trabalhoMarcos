import java.time.LocalDate;

public class Psicologo extends Pessoa implements PainelTriagem {

    private int crp;
    private int senha;

    public Psicologo(String nome, LocalDate dataNascimento, String email,
                     int crp, int senha, String tipo) {

        super(nome, dataNascimento, email, tipo);
        this.crp = crp;
        this.senha = senha;
    }

    @Override
    public void acionarEmergencia() {
        System.out.println("Emergência Acionada");
    }

    public void definirMeta(Paciente paciente, Meta meta) {
        paciente.adicionarMeta(meta);
    }
}