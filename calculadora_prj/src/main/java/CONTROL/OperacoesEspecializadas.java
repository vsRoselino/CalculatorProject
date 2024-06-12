package CONTROL;
import java.lang.Math;

//Apesar de extends, há métodos que será usado a library MATH
public class OperacoesEspecializadas extends Calculadora{
    //ATTRIBUTES
    protected String valor1, valor2;
    
    //METHODS
    //constructor
    public OperacoesEspecializadas(){
        
    }
    
    //getters
    public String get_valor1(){
        return valor1;
    }
    
    public String get_valor2(){
        return valor2;
    }
    
    //setters
    public void set_valor1(String valor1){
        this.valor1 = valor1;
    }
    
    public void set_valor2(String valor2){
        this.valor2 = valor2;
    }
    
    //others
    public String raiz(){
        if(valor1.equals("")){
            return "Syntax Error";
        }else{
            return String.valueOf(Math.sqrt(Double.parseDouble(valor1)));  
        }
    }
    
    public String potencia(){
        super.set_valor1(valor1);
        super.set_valor2(valor1);
        return super.multiplicacao();
    }
    
    public String fracao_menosUm(){
        super.set_valor1("1");
        super.set_valor2(valor2);
        return super.divisao();
    }
    
}
