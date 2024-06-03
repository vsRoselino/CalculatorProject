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
        
       if(valor.equals("") || valor2.equals("")){
            return "Syntax Error";
       }else if(valor.contains("%")){   
            //condiciona caso haja percentual
            //o último valor sempre será o caracter %
            int n_caracters = valor.length();
            
            //valor_double é a conversão a substring do valor para double
            valor_double = Double.parseDouble(valor.substring(0, n_caracters - 1));
            valor2_double = Double.parseDouble(valor2);
            soma = (valor_double / 100.0) + valor2_double;
            
            return String.valueOf(soma);
        }else{
           //condicionamento caso o valor2 tenha o caracter %
           if(valor2.contains("%")){
                int n_caracters = valor2.length();
                
                valor_double = Double.parseDouble(valor);
                valor2_double = Double.parseDouble(valor2.substring(0, n_caracters - 1));
                soma = valor_double + (valor2_double/100);

                return String.valueOf(soma);
           }else{
                valor_double = Double.parseDouble(valor);
                valor2_double = Double.parseDouble(valor2);
                soma = valor_double + valor2_double;

                return String.valueOf(soma);
           }
        }
    }
    
    public String subtracao(String valor2){
       double subtracao, valor_double, valor2_double;
        
       if(valor.equals("") || valor2.equals("")){
            return "Syntax Error";
       }else if(valor.contains("%")){   
            //condiciona caso haja percentual
            //o último valor sempre será o caracter %
            int n_caracters = valor.length();
            
            //valor_double é a conversão a substring do valor para double
            valor_double = Double.parseDouble(valor.substring(0, n_caracters - 1));
            valor2_double = Double.parseDouble(valor2);
            subtracao = (valor_double / 100.0) - valor2_double;
            
            return String.valueOf(subtracao);
        }else{
           //condicionamento caso o valor2 tenha o caracter %
           if(valor2.contains("%")){
                int n_caracters = valor2.length();
                
                valor_double = Double.parseDouble(valor);
                valor2_double = Double.parseDouble(valor2.substring(0, n_caracters - 1));
                subtracao = valor_double - (valor2_double/100);

                return String.valueOf(subtracao);
           }else{
                valor_double = Double.parseDouble(valor);
                valor2_double = Double.parseDouble(valor2);
                subtracao = valor_double - valor2_double;

                return String.valueOf(subtracao);
           }
        }
    }
    
    public String multiplicacao(String valor2){
       double valor_double, valor2_double, multiplic;
        
       if(valor.equals("") || valor2.equals("")){
            return "Syntax Error";
       }else if(valor.contains("%")){   
            //condiciona caso haja percentual
            //o último valor sempre será o caracter %
            int n_caracters = valor.length();
            
            //valor_double é a conversão a substring do valor para double
            valor_double = Double.parseDouble(valor.substring(0, n_caracters - 1));
            valor2_double = Double.parseDouble(valor2);
            multiplic = (valor_double / 100.0) * valor2_double;
            
            return String.valueOf(multiplic);
        }else{
           //condicionamento caso o valor2 tenha o caracter %
           if(valor2.contains("%")){
                int n_caracters = valor2.length();
                
                valor_double = Double.parseDouble(valor);
                valor2_double = Double.parseDouble(valor2.substring(0, n_caracters - 1));
                multiplic = valor_double * (valor2_double/100);

                return String.valueOf(multiplic);
           }else{
                valor_double = Double.parseDouble(valor);
                valor2_double = Double.parseDouble(valor2);
                multiplic = valor_double * valor2_double;

                return String.valueOf(multiplic);
           }
        }
    }
    
    public String divisao(String valor2){
       double divisao, valor_double, valor2_double;
        
       if(valor.equals("") || valor2.equals("")){
            return "Syntax Error";
       }else if(valor.contains("%")){   
            //condiciona caso haja percentual
            //o último valor sempre será o caracter %
            int n_caracters = valor.length();
            
            //valor_double é a conversão a substring do valor para double
            valor_double = Double.parseDouble(valor.substring(0, n_caracters - 1));
            valor2_double = Double.parseDouble(valor2);
            divisao = (valor_double / 100.0) / valor2_double;
            
            return String.valueOf(divisao);
        }else{
           //condicionamento caso o valor2 tenha o caracter %
           if(valor2.contains("%")){
                int n_caracters = valor2.length();
                
                valor_double = Double.parseDouble(valor);
                valor2_double = Double.parseDouble(valor2.substring(0, n_caracters - 1));
                divisao = valor_double / (valor2_double/100);

                return String.valueOf(divisao);
           }else{
                valor_double = Double.parseDouble(valor);
                valor2_double = Double.parseDouble(valor2);
                divisao = valor_double / valor2_double;

                return String.valueOf(divisao);
           }
        }
    }
    
}
