import java.text.Format;
import java.util.Arrays;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {

        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }
    public Conta() {

    }
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
       contaDestino.depositar(valor);
    }


    public void sacar() {
    }

    public void depositar() {
    }

    public void transferir() {
    }

    public int getAgencia() {
        int agencia = this.agencia;
        return agencia;
    }

    public int getNumero() {
        int numero = this.numero;
        return numero;
    }

    public double getSaldo() {
        double saldo = this.saldo;
        return saldo;
    }


    protected void imprimirinfocomuns() {
        System.out.println(String.format("Titular:%s", this.cliente.getNome()));
        System.out.println(String.format("Agencia:%d", this.agencia));
        System.out.println(String.format("Numero:%d", this.numero));
        System.out.println(String.format("Saldo:%1f", this.saldo));


    }

    public abstract void imprimirExtrato();
}
