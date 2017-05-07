package zoo;
public class Veterinário extends Pessoa{
    public Veterinário(float s,String c){
      this.setSalario(s);
      this.cargo = c;
    }
    public void vacinarAnimal(){
       System.out.println("Animal Vacinado!");
    }
    public void acompanhamentoAnimal(){
        
    }
}

