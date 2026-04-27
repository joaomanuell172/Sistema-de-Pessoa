public class Aluno extends Pessoa {

    public Aluno(String nome) {
        super(nome);
    }

    // Sobrescrita (Override)
    @Override
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e sou aluno da instituição.");
    }

    // Sobrecarga (Overload)
    public void apresentar(String mensagem) {
        System.out.println("Aluno " + nome + " diz: " + mensagem);
    }
}
