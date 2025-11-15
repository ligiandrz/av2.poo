import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SistemaLogs {
    private static final DateTimeFormatter F = DateTimeFormatter.ofPattern("HH:mm:ss");

    private static String horaAtual() {
        return LocalTime.now().format(F);
    }

    public static void registrarEvento(String mensagem) {
        System.out.println("[" + horaAtual() + "] " + mensagem);
    }

    public static void registrarEvento(String mensagem, int nivel) {
        System.out.println("[" + horaAtual() + "] (NIVEL " + nivel + ") " + mensagem);
    }

    public static void registrarEvento(String mensagem, Jogador jogador) {
        System.out.println("[" + horaAtual() + "] " + mensagem + " | Jogador: " + jogador.getNome());
    }

    public static void registrarEvento(String mensagem, Pergunta pergunta) {
        System.out.println("[" + horaAtual() + "] " + mensagem + "\n" + pergunta.getEnunciado());
    }
}


