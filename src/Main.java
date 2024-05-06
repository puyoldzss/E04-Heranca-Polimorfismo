public class Main {

    public static void main(String[] args) {
        PF Pudjol = new PF();
        Cliente cliente = new Cliente();
        PJ Joao = new PJ();

        cliente.imprimir();
        System.out.println("=========================");

        Joao.criarCliente("Joao", "59.456.277/0001-76", "Brasil", 69, "Informatica");
        Pudjol.criarCliente("Pudjol", "141.013.976-00", "Brasil", 24, 'm');

        Conta contaF = new Conta(16, Pudjol, 0, 10000);

        Conta contaJ = new Conta(1234, Joao, 0, 10000);

        contaF.depositar(160);

        contaF.sacar(160);

        contaF.depositar(16);

        contaJ.depositar(16);

        contaJ.sacar(16);

        contaJ.depositar(100);

        Pudjol.imprimir();
        contaF.imprimirExtrato();



        Joao.imprimir();
        contaJ.imprimirExtrato();
    }
}