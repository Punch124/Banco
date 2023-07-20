

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public void estadoAtual() {
        
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono da conta:" + getDono());
        System.out.println("Saldo da conta: " + getSaldo());
        System.out.println("-------------------------------------------");
    }

    public Conta() {
        this.setStatus(false);
        this.setSaldo(0);
    }
	public void abrirConta(String t) {
    this.setTipo(t);
    setStatus(true);
    if (tipo == "CC") {
        this.setSaldo(50);
        System.out.println ( "conta aberta com sucesso" ) ;
    }
    else if (tipo == "CP") {
        this.setSaldo(150);
        System.out.println ( "conta aberta com sucesso" ) ;
    } else {
        System.out.println ( "inválido! tente CC ou CP " ) ; 
        }
    }       
    
    public void fecharConta() {
        if (this.getSaldo() < 0) {
           System.out.println("você está devendo ao banco,não pode fechar a conta");
        } else if (this.getSaldo() == 0) {
            this.setStatus(false);
            System.out.println("conta fechada com sucesso.");
        } else {
            System.out.println("Ainda tem dinheiro na sua conta");
        }
    
    }
    public void depositar(int v) {
        if (this.getStatus()==true) {
            this.setSaldo(getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + getDono());
        } else {
            System.out.println("impossivel depositar numa conta que nao esta aberta");
        }
    }
    public void sacar(double v) {
        if (getStatus()) {
            if (getSaldo() <= v) {
                this.setSaldo(getSaldo() - v);
                System.out.println("Saldo insuficiente");
            } else {
            System.out.println("saque efeutado por: " + this.getDono());
            }
        }else {
            System.out.println("Impossivel sacar dinheiro de uma conta fechada");
        }

    }
    public void pagarMensal() {
        double v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
            
        } else if (this.getTipo() == "CP") {
            v = 20;
        } 
    if (this.getStatus()) {
        this.setSaldo(getSaldo() - v);
        System.out.println("mensalidade paga com sucesso");
    } else {
        System.out.println("impossivel pagar uma conta fechada");
    }

    }

    public double getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

}
