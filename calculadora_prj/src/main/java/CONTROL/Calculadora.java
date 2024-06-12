package CONTROL;

public class Calculadora {
    //ATTRIBUTES
    protected String valor1, valor2;
    
    //Memory instance
    Memory mm = new Memory();
    
    //METHODS
    //constructor
    public Calculadora(){
        
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
    public String soma(){
        double soma, valor_double, valor2_double;
        
       if(valor1.equals("") || valor2.equals("")){
            return "Syntax Error";
       }else if(valor1.contains("%")){   
            //condiciona caso haja percentual
            //o último valor sempre será o caracter %
            int n_caracters = valor1.length();
            
            //valor_double é a conversão a substring do valor para double
            valor_double = Double.parseDouble(valor1.substring(0, n_caracters - 1));
            valor2_double = Double.parseDouble(valor2);
            soma = (valor_double / 100.0) + valor2_double;
            
            return String.valueOf(soma);
        }else{
           //condicionamento caso o valor2 tenha o caracter %
           if(valor2.contains("%")){
                int n_caracters = valor2.length();
                
                valor_double = Double.parseDouble(valor1);
                valor2_double = Double.parseDouble(valor2.substring(0, n_caracters - 1));
                soma = valor_double + (valor2_double/100);

                return String.valueOf(soma);
           }else{
                valor_double = Double.parseDouble(valor1);
                valor2_double = Double.parseDouble(valor2);
                soma = valor_double + valor2_double;

                return String.valueOf(soma);
           }
        }
    }
    
    public String subtracao(){
       double subtracao, valor_double, valor2_double;
        
       if(valor1.equals("") || valor2.equals("")){
            return "Syntax Error";
       }else if(valor1.contains("%")){   
            //condiciona caso haja percentual
            //o último valor sempre será o caracter %
            int n_caracters = valor1.length();
            
            //valor_double é a conversão a substring do valor para double
            valor_double = Double.parseDouble(valor1.substring(0, n_caracters - 1));
            valor2_double = Double.parseDouble(valor2);
            subtracao = (valor_double / 100.0) - valor2_double;
            
            return String.valueOf(subtracao);
        }else{
           //condicionamento caso o valor2 tenha o caracter %
           if(valor2.contains("%")){
                int n_caracters = valor2.length();
                
                valor_double = Double.parseDouble(valor1);
                valor2_double = Double.parseDouble(valor2.substring(0, n_caracters - 1));
                subtracao = valor_double - (valor2_double/100);

                return String.valueOf(subtracao);
           }else{
                valor_double = Double.parseDouble(valor1);
                valor2_double = Double.parseDouble(valor2);
                subtracao = valor_double - valor2_double;

                return String.valueOf(subtracao);
           }
        }
    }
    
    public String multiplicacao(){
       double valor_double, valor2_double, multiplic;
        
       if(valor1.equals("") || valor2.equals("")){
            return "Syntax Error";
       }else if(valor1.contains("%")){   
            //condiciona caso haja percentual
            //o último valor sempre será o caracter %
            int n_caracters = valor1.length();
            
            //valor_double é a conversão a substring do valor para double
            valor_double = Double.parseDouble(valor1.substring(0, n_caracters - 1));
            valor2_double = Double.parseDouble(valor2);
            multiplic = (valor_double / 100.0) * valor2_double;
            
            return String.valueOf(multiplic);
        }else{
           //condicionamento caso o valor2 tenha o caracter %
           if(valor2.contains("%")){
                int n_caracters = valor2.length();
                
                valor_double = Double.parseDouble(valor1);
                valor2_double = Double.parseDouble(valor2.substring(0, n_caracters - 1));
                multiplic = valor_double * (valor2_double/100);

                return String.valueOf(multiplic);
           }else{
                valor_double = Double.parseDouble(valor1);
                valor2_double = Double.parseDouble(valor2);
                multiplic = valor_double * valor2_double;

                return String.valueOf(multiplic);
           }
        }
    }
    
    public String divisao(){
       double divisao, valor_double, valor2_double;
        
       if(valor1.equals("") || valor2.equals("")){
            return "Syntax Error";
       }else if(valor1.contains("%")){   
            //condiciona caso haja percentual
            //o último valor sempre será o caracter %
            int n_caracters = valor1.length();
            
            //valor_double é a conversão a substring do valor para double
            valor_double = Double.parseDouble(valor1.substring(0, n_caracters - 1));
            valor2_double = Double.parseDouble(valor2);
            divisao = (valor_double / 100.0) / valor2_double;
            
            return String.valueOf(divisao);
        }else{
           //condicionamento caso o valor2 tenha o caracter %
           if(valor2.contains("%")){
                int n_caracters = valor2.length();
                
                valor_double = Double.parseDouble(valor1);
                valor2_double = Double.parseDouble(valor2.substring(0, n_caracters - 1));
                divisao = valor_double / (valor2_double/100);

                return String.valueOf(divisao);
           }else{
                valor_double = Double.parseDouble(valor1);
                valor2_double = Double.parseDouble(valor2);
                divisao = valor_double / valor2_double;

                return String.valueOf(divisao);
           }
        }
    }
    
    //memory methods
    
    public void inicializa_historico(String primeiroValor){
        mm.set_valor(primeiroValor);
    }
    
    public void adiciona_memoriaPositivo(String Campo_texto){
        mm.memory_mais(Campo_texto);
    }
    
    public void adiciona_memoriaNegativo(String Campo_texto){
        mm.memory_menos(Campo_texto);
    }
    
    public String acessa_historico(){
        return mm.get_valor();
    }
}
