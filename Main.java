public class Main {
    public static void main(String[] args) {
        AlunoRA aluno1 = new AlunoRA("Nome", 25, "G82DJG-0");

        System.out.println("Nome: " + aluno1.Nome());
        System.out.println("Idade: " + aluno1.Idade());
        System.out.println("RA: " + aluno1.RA());

        String raPesquisado = "G82DJG-0";
        if (aluno1.pertenceRA(raPesquisado)) {
            System.out.println("O RA " + raPesquisado + " pertence ao aluno " + aluno1.Nome());
        } else {
            System.out.println("O RA " + raPesquisado + " não pertence ao aluno " + aluno1.Nome());
        }
    }
}
