public class PedidoEstadoCancelado implements PedidoEstado{
    private PedidoEstadoCancelado(){};

    private static PedidoEstadoCancelado instance = new PedidoEstadoCancelado();

    public static PedidoEstadoCancelado getInstance(){
        return instance;
    }

    public  String getEstado(){
        return "Cancelado";
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
        return "Status a caminho inválido";
    }

    @Override
    public String entregue(Pedido pedido) {
        return "Status entregue inválido";
    }


    @Override
    public String cancelado(Pedido pedido) {
        return "Status cancelado inválido";
    }

}


