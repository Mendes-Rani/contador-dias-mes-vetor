/**Programa simples para representar os meses do ano e a quantidade de dias de cada mês utilizando vetores. O programa percorre os vetores e exibe o nome do mês e a quantidade de dias correspondente.
 *
 */
package classes;

public class ContadorDiaMesVetor {
    public static void main(String[] args) {
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int i=0; i<mes.length; i++){
            System.out.println("O Mês de " + mes[i] + " tem " + tot[i] + " dias.");
        }

    }
}
