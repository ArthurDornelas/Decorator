package padrao.decorator;

public class Teams extends NotificacaoDecorator{
    public Teams(Notificacao notificacao) {
        super(notificacao);
    }

    public String notificar() {
        return super.notificar() + notificarTeams();
    }

    private String notificarTeams() {
        return " teams";
    }
}
