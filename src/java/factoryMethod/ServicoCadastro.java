package factoryMethod;

public class ServicoCadastro implements IServico {

    public String executar() {
        return "Matrícula efetivada";
    }

    public String cancelar() {
        return "Matrícula cancelada";
    }
}
