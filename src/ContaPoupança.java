public class ContaPoupança extends Conta {


    public  ContaPoupança(Cliente cliente) {
        super(cliente);
    }

    public ContaPoupança() {
        super();
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirinfocomuns();
       }
    }