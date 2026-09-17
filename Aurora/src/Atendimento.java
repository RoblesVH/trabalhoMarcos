public class Atendimento {
    private int id;
    private ProntuarioDeRisco prontuario;


    public Atendimento(int id, String nivelRisco) {
        this.prontuario = new ProntuarioDeRisco(nivelRisco);
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
