public class PerguntaMultiplaEscolha extends Pergunta {
    private String[] opcoes;
    private String respostaCorreta;

    public PerguntaMultiplaEscolha(String enunciado, int pontosBase, String[] opcoes, String respostaCorreta) {
        super(enunciado, pontosBase);
        if (opcoes == null || opcoes.length < 2) {
            throw new IllegalArgumentException("Devem existir pelo menos 2 opções.");
        }
        this.opcoes = opcoes.clone();
        setRespostaCorreta(respostaCorreta);
    }

    public String[] getOpcoes() {
        return opcoes.clone();
    }

    public void setOpcoes(String[] opcoes) {
        if (opcoes == null || opcoes.length < 2) {
            throw new IllegalArgumentException("Devem existir pelo menos 2 opções.");
        }
        this.opcoes = opcoes.clone();
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(String respostaCorreta) {
        if (respostaCorreta == null || respostaCorreta.trim().isEmpty()) {
            throw new IllegalArgumentException("Resposta correta inválida.");
        }
        this.respostaCorreta = respostaCorreta.trim();
    }

    public void exibirOpcoes() {
        for (int i = 0; i < opcoes.length; i++) {
            char letra = (char) ('a' + i);
            System.out.println(letra + ") " + opcoes[i]);
        }
    }

    @Override
    public boolean verificarResposta(String resposta) {
        if (resposta == null) return false;
        String r = normalizar(resposta);

        if (r.length() == 1 && Character.isLetter(r.charAt(0))) {
            int idx = r.charAt(0) - 'a';
            if (idx >= 0 && idx < opcoes.length) {
                return normalizar(opcoes[idx]).equals(normalizar(respostaCorreta));
            }
        }

        try {
            int n = Integer.parseInt(r);
            if (n >= 1 && n <= opcoes.length) {
                return normalizar(opcoes[n - 1]).equals(normalizar(respostaCorreta));
            }
        } catch (NumberFormatException ex) {
        }

        return normalizar(respostaCorreta).equals(r);
    }

    @Override
    public int calcularPontuacao(boolean correta) {
        return correta ? getPontosBase() : 0;
    }
}

