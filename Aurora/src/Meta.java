import java.time.LocalDate;

public class Meta {

    private String meta;
    private boolean concluido;
    private LocalDate prazo;

    public Meta(String meta, LocalDate prazo) {
        this.meta = meta;
        this.prazo = prazo;
        this.concluido = false;
    }

    public void concluirMeta() {
        this.concluido = true;
    }

    public String getMeta() {
        return meta;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public LocalDate getPrazo() {
        return prazo;
    }
}