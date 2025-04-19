package tudelft.Autenticador;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AutenticadorTest {

    @Test
    public void testUsuarioYPasswordNulos() {
        Autenticador a = new Autenticador();
        assertFalse(a.autenticar(null, null));
    }
    @Test
    public void testUsuarioYPasswordNulo() {
        Autenticador a = new Autenticador();
        assertFalse(a.autenticar("invitado", null));
    }

    @Test
    public void testPasswordMuyCorta() {
        Autenticador a = new Autenticador();
        assertFalse(a.autenticar("admin", "12"));
    }

    @Test
    public void testUsuarioNoPermitido() {
        Autenticador a = new Autenticador();
        assertFalse(a.autenticar("hacker", "1234"));
    }

    @Test
    public void testPasswordIncorrecto() {
        Autenticador a = new Autenticador();
        assertFalse(a.autenticar("admin", "4321"));
    }

    @Test
    public void testUsuarioPermitidoYPasswordCorrecto_admin() {
        Autenticador a = new Autenticador();
        assertTrue(a.autenticar("admin", "1234"));
    }

    @Test
    public void testUsuarioPermitidoYPasswordCorrecto_usuario() {
        Autenticador a = new Autenticador();
        assertTrue(a.autenticar("usuario", "1234"));
    }

    @Test
    public void testUsuarioPermitidoYPasswordCorrecto_invitado() {
        Autenticador a = new Autenticador();
        assertTrue(a.autenticar("invitado", "1234"));
    }
}
