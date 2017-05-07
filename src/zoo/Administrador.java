package zoo;
public class Administrador extends Pessoa{
   public boolean ingles ;

  public Administrador(float s,String c){
    this.setSalario(s);
    this.cargo = c;
  } 
  public void fazerCadastroAnimal(){    
    System.out.println("Animal cadastrado com sucesso!");
  }  
}
