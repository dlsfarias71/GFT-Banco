public class Main {

    public static void main(String[]args){

       Cliente luciana = new Cliente();
        luciana.setNome("Luciana");

        ContaCorrente cc = new ContaCorrente(luciana);
        Conta pp = new ContaPoupança(luciana);
        cc.depositar(100);


        cc.imprimirExtrato();
        pp.imprimirExtrato();

    }

}
