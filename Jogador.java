public class Jogador {
    private String nome;
    private int pontuacao;

    public Jogador(String nome) {
        setNome(nome);
        this.pontuacao = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido.");
        }
        this.nome = nome.trim();
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        if (pontuacao < 0) {
            throw new IllegalArgumentException("Pontuação não pode ser negativa.");
        }
        this.pontuacao = pontuacao;
    }

    public void adicionarPontos(int pontos) {
        setPontuacao(this.pontuacao + pontos);
    }

    @Override
    public String toString() {
        return nome + " (Pontuação: " + pontuacao + ")";
    }
}


