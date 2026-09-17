import java.time.LocalDate;
import java.util.ArrayList;

public class Paciente extends Pessoa {

    private String nivelUrgencia;
    private ArrayList<Meta> metas = new ArrayList<>();

    public Paciente(String nome, LocalDate dataNascimento, String email,
                    String nivelUrgencia, String tipo) {

        super(nome, dataNascimento, email, tipo);
        this.nivelUrgencia = nivelUrgencia;
    }

    public void adicionarMeta(Meta meta) {
        metas.add(meta);
    }

    public void concluirMeta(Meta meta) {
        meta.concluirMeta();
    }
}