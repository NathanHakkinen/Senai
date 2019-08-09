
package trabalhosenai;

import java.util.Scanner;


public class TrabalhoSenai {

    
    public static void main(String[] args) {
        Caminhao c = new Caminhao();
        Moto b = new Moto();
        Carro a = new Carro();
        
       int seleciona = 100;
       int seleciona1 = 0;
       int seleciona2 = 0;
       int seleciona3 = 0;
       while(seleciona != 0){
        System.out.println("====================================================");
        System.out.println("Selecione o veiculo");
        System.out.println("1 - Caminhão");
        System.out.println("2 - Moto");
        System.out.println("3 - Carro");
        System.out.println("0 - Fechar o programa");
        System.out.println("=====================================================");
        Scanner seleca = new Scanner(System.in);
        seleciona = seleca.nextInt();
        
        switch(seleciona){
        //CAAAAAAAMIIINHAOOOO
            case 1: 
                while(seleciona1 != 10){
        System.out.println("======================================================");    
        System.out.println("Você escolheu caminhão");
        System.out.println("4 - Status");
        System.out.println("5 - Status do pneu");
        System.out.println("5 - Status do pneu");
        System.out.println("6 - Abastecer");
        System.out.println("7 - Acelerar o caminhão");
        System.out.println("8 - ligar o caminhão");
        System.out.println("9 - Desligar o caminhão");
        System.out.println("10 - Volte o menu principal");
        System.out.println("======================================================");
        
        Scanner s1 = new Scanner(System.in);
        seleciona1 = s1.nextInt();
        
        if(seleciona1 == 4){
            c.Status();
        }
         else if(seleciona1 == 5){  
            c.Roda();
        }
        else if(seleciona1 == 6){  
            c.Abastecercaminhao();
        }
         else if(seleciona1 == 7){
            c.Acelerar();
        }
         else if(seleciona1 == 8){
            c.Ligar();
        }
         else if(seleciona1 == 9){
            c.Desligar();
        }             
        else if(seleciona == 10){
            break;
        }
        }
       
            break;
            default:
                break;
                
        //MOOTTTTTOOOOOOO
        case 2:
            while(seleciona2 != 10){
        System.out.println("======================================================");    
        System.out.println("Você escolheu moto");
        System.out.println("4 - Status");
        System.out.println("5 - Status do pneu");
        System.out.println("6 - Abastecer");
        System.out.println("7 - Acelerar a moto");
        System.out.println("8 - ligar a moto");
        System.out.println("9 - Desligar moto");
        System.out.println("10 - Volte o menu principal");
        System.out.println("======================================================");
        
        Scanner s2 = new Scanner(System.in);
        seleciona2 = s2.nextInt();
        
        if(seleciona2 == 4){
            b.Status();
        }
        else if(seleciona2 == 5){  
            b.Roda();
        }
        else if(seleciona2 == 6){  
            b.Abastecermoto();
        }
         else if(seleciona2 == 7){
            b.Acelerar();
        }
         else if(seleciona2 == 8){
            b.Ligar();
        }
         else if(seleciona2 == 9){
            b.Desligar();
        }
        else if(seleciona == 10){
            break;
        }
        }
            break;
        
            
        //CARRRRRRRRRROOOOOO    
        case 3:
            while(seleciona3 != 10){
        System.out.println("======================================================");
        System.out.println("Você escolheu carro");
        System.out.println("4 - Status");
        System.out.println("5 - Status do pneu");
        System.out.println("6 - Abastecer");
        System.out.println("7 - Acelerar a carro");
        System.out.println("8 - ligar o carro");
        System.out.println("9 - Desligar o carro");
        System.out.println("10 - Volte o menu principal");
        System.out.println("======================================================");
        
        Scanner s3 = new Scanner(System.in);
        seleciona3 = s3.nextInt();
        
        if(seleciona3 == 4){
            a.Status();
        }
         else if(seleciona3 == 5){  
            c.Roda();
        }
        else if(seleciona3 == 6){  
            c.Abastecercarro();
        }
         else if(seleciona3 == 7){
            c.Acelerar();
        }
         else if(seleciona3 == 8){
         
            c.Ligar();
        }
         else if(seleciona3 == 9){
            c.Desligar();
        }             
        else if(seleciona == 10){
            break;
        }
        else if(seleciona == 10){
            break;
       }
            }
        }
       }
    }
}
        
        //c.Status();
        //System.out.println("CAMINHÃO");
        //c.Status();  
        //System.out.println("======================================================");
        //c.Abastecercaminhao();
        //c.Acelerar();
        //c.Ligar();
        //c.Roda();
        //System.out.println("********************************");
        //System.out.println("MOTO");
        //b.Status();  
        //System.out.println("======================================================");
        //b.Abastecermoto();
        //b.Acelerar();
        //b.Ligar();
        //b.Roda();
        //System.out.println("**********************************");
        //System.out.println("CARRO");
        //a.Status();  
        //System.out.println("======================================================");
        //a.Abastecercarro();
        //a.Acelerar();
        //a.Ligar();
        //a.Roda();
    
    

