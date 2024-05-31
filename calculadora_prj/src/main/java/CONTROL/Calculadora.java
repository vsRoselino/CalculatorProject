package CONTROL;

public class Calculadora {
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
    public String soma(String valor2){
        double soma, valor_double, valor2_double;
        
        if(valor.equals("")){
            return "Syntax Error";
        }else{
            valor_double = Double.parseDouble(valor);
                
            if(valor2.equals("")){
                return "Syntax Error";
            }else{
                valor2_double = Double.parseDouble(valor2);
                soma = valor_double + valor2_double;

                return String.valueOf(soma);
            }   
        }
    }
    
    public String subtracao(String valor2){
       double subtracao, valor_double, valor2_double;
        
       if(valor.equals("")){
            return "Syntax Error";
       }else{
            valor_double = Double.parseDouble(valor);
            
            if(valor2.equals("")){
                return "Syntax Error";
            }else{
                valor2_double = Double.parseDouble(valor2);
                subtracao = valor_double - valor2_double;

                return String.valueOf(subtracao);
            }
       }
    }
    
    public String multiplicacao(String valor2){
       double valor_double, valor2_double, multiplic;
        
       if(valor.equals("")){
            return "Syntax Error";
       }else{
            valor_double = Double.parseDouble(valor);
            
            if(valor2.equals("")){
                return "Syntax Error";
            }else{
                valor2_double = Double.parseDouble(valor2);
                multiplic = valor_double * valor2_double;

                return String.valueOf(multiplic);
            }
       }
    }
    
    public String divisao(String valor2){
       double divisao, valor_double, valor2_double;
        
       if(valor.equals("")){
           return "Syntax Error";
       }else{
            valor_double = Double.parseDouble(valor);
            if(valor2.equals("")){
                return "Syntax Error";
            }else{
                valor2_double = Double.parseDouble(valor2);
                divisao = valor_double / valor2_double;

                return String.valueOf(divisao);
            }
        }
    }
    
}
