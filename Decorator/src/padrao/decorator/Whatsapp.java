package padrao.decorator;

public class Whatsapp extends NotificacaoDecorator {
    public Whatsapp(Notificacao notificacao) {
        super(notificacao);
    }

    public String notificar() {
        return super.notificar() + notificarWhatsapp();
    }

    private String notificarWhatsapp() {
        return " whatsapp";
    }
}
