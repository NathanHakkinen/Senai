
package trabalhosenai;

public class Caminhao extends Veiculo {
    
    public String numero = "1232123";
    public String marca = "Ford";
    public int ano = 2018;
    public int abastecer = 200;
    public void Status(){
        System.out.println("Você escolheu moto:");
        System.out.println("O numero do seu caminhão é: " + this.numero);
        System.out.println("A marca do caminhão é: " + this.marca);
        System.out.println("A ano do caminhão é: "+ this.ano);
        System.out.println("Preço da Gasolina: " + this.preco + " Reais" );             
        System.out.println("Ano: " + this.ano);
        System.out.println("O tanque está em: " + this.gasolina);
    }
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

    
}
