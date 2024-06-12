package CONTROL;

public class Memory {
    //ATTRIBUTES
    protected String valor;
    
    //METHODS
    //constructor
    protected Memory(){
        
    }
    
    //getters
    protected String get_valor(){
        return valor;
    }
    
    //setters
    protected void set_valor(String valor){
        this.valor = valor;
    }
    
    //others
    protected void memory_mais(String campo_texto){
        String new_valor;
        new_valor = String.valueOf( (Double.parseDouble(valor) + Double.parseDouble(campo_texto)) );
        valor = new_valor;
    }
    
    protected void memory_menos(String campo_texto){
        String new_valor;
        new_valor = String.valueOf( (Double.parseDouble(valor) - Double.parseDouble(campo_texto)) );
        valor = new_valor;
    }
    
}
