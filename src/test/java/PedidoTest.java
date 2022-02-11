import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {
    @Test
    void deveArmazenarEstados() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoAberto.getInstance());
        pedido.setEstado(PedidoEstadoPronto.getInstance());
        assertEquals(2, pedido.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoAberto.getInstance());
        pedido.setEstado(PedidoEstadoPronto.getInstance());
        pedido.restauraEstado(0);
        assertEquals(PedidoEstadoAberto.getInstance(), pedido.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoAberto.getInstance());
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        pedido.setEstado(PedidoEstadoAberto.getInstance());
        pedido.setEstado(PedidoEstadoCaminho.getInstance());
        pedido.restauraEstado(2);
        assertEquals(PedidoEstadoAberto.getInstance(), pedido.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Pedido pedido = new Pedido();
            pedido.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}