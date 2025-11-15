import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPontuacao = 0;
        int totalJogos = 0;

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        boolean repetir = true;

        while (repetir) {
            int pontuacaoRodada = 0;

            System.out.println("\nBem-vindo ao Quiz, " + nome + "!\n");

            // 1 
            Pergunta p1 = new PerguntaMultiplaEscolha(
                "Qual linguagem é usada para desenvolvimento Android?",
                1,
                new String[]{"Python", "Kotlin", "Ruby", "PHP"},
                "Kotlin"
            );

            System.out.println("1) " + p1.getEnunciado());
            System.out.println("a) Python");
            System.out.println("b) Kotlin");
            System.out.println("c) Ruby");
            System.out.println("d) PHP");
            System.out.print("Resposta: ");
            String r1 = sc.nextLine();

            if (p1.verificarResposta(r1)) pontuacaoRodada++;


            //2 
            Pergunta p2 = new PerguntaMultiplaEscolha(
                "Qual desses é um banco de dados relacional?",
                1,
                new String[]{"MongoDB", "Redis", "MySQL", "Neo4j"},
                "MySQL"
            );

            System.out.println("\n2) " + p2.getEnunciado());
            System.out.println("a) MongoDB");
            System.out.println("b) Redis");
            System.out.println("c) MySQL");
            System.out.println("d) Neo4j");
            System.out.print("Resposta: ");
            String r2 = sc.nextLine();

            if (p2.verificarResposta(r2)) pontuacaoRodada++;


            // 3
            Pergunta p3 = new PerguntaVerdadeiroFalso(
                "A linguagem Java é orientada a objetos.",
                1,
                true
            );

            System.out.println("\n3) (V/F) " + p3.getEnunciado());
            System.out.print("Resposta: ");
            String r3 = sc.nextLine();

            if (p3.verificarResposta(r3)) pontuacaoRodada++;


            //4
            Pergunta p4 = new PerguntaVerdadeiroFalso(
                "HTML é considerado uma linguagem de programação.",
                1,
                false
            );

            System.out.println("\n4) (V/F) " + p4.getEnunciado());
            System.out.print("Resposta: ");
            String r4 = sc.nextLine();

            if (p4.verificarResposta(r4)) pontuacaoRodada++;

            totalPontuacao += pontuacaoRodada;
            totalJogos++;

            System.out.println("\n-----------------------------");
            System.out.println("Fim da rodada, " + nome + "!");
            System.out.println("Você fez " + pontuacaoRodada + " pontos nessa rodada.");
            System.out.println("Pontuação acumulada TOTAL: " + totalPontuacao);
            System.out.println("Rodadas jogadas: " + totalJogos);
            System.out.println("-----------------------------");

            System.out.print("\nDeseja jogar novamente? (s/n): ");
            String resposta = sc.nextLine().trim().toLowerCase();

            repetir = resposta.equals("s") || resposta.equals("sim");
        }

        System.out.println("\nObrigado por jogar, " + nome + "!");
        System.out.println("Total de rodadas: " + totalJogos);
        System.out.println("Pontuação TOTAL acumulada: " + totalPontuacao);

        sc.close();
    }
}




