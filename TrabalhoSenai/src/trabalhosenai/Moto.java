
package trabalhosenai;

public class Moto extends Veiculo {
    
    public int numero = 986453;
    public String marca = "Toyota";
    public int ano = 2012;
    
    public void Status(){
        System.out.println("Você escolheu moto:");
        System.out.println("O numero da sua moto é: " + this.numero);
        System.out.println("A marca da moto é: " + this.marca);
        System.out.println("A ano da moto é: "+ this.ano);
        System.out.println("O tanque está em: " + this.gasolina);
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
}
