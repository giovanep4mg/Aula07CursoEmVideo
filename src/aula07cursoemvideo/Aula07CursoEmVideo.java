
package aula07cursoemvideo;
/*
 * Aula encapsulamento
 * 
 * relacionamento entre classes
 * 
 */

public class Aula07CursoEmVideo {

    public static void main(String[] args) {
        
      // criou um vetor para chamar varios lutadores no caso 6 " começa a contar aparti do zero".
        Lutador l[] = new Lutador[6];
        
      // criando um lutador ,passando todos os parametros , fazer isso para os 6 
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.55f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putyscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaat", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
       
       Luta  UEF01 = new Luta();
       
       UEF01.marcarLuta(l[4], l[5]);
       UEF01.luta();
       l[4].status();
       l[5].status();
        
        
        
    }
    
}
