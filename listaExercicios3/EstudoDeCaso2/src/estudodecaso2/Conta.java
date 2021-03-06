package estudodecaso2;

public class Conta {
    public int codigo;
    public double saldo;
    public double limite;
    
    public Conta (){
    }
    
   public Conta(int codigo, double saldo, double limite){
        this.codigo=codigo;
        this.saldo=saldo;
        this.limite=limite;
    } 
   
    public String consultarSaldo() {
        return "Codigo:" + codigo + "Saldo:" +saldo;
        
    }
    public boolean depositar(double valor){
       if(valor>0){
        saldo= saldo + valor;
        return true;
       }
        return false;
    }
    
    public boolean sacar(double valor) {
         if(saldo+limite>=valor){
       saldo = saldo - valor;
           return true;
       }
        return false;
        
    }
    public boolean transferir(Conta conta, double valor){
     if(saldo+limite> valor){  
        sacar(valor); 
        conta.depositar(valor);
        return true;
     }
     return false;
    }       

    
   
    
}
