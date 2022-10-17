import java.io.IOException;
 
// Importação de classe suplementares
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        // Instanciamento do objeto "teclado" via método "Scanner(System.in)"
        Scanner teclado = new Scanner(System.in);
        // Instancioamento dos objetos array com tamanho definido 5
        int plug[] = new int[5];
        int tomada[] = new int[5];
        // Declaração de variável acumuladora e sua inicialização
        int resultado = 0;
        /* Loop "for" que varrerá o intervalo definido pela inicialização da 
         * variável de controle "i" e o teste lógico. Em cada passagem será
         * atribuído o valor de input pelo usuário ao elemento com índice igual
         * ao valor da variável de controle "i"
         */
        for(int i = 0; i < 5; i++){
            plug[i] = teclado.nextInt();
        }// FIM LOOP FOR
        /* Loop "for" que varrerá o intervalo definido pela inicialização da 
         * variável de controle "j" e o teste lógico.Em cada passagem será
         * atribuído o valor de input pelo usuário ao elemento com índice igual
         * ao valor da variável de controle "j"
         */
        for(int j = 0; j < 5; j++){
            tomada[j] = teclado.nextInt();
        }
        /* Loop "for" que varrerá o intervalo definido pela inicialização da 
         * variável de controle "k" e o teste lógico. Estrutura condicional 
         * simples que caso "true" incrementará 1 ao valor da variável resultado
         */
        for(int k = 0; k < 5; k++){
            if(plug[k] != tomada[k]){
                resultado += 1;
            }// FIM ESTRUTURA CONDICIONAL SIMPLES
        }// FIM LOOP 
        /* Estrutura condicional composta que, caso "true" exibirá o caractere
         * "Y" e caso "false" exibirá o caractere "N"
         */
        if(resultado == 5){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }// FIM ESTRUTURA CONDICIONAL COMPOSTA
    }// FIM MÉTODO PRINCIPAL
}// MÉTODO CLASSE PRINCIPAL
