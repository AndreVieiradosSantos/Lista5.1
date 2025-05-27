import Notas.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno>alunos = new ArrayList<>();
        int opcao;
        Scanner aluno = new Scanner(System.in);
        System.out.println("==============MENU===============");
        do {
            System.out.println("1 para cadastrar");
            System.out.println("2 para exibir");
            System.out.println("3 para excluir");
            System.out.println("4 para sair");
            opcao = aluno.nextInt();
            aluno.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do aluno:");
                    String nome = aluno.nextLine();
                    System.out.println("Digite a série:");
                    String serie = aluno.nextLine();
                    System.out.println("1 - nota:");
                    double nota1 = aluno.nextDouble();
                    aluno.nextLine();
                    System.out.println("2 - nota:");
                    double nota2 = aluno.nextDouble();
                    aluno.nextLine();
                    System.out.println("3 - nota:");
                    double nota3 = aluno.nextDouble();
                    aluno.nextLine();
                    double media = (nota1+nota2+nota3)/3;
                    System.out.println("Média:"+media);
                    alunos.add(new Aluno(nome,serie,nota1,nota2,nota3,media));
                    break;
                case 2:
                    System.out.println(alunos);
                    break;
                case 3:
                    System.out.println("Digite o nome do aluno a ser removido:");
                    String itemRemovido = aluno.nextLine();
                    for(int i=0;i< alunos.size();i++){
                        Aluno aluno1 = alunos.get(i);
                        if(aluno1.getNomeAluno().equals(itemRemovido)){
                            alunos.remove(i);
                            break;
                        }
                    }
                    System.out.println("Aluno removido:"+itemRemovido);
                    System.out.println(alunos);

                    break;
            }
        }while (opcao>0 && opcao<4);

    }
}