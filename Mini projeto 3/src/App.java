import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        
        Scanner leitor = new Scanner(System.in);

        Personagem Mascarado = new Personagem("Homem Mascarado", 100);
        Personagem Jogador42 = new Personagem("Jogador 42", 100);

        Capitulo capitulo1 = new Capitulo(
            Jogador42,
            0,
            Mascarado,
            0,
            "\n CAPITULO 1 - O INICIO \n Você acorda em uma sala estranha, e em você há um papel colocado com: 'Jogador 42' \nVocê escuta um voz que sai de um alto falante no canto da sala:\n - Seja bem-vindo ao teste de sua vida! \nvocê vai passar por 3 teste, se você errar, ou se você demorar demais você levará um choque, \ncontudo se você acertar, eu que levarei um choque, enfim, boa sorte! \nUma porta a sua frente se abre, o que fazer? \n ",
            "Continuar",
            "Esperar",
            leitor);

        Capitulo capitulo2 = new Capitulo(
            Jogador42,
            0,
            Mascarado,
            -15,
            "\n CAPITULO 2 - PRIMEIRO TESTE \n Você acertou a charada, \nVocê escuta um som de choque e gritos\nContudo você continua sua jornada \n \nUma porta se abre e você vai até ela\nAo entrar você vê outro papel a sua frente,\n no papel está escrito:\nQual cor forma se misturarmos azul com vermelho? \n qual porta entrar?",
            "Roxo", 
            "Rosa",
            leitor);

        Capitulo capitulo3 = new Capitulo(
            Jogador42,
            0,
            Mascarado,
            -15,
            "\n CAPITULO 3 - SEGUNDO TESTE \n Após chegar na nova sala, você se depara com uma mesa com uma cara em cima \nvocê vai até ela e de abre, e nela está escrito: \nO que é, o que é, Sobe, sobe, sobe e jamais desce... ",
            "Balão",
            "Idade",
            leitor);

        Capitulo capitulo4 = new Capitulo(
            Jogador42,
            0,
            Mascarado,
            -15,
            "CAPITULO 4 - TERCEIRO TESTE \n Você chegar em uma sala com uma porta aberta, \ne nela se encontra um copo com algo que se parece com água, \na porta para a próxima sala se encontra aberta, \ncontudo seu cansaço fala mais alto, o que fazer? ",
            "Seguir",
            "Beber",
            leitor);

        Capitulo capitulo5 = new Capitulo(
            Jogador42,
            0,
            Mascarado,
            -15,
            "CAPITULO 5 - FINAL \n Ao entrar na sala você vê um homem de preto \ne ele diz que é o criador daquilo tudo,\nele fala que você ir embora pela porta ao lado \nVocê lembra por tudo que passou e: ",
            "Fugir",
            "Lutar",
            leitor);

        Capitulo final1 = new Capitulo(
            Jogador42,
            -100,
            Mascarado,
            0,
            "Você falhou no teste, tente novamente!",
            "",
            "",
            leitor);

        Capitulo final2 = new Capitulo(
            Jogador42,
            0,
            Mascarado,
            0,
            "Você decidiu fugir, você não quer lutar mais, você não quer mais tentar...",
            "",
            "",
            leitor);

        Capitulo final3 = new Capitulo(
            Jogador42,
            0,
            Mascarado,
            -99,
            "Você decide lutar, você usa tudo de si, uma porta se abre ao seu lado e você sabe que vai ter que lutar de novo...",
            "",
            "",
            leitor);

        capitulo1.mostrar();
        int primeira = capitulo1.opcao();

        if (primeira == 2){
            final1.mostrar();
            System.exit(1);
        } else if (primeira == 1){
            capitulo2.mostrar();
        }

        int segunda = capitulo2.opcao();
        
        if (segunda == 2){
            final1.mostrar();
            System.exit(1);
        } else if (primeira == 1){
            capitulo3.mostrar();
        }

        int terceira = capitulo3.opcao();
        
        if (terceira == 1){
            final1.mostrar();
            System.exit(1);
        } else if (primeira == 2){
            capitulo4.mostrar();
        }

        int quarta = capitulo4.opcao();
        
        if (quarta == 2){
            final1.mostrar();
            System.exit(1);
        } else if (primeira == 1){
            capitulo5.mostrar();
        }

        int quinta = capitulo4.opcao();
        
        if (quinta == 2){
            final3.mostrar();
            System.exit(1);
        } else if (primeira == 1){
            final2.mostrar();
            System.exit(1);
        }

    }
}