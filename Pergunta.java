import java.text.Normalizer;
public abstract class Pergunta implements Pontuavel {
    private String enunciado;
    private int pontosBase;

    public Pergunta(String enunciado, int pontosBase) {
        setEnunciado(enunciado);
        setPontosBase(pontosBase);
    }
    protected String normalizar(String texto) {
        if (texto == null) return "";
        String s = texto.trim().toLowerCase();
        s = Normalizer.normalize(s, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        return s;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        if (enunciado == null || enunciado.trim().isEmpty()) {
            throw new IllegalArgumentException("O enunciado não pode ser vazio.");
        }
        this.enunciado = enunciado.trim();
    }

    public int getPontosBase() {
        return pontosBase;
    }

    public void setPontosBase(int pontosBase) {
        if (pontosBase < 0) {
            throw new IllegalArgumentException("Pontos não podem ser negativos.");
        }
        this.pontosBase = pontosBase;
    }

    public abstract boolean verificarResposta(String resposta);
}

