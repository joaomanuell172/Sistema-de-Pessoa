public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João");
        Professor professor = new Professor("Dr. Silva");

        System.out.println("--- Teste de Sobrescrita ---");
        aluno.apresentar();
        professor.apresentar();

        System.out.println("\n--- Teste de Sobrecarga ---");
        aluno.apresentar("Estou pronto para a aula!");
        professor.apresentar("Por favor, abram os livros na página 42.");
    }
}
