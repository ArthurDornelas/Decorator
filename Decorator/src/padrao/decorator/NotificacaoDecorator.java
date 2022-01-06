package padrao.decorator;

public abstract class NotificacaoDecorator implements Notificacao {
    private Notificacao notificacao;

    public NotificacaoDecorator(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    @Override
    public String notificar(){
        return notificacao.notificar();
    }
}
