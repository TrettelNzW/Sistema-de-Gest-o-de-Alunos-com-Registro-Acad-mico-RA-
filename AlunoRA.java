class AlunoRA extends Aluno {
    String RA;

    AlunoRA(String nome, int idade, String RA) {
        super(nome, idade);
        this.RA = RA;
    }

    public String RA() {
        return RA;
    }

    boolean pertenceRA(String RA) {
        return this.RA.equals(RA);
    }
}
