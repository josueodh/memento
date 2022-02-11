public class PedidoEstadoAberto implements PedidoEstado{
    private PedidoEstadoAberto(){};

    private static PedidoEstadoAberto instance = new PedidoEstadoAberto();

    public static PedidoEstadoAberto getInstance(){
        return instance;
    }

    public  String getEstado(){
        return "Aberto";
    }

    @Override
    public String realizado(Pedido pedido) {
        return "Pedido não realizado";
    }

    @Override
    public String aberto(Pedido pedido) {
        return "Abertura não realizada";
    }

    @Override
    public String pronto(Pedido pedido) {
        pedido.setEstado(PedidoEstadoPronto.getInstance());
        return "Pedido pronto para sair";
    }

    @Override
    public String despachado(Pedido pedido) {
        pedido.setEstado(PedidoEstadoDespachado.getInstance());
        return "Pedido despachado para o entregador";
    }

    @Override
    public String aceito(Pedido pedido) {
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        return "Pedido aceito pelo entregador";
    }

    @Override
    public String caminho(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCaminho.getInstance());
        return "Pedido coletado pelo entregador, a caminho do cliente";
    }

    @Override
    public String entregue(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        return "Pedido entregue ao cliente";
    }

    @Override
    public String cancelado(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return "Pedido cancelado";
    }

}


