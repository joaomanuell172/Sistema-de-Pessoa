public class Professor extends Pessoa {

    public Professor(String nome) {
        super(nome);
    }
  
    @Override
    public void apresentar() {
        System.out.println("Olá, eu sou o professor " + nome + ".");
    }
    public void apresentar(String mensagem) {
        System.out.println("Professor " + nome + " diz: " + mensagem);
    }
}
