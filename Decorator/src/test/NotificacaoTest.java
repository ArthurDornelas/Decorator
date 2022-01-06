package test;

import org.junit.jupiter.api.Test;
import padrao.decorator.*;

import static org.junit.jupiter.api.Assertions.*;

public class NotificacaoTest {

    @Test
    void deveRetornarNotificacaoInternet() {
        Notificacao notificacao = new NotificacaoInternet();

        assertEquals("notificação", notificacao.notificar());
    }

    @Test
    void deveRetornarNotificacaoEmail() {
        Notificacao notificacao = new Email(new NotificacaoInternet());

        assertEquals("notificação email", notificacao.notificar());
    }

    @Test
    void deveRetornarNotificacaoTeams() {
        Notificacao notificacao = new Teams(new NotificacaoInternet());

        assertEquals("notificação teams", notificacao.notificar());
    }

    @Test
    void deveRetornarNotificacaoWhatsapp() {
        Notificacao notificacao = new Whatsapp(new NotificacaoInternet());

        assertEquals("notificação whatsapp", notificacao.notificar());
    }

    @Test
    void deveRetornarNotificacaoEmailETeams() {
        Notificacao notificacao = new Email(new Teams(new NotificacaoInternet()));

        assertEquals("notificação teams email", notificacao.notificar());
    }

    @Test
    void deveRetornarNotificacaoEmailEWhatsapp() {
        Notificacao notificacao = new Email(new Whatsapp(new NotificacaoInternet()));

        assertEquals("notificação whatsapp email", notificacao.notificar());
    }

    @Test
    void deveRetornarNotificacaoTeamsEWhatsapp() {
        Notificacao notificacao = new Teams(new Whatsapp(new NotificacaoInternet()));

        assertEquals("notificação whatsapp teams", notificacao.notificar());
    }

    @Test
    void deveRetornarNotificacaoEmailETeamsEWhatsapp() {
        Notificacao notificacao = new Email(new Teams( new Whatsapp(new NotificacaoInternet())));

        assertEquals("notificação whatsapp teams email", notificacao.notificar());
    }

}
