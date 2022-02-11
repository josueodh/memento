public class PedidoEstadoAceito implements PedidoEstado{
    private PedidoEstadoAceito(){};

    private static PedidoEstadoAceito instance = new PedidoEstadoAceito();

    public static PedidoEstadoAceito getInstance(){
        return instance;
    }

    public  String getEstado(){
        return "Aceito";
    }

    @Override
    public String realizado(Pedido pedido) {
        return "Status realizado inválido";
    }

    @Override
    public String aberto(Pedido pedido) {
        return "Status aberto inválido";
    }

    @Override
    public String pronto(Pedido pedido) {
        return "Status pronto inválido";
    }

    @Override
    public String despachado(Pedido pedido) {
        return "Status despachado inválido";
    }


    @Override
    public String aceito(Pedido pedido) {
        return "Status aceito inválido";
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
