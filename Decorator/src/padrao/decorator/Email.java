package padrao.decorator;

public class Email extends NotificacaoDecorator{
    public Email(Notificacao notificacao) {
        super(notificacao);
    }

    public String notificar() {
        return super.notificar() + notificarEmail();
    }

    private String notificarEmail() {
        return " email";
    }
}
