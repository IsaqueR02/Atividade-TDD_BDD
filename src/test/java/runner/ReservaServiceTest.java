package runner;

import org.junit.Test;
import static org.junit.Assert.*;
import reserva.ReservaService;

public class ReservaServiceTest {
    ReservaService service = new ReservaService();

    @Test
    public void deveAceitarCidadesPermitidas() {
        assertEquals("Motorista a caminho", service.reservar("Belo Horizonte", "Rua A"));
        assertEquals("Motorista a caminho", service.reservar("Contagem", "Rua B"));
    }

    @Test
    public void deveRejeitarCidadesForaDeCobertura() {
        assertEquals("Área fora de cobertura", service.reservar("São Paulo", "Av Paulista"));
    }
}