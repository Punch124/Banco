public class App {
    public static void main(String[] args) throws Exception {
        Conta c1= new Conta();  
        c1.setDono("adson");
        c1.setNumConta(3333);
        c1.abrirConta("CC");
        c1.estadoAtual();

        Conta c2 = new Conta();
        c2.setDono("Richard");
        c2.setNumConta(22222);
        c2.abrirConta("CP");
        c2.estadoAtual();

        c1.depositar(500);
        
        c1.sacar(470);

        c1.pagarMensal();
        c2.pagarMensal();

        c2.fecharConta();
    }
}
