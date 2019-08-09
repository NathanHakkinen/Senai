package trabalhosenai;


public abstract class Veiculo implements Interface{
    public float preco = 3.5f;
    public int abastecer = 50; 
    public int acelerar = 10;
    public boolean motor;
    public int resultado;
    public int gasolina;
    public boolean rodas = false;
    
    @Override
    public void Abastecercaminhao(){
        if(this.motor == true){
            System.out.println("Desligue o seu caminhão para abastecer");
        }
        else{
            System.out.println("O tanque foi abastecido com: " + abastecer + " Reais");
            gasolina = abastecer;
        }
    }
    @Override
     public void Abastecermoto(){
        if(this.motor == true){
            System.out.println("Desligue o sua moto para abastecer");
        }
        else{
            System.out.println("O tanque foi abastecido com: "  + abastecer + " Reais");
            gasolina = abastecer;
        }
    }   
    @Override
      public void Abastecercarro(){
          
        if(this.motor == true){
            System.out.println("Desligue o seu carro para abastecer");
        }
        else{
            System.out.println("O tanque foi abastecido com: " + abastecer + " Reais");
            gasolina = abastecer;
        }
    }
  @Override
     public void Acelerar(){
        if(this.motor == true){
            this.resultado = this.abastecer - this.acelerar;
            System.out.println("Você acelerou, sua gasolina está em " + resultado);
        }
        else{
            System.out.println("O motor está desligado, ligue o veiculo por gentiliza");
        }
    }
     @Override
    public void Roda(){
        if(rodas == true){
            System.out.println("O PNEU ESTÁ FURADO!!!!!");
        }
        else{
            System.out.println("O seu pneu está ótimo");
        }
    }
     @Override
    public void Ligar(){           
        if(this.motor == true){
            System.out.println("O motor já está ligado");
        }
        else{
            System.out.println("O motor foi ligado");
            this.motor = true;
        }
        
        }
     @Override
    public void Desligar(){
        if(this.motor == false){
            System.out.println("O motor já esta desligado");
        }
        else{
            System.out.println("O motor foi desligado");
            this.motor = false;
        }
    }
    
}
