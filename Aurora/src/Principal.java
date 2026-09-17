import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Atendimento> atendimentos = new ArrayList<>();

        Atendimento a1 = new Atendimento(1, "Alto");
        Atendimento a2 = new Atendimento(2, "Baixo");

        atendimentos.add(a1);
        atendimentos.add(a2);

        excluirAtendimento(1, atendimentos);


        Paciente paciente = new Paciente(
                "João",
                LocalDate.of(2005, 5, 10),
                "joao@email.com",
                "Baixo",
                "Paciente"
        );

        Psicologo psicologo = new Psicologo(
                "Carlos",
                LocalDate.of(1985, 3, 20),
                "carlos@email.com",
                12345,
                1234,
                "Psicologo"
        );

        Meta meta1 = new Meta(
                "Caminhar 3 vezes na semana",
                LocalDate.of(2026, 9, 30)
        );

        psicologo.definirMeta(paciente, meta1);

        paciente.concluirMeta(meta1);

        System.out.println("Meta: " + meta1.getMeta());
        System.out.println("Concluída: " + meta1.isConcluido());
        System.out.println("Prazo: " + meta1.getPrazo());
    }


    public static boolean excluirAtendimento(
            int id,
            ArrayList<Atendimento> atendimentos) {

        for (Atendimento atendimento : atendimentos) {

            if (id == atendimento.getId()) {
                System.out.println("Atendimento Excluído");
                atendimentos.remove(atendimento);
                return true;
            }
        }

        System.out.println("Atendimento não encontrado");
        return false;
    }
}