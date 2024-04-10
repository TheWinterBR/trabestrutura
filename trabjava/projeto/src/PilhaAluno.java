import java.util.Stack;

class Aluno {
    String nome;
    int matricula;
    char sexo;

    public Aluno(String nome, int matricula, char sexo) {
        this.nome = nome;
        this.matricula = matricula;
        this.sexo = sexo;
    }
}

public class PilhaAluno {

    public static void main(String[] args) {

        Stack<Aluno> PE_1 = new Stack<>();
        Stack<Aluno> PE_2 = new Stack<>();

        
        for (int i = 1; i <= 20; i++) {
            
            String nome = "Aluno" + i;
            int matricula = 1000 + i;
            char sexo = (i % 2 == 0) ? 'F' : 'M';

            Aluno aluno = new Aluno(nome, matricula, sexo);


            if (sexo == 'F') {
                PE_1.push(aluno);
            } else {
                PE_2.push(aluno);
            }
        }

        System.out.println("Alunos do sexo feminino (PE_1):");
        while (!PE_1.isEmpty()) {
            Aluno aluno = PE_1.pop();
            System.out.println("Nome: " + aluno.nome + ", Matrícula: " + aluno.matricula);
        }

        System.out.println("\nAlunos do sexo masculino (PE_2):");
        while (!PE_2.isEmpty()) {
            Aluno aluno = PE_2.pop();
            System.out.println("Nome: " + aluno.nome + ", Matrícula: " + aluno.matricula);
        }
    }
}
