package zoo;
public class Pessoa extends Animal{
   public String cargo;
   private float salario;
   private String rg,cpf;
   
     
     public void visitarAnimais(){
         
     }       

    public float getSalario(){
        return salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }
    
    public String getRg(){
        return rg;
    } 
    public void setRg(String rg){
        this.rg = rg;
    }
    public String getCpf(){
        return cpf;
    } 
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + ", idade=" + idade + ", sexo=" + sexo + ", rg=" + rg + ", cpf=" + cpf + '}';
    }
    
}
