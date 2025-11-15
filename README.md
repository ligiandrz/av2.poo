##  Arquivos

- Pergunta (classe abstrata)
- PerguntaMultiplaEscolha
- PerguntaVerdadeiroFalso
- Pontuavel (interface)
- Jogador
- SistemaLogs
- Quiz (main)

## Conceitos de POO usados

- **Encapsulamento:** todos atributos privados, getters/setters com validação.
- **Herança:** tipos de perguntas herdam de `Pergunta`.
- **Polimorfismo:** lista de perguntas usa o tipo `Pergunta`.
- **Abstração:** `Pergunta` é abstrata e define o método `verificarResposta`.
- **Interface:** `Pontuavel` define `calcularPontuacao`.
- **Sobrescrita:** subclasses implementam `verificarResposta`.
- **Sobrecarga:** `SistemaLogs` possui vários métodos `registrarEvento`.
- **Composição:** `Quiz` usa `Jogador` e uma lista de `Pergunta`.
- **Atributos estáticos:** contador total de quizzes.

## Funcionamento

1. Jogador informa nome.
2. 4 perguntas são feitas (2 múltipla escolha, 2 V/F).
3. Sistema verifica respostas e soma pontos.
4. Jogador pode repetir o quiz.
5. Mostra pontuação final e número de rodadas.
