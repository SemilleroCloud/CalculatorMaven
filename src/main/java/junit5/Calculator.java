package junit5;

public class Calculator
{
    //Constructor
    public Calculator(){
        this.setResultado(0);
    }

    //Metoso suma y resta
    public final int suma(final int numero_01 , final int numero_02){
        this.setResultado(numero_01 + numero_02);
        return(this.getResultado());
    }
    public final int resta(final int numero_01 , final int numero_02){
        this.setResultado(numero_01 - numero_02);
        return(this.getResultado());
    }

    //Encapsulamiento
    private void setResultado(final int resultado){
        this.resultado = resultado;
    }
    private final int getResultado(){
        return(this.resultado);
    }

    private int resultado;
}
