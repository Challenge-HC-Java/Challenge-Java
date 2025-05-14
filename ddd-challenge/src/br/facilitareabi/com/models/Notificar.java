package br.facilitareabi.com.models;

public class Notificar extends Paciente{
    //notificações inteligentes;Lembretes automáticos com confirmação por toque (Ex: "Você tem consulta amanhã. Confirmar presença?").

    //métodos
    //+notificar(): String
    public void notificar(Consulta consulta) {
        System.out.println(" \n==========================================");
        System.out.println("LEMBRETE!");
        System.out.println(" \n==========================================");
        System.out.println("Não se esqueça das suas consultas!"   );
        System.out.println("Você tem uma teleconsulta marcada para o dia "+ consulta.getDataHora());
        System.out.println("Sua consulta está" + " " + consulta.getStatus());

    }
}
