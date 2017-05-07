package zoo;
public class Zoo {
   public static void main(String[] args) {
    Animal a = new Animal();
    Pessoa p = new Pessoa();
    Administrador admin = new Administrador(5500.50f,"Admin");
    Zelador zel = new Zelador(1000.50f,"Zelador");
    Veterinário vet = new Veterinário(3500.75f,"Veterinário");
  
    
    admin.nome ="Gabriel Silva";
    admin.idade = 50;
    admin.sexo = 'M';
    admin.setRg("0.000.000");
    admin.setCpf("000.000.000-00");
    System.out.println(admin.toString());
    
    a.cor = "Laranja";
    a.tipo = "Felino";
    a.especie = "Leão-do-Kalahari";
    a.idade = 5;
    a.nome = "Leão";
    a.sexo = 'M';
    System.out.println(a.toString());
    admin.fazerCadastroAnimal();
    
    zel.nome = "Pedro Álvares";
    zel.sexo = 'M';
    zel.idade = 37;
    zel.setRg("1.111.111");
    zel.setCpf("111.111.111-11");
    System.out.println(zel.toString());
    zel.fome = true;
    zel.alimentarAnimal();
    
    
    vet.nome = "Bruna";
    vet.sexo = 'F';
    vet.idade = 25;
    vet.setRg("2.222.222");
    vet.setCpf("222.222.222-22");
    System.out.println(vet.toString());
    vet.vacinarAnimal();
    }
    
}
