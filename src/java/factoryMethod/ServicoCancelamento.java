package factoryMethod;

public class ServicoCancelamento implements IServico {

    public String executar() {
        return "Cancelamento Concluído";
    }

    public String cancelar() {
        return "Cancelamento Não Pode Ser Feito";
    }
}
