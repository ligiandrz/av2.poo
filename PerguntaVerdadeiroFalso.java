public class PerguntaVerdadeiroFalso extends Pergunta {
    private boolean respostaCorreta;

    public PerguntaVerdadeiroFalso(String enunciado, int pontosBase, boolean respostaCorreta) {
        super(enunciado, pontosBase);
        this.respostaCorreta = respostaCorreta;
    }

    public boolean isRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(boolean respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

    @Override
    public boolean verificarResposta(String resposta) {
        if (resposta == null) return false;
        String r = normalizar(resposta);
        if (r.equals("v") || r.equals("verdadeiro") || r.equals("true") || r.equals("s") || r.equals("sim")) {
            return respostaCorreta == true;
        }

        if (r.equals("f") || r.equals("falso") || r.equals("false") || r.equals("n") || r.equals("nao")) {
            return respostaCorreta == false;
        }

        return false;
    }

    @Override
    public int calcularPontuacao(boolean correta) {
        return correta ? getPontosBase() + 1 : 0;
    }
}
