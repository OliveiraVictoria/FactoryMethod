package factoryMethod;

public class ServicoTempoPagamento {

    public String executar() {
        return "Pagamento efetivado com Sucesso";
    }

    public String cancelar() {
        return "Pagamento Não foi feito dentro do Tempo Estimado";
    }
}
