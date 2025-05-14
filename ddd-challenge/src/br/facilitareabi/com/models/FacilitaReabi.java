package br.facilitareabi.com.models;

import java.util.Scanner;

public class FacilitaReabi extends Paciente {
    //atributos
    private String incluir;

    public String getIncluir() {
        return incluir;
    }

    public void setIncluir(String incluir) {
        this.incluir = incluir;
    }

    public Scanner getLeitor() {
        return leitor;
    }

    public void setLeitor(Scanner leitor) {
        this.leitor = leitor;
    }

    //explicações para o paciente sobre o que são as tleconsultas, como usar e quais os benefícios
    //sobre inclusão

    //método de explicação, ele vai pegar o nome do paciente e sua necessidade de apoio e vai retornar um texto explicando como a teleconsulta vai ajudar ele
    //+explicacao():String
    Scanner leitor = new Scanner(System.in);
    //se o paciente se encaixar no etarismo, vai colocar instruções claras para como usra a app, se não innstruçlões gerais

    public void facilitaReabi(Paciente paciente){

        System.out.println("\n==========================================");
        if (paciente.getIdade() >= 50){
            System.out.println(paciente.getNome() + " " +"vamos te explicar com detalhes como nossas consultas realizadas pelo celular "+
                    " podem ajudar no seu tratamento.");
            System.out.println("");
        } else {
            System.out.println(paciente.getNome() + " " + "vamos te explicar mais sobre nossas consultas on-lines." );

        }

    }
    public String entendendo(Paciente paciente) {

        while (true) {
            System.out.println("==========================================");
            System.out.println(paciente.getNome() + " " + "vamos entender mais sobre nossa Rede de Reabilitação!");
            System.out.println("O Instituto de Medicina Física e Reabilitação (IMREA) do Hospital das Clínicas da Faculdade de Medicina da Universidade de São Paulo (HCFMUSP), em conjunto com o Instituto de Reabilitação Lucy Montoro (IRLM), oferece reabilitação multidisciplinar, propiciando melhoria na qualidade de vida e autonomia.");
            System.out.println("\nEscolha, dentre as opções abaixo, o que você quer entender melhor:");
            System.out.println("1 - O que é uma teleconsulta?");
            System.out.println("2 - Como consultas digitais podem me ajudar?");
            System.out.println("3 - Como entrar em uma teleconsulta?");
            System.out.println("4 - Como aproveitar a tecnologia para melhorar minha saúde?");
            String resposta = leitor.nextLine();
            switch (resposta) {
                case "1":
                    System.out.println("==========================================");
                    return "Teleconsulta é uma consulta médica realizada à distância, por meio de chamadas de vídeo, áudio ou mensagens, utilizando celular, computador ou outro dispositivo conectado à internet. É uma forma segura e prática de receber atendimento médico sem sair de casa." +
                            "\nInformação importante!" + "\nLembre-se que nossa equipe médica está aqui para te ajudar a evoluir em seus tratamentos, nós entendemos que pode ser complicado entrar em uma ligação com sua câmera e áudio abertos, porém tenha certeza que os profissionais do IMREA farão de tudo para gerar um ambiente acolhedor e inclusivo! ";

                case "2":
                    System.out.println("==========================================");
                    return "Consultas digitais facilitam o acesso à saúde, evitando deslocamentos e filas. Elas permitem que você consulte um médico com mais rapidez, acompanhe tratamentos, tire dúvidas e tenha mais controle sobre sua saúde, tudo com mais conforto e segurança." +
                            "\nInformação importante!" + "\nLembre-se que nossa equipe médica está aqui para te ajudar a evoluir em seus tratamentos, nós entendemos que pode ser complicado entrar em uma ligação com sua câmera e áudio abertos, porém tenha certeza que os profissionais do IMREA farão de tudo para gerar um ambiente acolhedor e inclusivo! ";

                case "3":
                    System.out.println("==========================================");
                    return "Para entrar em uma teleconsulta, você precisa:\n" +
                            "\n" +
                            "Ter um celular ou computador com internet.\n" +
                            "\n" +
                            "Acessar o link enviado pelo médico ou sistema de saúde.\n" +
                            "\n" +
                            "Estar em um local silencioso e com boa iluminação.\n" +
                            "\n" +
                            "Clicar no link no horário marcado e permitir o uso da câmera e microfone.\n" +
                            "\n" + "\nInformação importante!" + "\nLembre-se que nossa equipe médica está aqui para te ajudar a evoluir em seus tratamentos, nós entendemos que pode ser complicado entrar em uma ligação com sua câmera e áudio abertos, porém tenha certeza que os profissionais do IMREA farão de tudo para gerar um ambiente acolhedor e inclusivo! ";

                case "4":
                    System.out.println("==========================================");
                    return "Você pode usar aplicativos e plataformas digitais para:\n" +
                            "\n" +
                            "Marcar e acompanhar consultas.\n" +
                            "\n" +
                            "Receber lembretes de medicamentos e exames.\n" +
                            "\n" +
                            "Ter acesso a informações confiáveis sobre sua saúde.\n" +
                            "\n" +
                            "Falar com profissionais da saúde com mais facilidade." +
                            "\nInformação importante!" + "\nLembre-se que nossa equipe médica está aqui para te ajudar a evoluir em seus tratamentos, nós entendemos que pode ser complicado entrar em uma ligação com sua câmera e áudio abertos, porém tenha certeza que os profissionais do IMREA farão de tudo para gerar um ambiente acolhedor e inclusivo! ";

                default:
                    System.out.println("==========================================");
                    System.out.println("Opção inválida!" + " Digite um número válido entre 1 a 4.");
            }
        }
    }

    public void inclusao(){
        System.out.println("Sabemos que usar a tecnologia pode ser difícil no começo, e queremos que você saiba que estamos aqui para ajudar. " +
                "O IMREA foi feito para tornar suas consultas mais fáceis e acessíveis. Se você tiver qualquer problema para usar o celular ou o aplicativo, não se preocupe! Nossa equipe está pronta para dar todo o suporte necessário, para que você nunca perca uma consulta.");
        System.out.println("Você encontra dificuldades para comparecer às suas consultas on-lines? (Sim/Não)");

        while(true) {
            String resposta = leitor.nextLine();
            if (resposta.equalsIgnoreCase("Sim")) {
                System.out.println("\nOk! Vamos te ajudar a enfrentar esse problema!" +
                        "\nPor favor, escolha entre as opções abaixo qual a causa principal das suas faltas:" +
                        "\n1-Dificuldade em usar o celular ou o computador" +
                        "\n2-Falta de acesso à internet" +
                        "\n3-Falta de equipamento adequado" +
                        "\n4-Esquecimento do horário ou data" +
                        "\n5-Condições de vulnerabilidade social");
                this.incluir = leitor.nextLine();
                break;
            }else if (resposta.equalsIgnoreCase("Não")) {
                System.out.println("Ótimo! Que bom saber que está conseguindo participar das consultas.");
                break;
            }else {
                System.out.println("Por favor, responda apenas com 'Sim' ou 'Não'.");
            }
        }
        //System.out.println("Obrigada pela resposta, nossa equipe ");
        //if 2 imprime a solução ...


    }

}


