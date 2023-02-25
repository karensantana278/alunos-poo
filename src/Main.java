import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a matrícula do aluno:");
        String matricula = scanner.nextLine();

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite o e-mail do aluno:");
        String email = scanner.nextLine();

        System.out.println("Digite o curso do aluno:");
        String curso = scanner.nextLine();

        System.out.println("Digite o telefone do aluno:");
        String telefone = scanner.nextLine();

        System.out.println("Digite o endereço do aluno:");
        String endereco = scanner.nextLine();


        Alunos aluno = new Alunos(matricula, nome, email, curso, telefone, endereco);

        System.out.println("Digite a nota 1 do aluno:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota 2 do aluno:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota 3 do aluno:");
        double nota3 = scanner.nextDouble();


        aluno.lancarNota1(nota1);
        aluno.lancarNota2(nota2);
        aluno.lancarNota3(nota3);

        System.out.println("Digite o número de faltas do aluno:");
        int numeroFaltas = scanner.nextInt();


        aluno.lancarFaltas(numeroFaltas);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Endereço: " + aluno.getEndereco());
        System.out.println("Telefone: " + aluno.getTelefone());
        System.out.println("Número de faltas: " + aluno.getNumero_de_faltas());
        System.out.println("Notas: " + Arrays.toString(aluno.getNotas()));
        System.out.println("Situação: " + aluno.verificar());
    }
}
