package padrao.decorator;

public class NotificacaoInternet implements Notificacao{
    @Override
    public String notificar() {
        return "notificação";
    }
}
