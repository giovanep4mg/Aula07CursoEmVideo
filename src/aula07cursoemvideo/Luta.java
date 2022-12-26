
package aula07cursoemvideo;

import java.util.Random;


public class Luta {
    // atributos 
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
   public void marcarLuta(Lutador l1, Lutador l2){
     //se  a categoria  l1  for igual a categoria l2
       if(l1.getCategoria().equals(l2.getCategoria()) 
               
             // se o l1 e o l2 forem diferentes 
               && l1 != l2)   {
            
          // vai na variável aprovada e muda para true(verdadeiro) 
           this.aprovada = true;
           
       // vai na variável desafiado e salva o l1 lá   
           this.desafiado = l1;
       // vai na variável desafiante e salva o l2 lá     
           this.desafiante = l2;
           
      //senao     
         } else {
           
        // vai na variável aprovada e coloca como false(falso)
           this.aprovada = false;
       
      // vai na variável desafiado e coloca null( que não tem nada)
           this.desafiado = null;
      // vai na variável desafiado e coloca null( que não tem nada)
           this.desafiante = null;
           
       }
          
   
   }
   
   public void luta(){
   
        if(this.aprovada){
            System.out.println("###### Desafiado ######");
            this.desafiado.apresentar();
            System.out.println("##### desafiante #####");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            
            int vencedor = aleatorio.nextInt(3);// 0,1,2
            System.out.println("=======RESULTADO DA LUTA===========");
            switch (vencedor) {
                case 0 :// empate luta
                    System.out.println("Deu empate");
                    this.desafiado.empatarLutas();
                    this.desafiante.empatarLutas();
                    break;
                case 1: // ganhou desafiado
                    System.out.println("Vitória do  "+this.desafiado.getName());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2 : // ganhou desafiante
                    System.out.println("Vitória do "+this.desafiante.getName());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();   
                    break;
            default:
           }
            System.out.println("===============================================");
        } else {
           System.out.println("Luta não pode acontecer ");       
       }
   
        
   }

   
   
   
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
            
    
    
    
    
    
    
    
    
    
}
