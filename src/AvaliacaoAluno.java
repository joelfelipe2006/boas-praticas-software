/**
 * Calcula a média de um aluno a partir de duas notas e indica sua situação
 * (Aprovado ou Reprovado).
 */
public class AvaliacaoAluno {

    private static final double MEDIA_MINIMA_APROVACAO = 6.0;

    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double notaPrimeiroBimestre = 8;
        double notaSegundoBimestre = 7;

        double media = calcularMedia(notaPrimeiroBimestre, notaSegundoBimestre);
        String situacaoAluno = verificarSituacaoAluno(media);

        apresentarResultado(nomeAluno, media, situacaoAluno);
    }

    /**
     * Calcula a média aritmética simples entre duas notas.
     */
    private static double calcularMedia(double notaPrimeiroBimestre, double notaSegundoBimestre) {
        return (notaPrimeiroBimestre + notaSegundoBimestre) / 2;
    }

    /**
     * Compara a média do aluno com a média mínima de aprovação e retorna a situação.
     */
    private static String verificarSituacaoAluno(double media) {
        if (media >= MEDIA_MINIMA_APROVACAO) {
            return "Aprovado";
        }
        return "Reprovado";
    }

    private static void apresentarResultado(String nomeAluno, double media, String situacaoAluno) {
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Media: " + media);
        System.out.println(situacaoAluno);
    }
}
