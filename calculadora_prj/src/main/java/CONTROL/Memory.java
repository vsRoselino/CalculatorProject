package CONTROL;

public class Memory {
    //ATTRIBUTES
    protected String valor;
    
    //METHODS
    //constructor
    
    //getters
    public String get_valor(){
        return valor;
    }
    
    //setters
    //este é o próprio memory_mais
    public void set_valor(String valor){
        this.valor = valor;
    }
    
    //others
    public void memory_mais(String campo_texto){
        String new_valor;
        new_valor = String.valueOf( (Double.parseDouble(valor) + Double.parseDouble(campo_texto)) );
        valor = new_valor;
    }
    
    public void memory_menos(String campo_texto){
        String new_valor;
        new_valor = String.valueOf( (Double.parseDouble(valor) - Double.parseDouble(campo_texto)) );
        valor = new_valor;
    }
    
}
