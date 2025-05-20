package br.facilitareabi.com.tests;

import br.facilitareabi.com.models.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Paciente paciente = new Paciente();
        Menu menu = new Menu();
        Consulta consulta = new Consulta();
        FacilitaReabi facilitaReabi = new FacilitaReabi();
        Notificar notificar = new Notificar();
        menu.cadastroObrigatorio(paciente);
        facilitaReabi.facilitaReabi(paciente);

        boolean continuar = true;
        while (continuar) {
            String resultado = menu.menu(paciente).trim();
            switch (resultado) {
                case "1":
                    String resposta = consulta.agendarConsulta(paciente);
                    if (resposta.equalsIgnoreCase("Sim")) {
                        consulta.consulta();
                        consulta.primeiraConsulta();
                        consulta.desejaNotificacao();
                    } else {
                        System.out.println("Você escolheu não agendar a consulta. Retornando o menu.");
                    }
                    break;
                case "2":
                    consulta.teleconsulta();
                    break;
                case "3":
                    String explicacao = facilitaReabi.entendendo(paciente);
                    System.out.println("\n" + explicacao);
                    System.out.println("\n==========================================");
                    if (consulta.getDataHora() != null) {
                        notificar.notificar(consulta);
                    } else {

                        System.out.println("Você ainda não tem lembretes sobre suas consultas!");
                    }
                    break;
                case "4":
                    System.out.println("Você será direcionado para a aba de perguntas frequentes.");
                    break;
                case "5":
                    continuar = false;

                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha de 1 a 5.");
                    break;
            }
            if (continuar) {
                System.out.println("\n==========================================");
                System.out.println("\nVocê vai voltar para o Menu.");
                System.out.println("Se deseja continuar usufruindo dos nossos serviços, digite 1");
                System.out.println("Se quiser encerrar o programa, digite 2");
                String escolha = leitor.nextLine();
                if (escolha.equals("2")) {
                    continuar = false;
                    System.out.println("Encerrando o programa.");
                }
            }
        }
        facilitaReabi.inclusao();

        leitor.close();

    }
}
