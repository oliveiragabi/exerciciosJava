import java.time.LocalDate;

public class ContaPoupanca extends Conta
{
    private LocalDate aniversario;
    
    public ContaPoupanca (int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista, LocalDate aniversario) 
    {
        super (numero, dataAbertura, saldo, tarifa, correntista);
        this.aniversario = aniversario;
    }
    
    public double calcularTarifa () 
    {
        return tarifa*1;
    }
    
}
