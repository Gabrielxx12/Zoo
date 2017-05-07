package zoo;
public class Zelador extends Pessoa{
  public Zelador(float s,String c){
    this.setSalario(s);
    this.cargo = c;
  }  
  public void alimentarAnimal(){
    if(this.fome ==  true)
      System.out.println("Animal Alimentado.");
    else
      System.out.println("Animal não está com fome");
  }   
  public void banharAnimal(){
  
  }                         
}    

