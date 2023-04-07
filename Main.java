public class Main {

public static void main(String[] args) {
    
 String nome1 = "Maria";
 String nome2 = "João";
 String nome3 = "Carlos";

int idade1 = 25;
int idade2 = 30;
int idade3 = 35;

String endereco1 = "Bahia";
String endereco2 = "Rio de Janeiro";
String endereco3 = "São Paulo";

Pessoa pessoa1 = new Pessoa (nome1, idade1, endereco1);
Pessoa pessoa2 = new Pessoa (nome2, idade2, endereco2);
Pessoa pessoa3 = new Pessoa (nome3, idade3, endereco3);

Funcionario func1 = new Funcionario(pessoa1.getNome(), pessoa1.getIdade(), pessoa1.getEndereco(), "Gerente");
Funcionario func2 = new Funcionario(pessoa2.getNome(), pessoa2.getIdade(), pessoa2.getEndereco(), "Assistente");
Funcionario func3 = new Funcionario(pessoa3.getNome(), pessoa3.getIdade(), pessoa3.getEndereco(), "Supervisor");

System.out.println(func1.toString());
System.out.println(func2.toString());
System.out.println(func3.toString());
}


}