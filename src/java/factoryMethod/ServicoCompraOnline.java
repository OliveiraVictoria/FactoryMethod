package factoryMethod;

public class ServicoCompraOnline implements IServico {

    public String executar() {
        return "Compra Concluído";
    }

    public String cancelar() {
        return "Compra Não Concluída";
    }
}
