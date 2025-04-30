package steps;

import io.cucumber.java.pt.*;
import reserva.ReservaService;
import static org.junit.Assert.*;

public class ReservaSteps {
    private String cidade;
    private String endereco;
    private String resultado;
    private ReservaService service = new ReservaService();

    @Dado("que o passageiro está na cidade {string} e no endereço {string}")
    public void que_o_passageiro_está_na_cidade_e_no_endereço(String cidade, String endereco) {
        this.cidade = cidade;
        this.endereco = endereco;
    }

    @Quando("solicitar a reserva de um carro")
    public void solicitar_a_reserva_de_um_carro() {
        resultado = service.reservar(cidade, endereco);
    }

    @Então("o sistema deve retornar a mensagem {string}")
    public void o_sistema_deve_retornar_a_mensagem(String mensagemEsperada) {
        assertEquals(mensagemEsperada, resultado);
    }
}