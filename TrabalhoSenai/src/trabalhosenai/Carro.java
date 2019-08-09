
package trabalhosenai;


public class Carro extends Veiculo {
    
    public int numero = 854614;
    public String marca = "Nissan";
    public int ano = 2046;
    public final int abastecer = 100; 
     public void Status(){
        System.out.println("Você escolheu carro:");
        System.out.println("O numero do seu carro é: " + this.numero);
        System.out.println("A marca do carro é: " + this.marca);
        System.out.println("A ano do carro é: "+ this.ano);
        System.out.println("Preço da Gasolina: " + this.preco + " Reais" );             
        System.out.println("Ano: " + this.ano);
        System.out.println("O tanque está em: " + this.gasolina);
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
}
