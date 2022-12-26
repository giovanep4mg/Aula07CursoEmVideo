
package aula07cursoemvideo;


public class Lutador {
    // atributos 
    private String name;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.name = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        
      // se o peso for menor que ...  
        if(this.peso < 52.2){
            
          //vai e salva na variavel categoria "inválido".  
             this.categoria = "inválido";
             
       //senao, se o peso for menor ou igual ...   
        }else if(this.peso <= 70.3){
          
            //vai e salva na variavel categoria " Leve ".
              this.categoria = "Leve";
              
      //senao,se o peso for menor ou igual a ....        
        }else if(this.peso <= 83.9){
            
            //vai e salva na variável categoria "Médio".
              this.categoria = "Médio";
          
       //senao,se o peso for menor ou igual a ...       
        }else if(this.peso <= 120.2){
            
            //vai e salva na variável categoria "Pesado".
              this.categoria = "Pesado";
              
        //senao      
        } else {
            // vai e salva na variável categoria "inválido"
            this.categoria = " inválido";
        }
        
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    public void ganharLuta(){
  // vai na variável vitorias, vê o que tem nela e acrescenta mais 1 (+1)
      this.setVitorias(this.getVitorias() + 1);
      
    }
    
     public void perderLuta(){
  // vai na variável derrotas, vê o que tem nela e diminui mais 1 (-1)
      this.setDerrotas(this.getDerrotas() -(-1));
      
    }
     
     public void empatarLutas(){
     // vai na variável empates, vê o que tem e acrescenta mais 1 (+1).
        this.setEmpates(this.getEmpates() + 1);
     }
    public void apresentar(){
        
      System.out.println("________________________________________________");
      System.out.println("Com vocês , o lutador : "+this.getName());
      System.out.println("que nascem em : "+this.getNacionalidade());
      System.out.println("tem "+this.getIdade()+ " anos, com a altura de "+this.getAltura()+" metros ");
      System.out.println("pesando "+this.getPeso()+" kg");
      System.out.println("já venceu "+this.getVitorias()+" lutas, perdeu "+this.getDerrotas()+" lutas, empatou "+this.getEmpates());
      
    
    }
   public void status(){
       System.out.println("____________________________________________");
       System.out.println(this.getName());
       System.out.println("É um peso "+this.getCategoria());
       System.out.println("Tem "+this.getVitorias()+" vitorias");
       System.out.println("Com "+this.getDerrotas()+" derrotas, e com "+this.getEmpates()+" empates");
       
   } 
    
    
    
}
