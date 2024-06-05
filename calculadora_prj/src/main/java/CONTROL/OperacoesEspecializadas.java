package CONTROL;
import java.lang.Math;

//Apesar de extends, há métodos que será usado a library MATH
public class OperacoesEspecializadas extends Calculadora{
    //ATTRIBUTES
    protected String valor;
    
    //METHODS
    //constructor
    
    //getters
    public String get_valor(){
        return valor;
    }
    
    //setters
    public void set_valor(String valor){
        this.valor = valor;
    }
    
    //others
    public String raiz(){
        if(valor.equals("")){
            return "Syntax Error";
        }else{
            return String.valueOf(Math.sqrt(Double.parseDouble(valor)));  
        }
    }
    
    public String potencia(){
        super.set_valor(valor);
        return super.multiplicacao(valor);
    }
    
    public String fracao_menosUm(String valor2){
        super.set_valor(valor);
        return super.divisao(valor2);
    }
    
}
