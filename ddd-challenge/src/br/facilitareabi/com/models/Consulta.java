package br.facilitareabi.com.models;

import br.facilitareabi.com.enums.StatusAgendamentoEnum;

import java.util.Scanner;

public class Consulta  {

    // Atributos
    protected String dataHora;
    protected StatusAgendamentoEnum status;
    private String especialidade;
    private boolean presencaConfirmada = false;

    // Getters e Setters
    public String getDataHora() {return dataHora;}
    public void setDataHora(String dataHora) {this.dataHora = dataHora;}
    public StatusAgendamentoEnum getStatus() {return status;}
    public void setStatus(StatusAgendamentoEnum status) {this.status = status;}
    public String getEspecialidade() {return especialidade;}
    public void setEspecialidade(String especialidade) {this.especialidade = especialidade;}
    public boolean isPresencaConfirmada() {return presencaConfirmada;}
    public void setPresencaConfirmada(boolean presencaConfirmada) {this.presencaConfirmada = presencaConfirmada;}

    Scanner leitor = new Scanner(System.in);

    // Métodos

    public String agendarConsulta(Usuario usuario) {
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
        System.out.println(" \n==========================================");
        while (true) {
            System.out.println("\n" +"Aceita o termo? (Sim/Não):");
            lido = leitor.nextLine();
            if (lido.equalsIgnoreCase("Sim")) {
                System.out.println("Resposta registrada. Sua consulta poderá ser realizada.");
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
        System.out.println("Digite a especialidade:");
        this.especialidade = leitor.nextLine();
    }

    //+desejaNotificacao():String

    public String desejaNotificacao() {
        System.out.println("Você deseja receber notificações sobre o status das suas teleconsultas? ");
        String notificacao = leitor.nextLine();
        String mensagem = "Você tem uma teleconsulta marcada para o dia " + getDataHora();

        switch (notificacao) {
            case "Sim":
                System.out.println("Ótima escolha, a partir de agora você será notificado sobre informações importantes!");
                System.out.println(mensagem);
                break;
            case "Não":
                System.out.println("Que pena! Notificações de lembrete te ajudam a não faltar nas consultas. Quer recebê-las? ");
                String certeza = leitor.nextLine();
                if (certeza.equalsIgnoreCase("Sim")) {
                    System.out.println("Ótima escolha, a partir de agora você será notificado sobre informações importantes!");
                    System.out.println(mensagem);
                } else {
                    System.out.println("Ok, você não irá ser notificado.");
                }
                break;
            default:
                System.out.println("Resposta inválida, assumindo que não deseja notificações.");
                break;
        }
        return mensagem;
    }

    public void teleconsulta() {
        System.out.println("Você já tem uma teleconsulta agendada?");
        String resposta = leitor.nextLine();
        if (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Qual o dia e o horário da sua consulta?");
            this.dataHora = leitor.nextLine();
            this.status = StatusAgendamentoEnum.AGENDADA;
            System.out.println("Sua consulta é dia " + getDataHora());
            return;
        } else {
            System.out.println("Ok, você será direcionado para a aba de agendar consultas.");
            this.primeiraConsulta();
            this.consulta();
            this.desejaNotificacao();
        }
    }

    public void confirmarPresenca(boolean confirmacao) {
        this.presencaConfirmada = confirmacao;
        if (confirmacao) {
            System.out.println("\nPresença confirmada com sucesso!");
        } else {
            System.out.println("\nPresença não confirmada.");
        }
    }

        public void atualizarStatusConsulta() {
            System.out.println("\nEscolha o novo status da consulta:\n1 - AGENDADA\n2 - CANCELADA\n3 - REALIZADA");
            String escolha = leitor.nextLine();
            switch (escolha) {
                case "1": setStatus(StatusAgendamentoEnum.AGENDADA);
                break;
                case "2": setStatus(StatusAgendamentoEnum.CANCELADA);
                break;
                case "3": setStatus(StatusAgendamentoEnum.REALIZADA);
                break;
                default: System.out.println("Status inválido");
                return;
            }
            System.out.println("Status atualizado: " + getStatus());
        }

    }







