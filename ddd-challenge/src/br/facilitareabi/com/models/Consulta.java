package br.facilitareabi.com.models;

import java.util.Scanner;

public class Consulta extends Paciente {
    //atributos
    protected String dataHora;
    protected StatusAgendamentoEnum status;

    public String getDataHora() {return dataHora;}

    public void setDataHora(String dataHora) {this.dataHora = dataHora;}

    public StatusAgendamentoEnum getStatus() {return status;}

    public void setStatus(StatusAgendamentoEnum status) {this.status = status;}

    Scanner leitor = new Scanner(System.in);

    public String agendarConsulta(Paciente paciente) {
        System.out.println("Você deseja marcar uma teleconsulta conosco?");
        String resposta = leitor.nextLine();
        switch (resposta) {
            case "Sim":
                System.out.println("Ok, vamos agendar o dia e o horário! ");
                this.primeiraConsulta();
                this.consulta();
                this.desejaNotificacao();
                return "Sim";
            case "Não":
                System.out.println("Tudo bem, você será redirecionado para o menu.");
                return "Não";
            default:
                System.out.println("Opção inválida, retornando ao menu.");
                return "Não";
        }
    }

    //+primeiraConsulta():String
    public void primeiraConsulta() {
        String termoConsentimento = "Declaro que li e concordo com o uso dos meus dados para fins de atendimento e melhoria do serviço.";
        String lido = "";
        System.out.println(termoConsentimento);
        while (true) {
            System.out.println("Aceita o termo? (Sim/Não):");
            lido = leitor.nextLine();
            if (lido.equalsIgnoreCase("Sim")) {
                System.out.println("Resposta registrada. Consulta poderá ser realizada.");
                break;
            } else if (lido.equalsIgnoreCase("Não")) {
                System.out.println("Ao não aceitar o termo, sua consulta não poderá ser realizada.");
            } else {
                System.out.println("Resposta inválida. Digite apenas 'Sim' ou 'Não'.");
            }
        }
    }

    public void consulta(){
        System.out.println("Digite o dia e o horário que você deseja agendar sua consulta: ");
        this.dataHora = leitor.nextLine();
        this.status = StatusAgendamentoEnum.AGENDADA;

    }

    //+desejaNotificacao():String
    public String desejaNotificacao(){
        String notificacao = "";
        String certeza = "";
        String mensagem = "Você tem uma teleconsulta marcada para o dia "+ getDataHora();
        System.out.println("Você deseja receber notificações sobre o status das suas teleconsultas? ");
        notificacao = leitor.nextLine();
        switch (notificacao){
            case "Sim":
                System.out.println("Ótima escolha, a partir de agora você será notificado sobre informações importantes!");
                System.out.println(mensagem);
                break;
            case "Não":
                System.out.println("Que pena! Notificações de lembrete te ajudam a não faltar nas consultas. Quer recebe-lás? ");
                certeza= leitor.nextLine();
                if (certeza.equalsIgnoreCase("Sim")){
                    System.out.println("Ótima escolha, a partir de agora você será notificado sobre informações importantes!");
                    System.out.println(mensagem);
                }else
                    System.out.println("Ok, você não irá ser notificado.");
            default:
                System.out.println("Ok, você não irá ser notificado.");
        }
        return mensagem;
    }

    public void teleconsulta(){
        System.out.println("Você já tem uma teleconsulta agendada?");
        String resposta = leitor.nextLine();
        if (resposta.equalsIgnoreCase("Sim")){
            System.out.println("Qual o dia e o horário da sua consulta?");
            this.dataHora = leitor.nextLine();
            this.status = StatusAgendamentoEnum.AGENDADA;
            System.out.println("Sua consulta é dia "+ getDataHora());
            return;
        }else{
            System.out.println("Ok, você será direcionado para a aba de agendar consultas.");
            this.primeiraConsulta();
            this.consulta();
            this.desejaNotificacao();
        }
    }

    //+status():VOID
    //if possui uma teleconsulta for sim exibir esse métodod
   /* public void verificarAgendarTeleconsulta(Paciente paciente){
        System.out.println("Você já tem uma teleconsulta agendada? (Sim/Não)");
        String resposta = leitor.nextLine();
        if (resposta.equalsIgnoreCase("Sim")) {
            if (this.dataHora != null && this.status != null) {
                System.out.println("======================================");
                System.out.println("Paciente: " + paciente.getNome());
                System.out.println("Status da Consulta: " + this.status);
                System.out.println("Data e Hora: " + this.dataHora);
                System.out.println("======================================");
            } else {
                System.out.println("Nenhuma consulta registrada no sistema.");
            }
        } else {
            System.out.println("Deseja agendar uma nova teleconsulta? (Sim/Não)");
            String desejaAgendar = leitor.nextLine();
            if (desejaAgendar.equalsIgnoreCase("Sim")) {
                this.primeiraConsulta();
                this.consulta();
                this.desejaNotificacao();
            } else {
                System.out.println("Tudo bem. Você poderá agendar uma teleconsulta futuramente.");
            }
        }
    }
    */


}




