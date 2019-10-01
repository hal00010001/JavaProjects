
package atividadera4;

import java.io.BufferedReader;
import java.io.FileReader;


public class AtividadeRA4 {
    public static void main(String[] args) {
        /*
            Os métodos a seguir lançam algumas exceções que interropem a execução do programa. 
            Aplique os tratamentos adequados sem alterar os códigos já existentes. 
            O objetivo dessa atividade não é corrigir os problemas apresentados, mas aplicar o tratamento de exceção correto para evitar a interrupção do programa.
            Sua tarefa consiste em decidir qual a melhor opção para cada situação (blocos try/catch/finally ou os comandos throw e throws)e aplicar ela para gerar um retorno agradável ao usuário.
        */
        
        metodo1(); //Podem ocorrer duas exceções nesse método, a FileNotFoundException caso se tente abrir um arquivo que não existe e a IOException caso ocorra outro problema com a manipulação do arquivo. Essas exceções podem ser tratadas no próprio método, por isso podemos usar os blocos try/catch/finally (nem sempre a sugestão da sua IDE é a melhor opção). Use o comando System.err.println(""); para enviar uma mensagem ao usuário explicando o que aconteceu.
        metodo2(); //Identifique a exceção gerada e aplique o tratamento adequado para ela.
        metodo3(); //Esse método gera um ArithmeticException. Trate esse erro no método e envie uma mensagem para o usuário explicando o que aconteceu caso o erro tenha sido gerado.
        metodo4(); //O uso incorreto dos atributos também podem gerar exceções. Trate o problema apresentado.
        metodo5(); //Identifique a exceção gerada e aplique o tratamento adequado para ela.
    }
    
    static void metodo1(){
        System.out.println("M1 - Start");
        
        BufferedReader br = new BufferedReader(new FileReader("c:/arquivoinexistente.html"));
        while(br.ready()){
           String linha = br.readLine();
           System.out.println(linha);
        }
        br.close();
        
        System.out.println("M1 - End");
    } 

    private static void metodo2() {
        System.out.println("M2 - Start");
        
        Integer[] numeros = new Integer[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("número: " + i + " = " + numeros[i]);
        }
        
        System.out.println("M2 - End");
    }

    private static void metodo3() {
        System.out.println("M3 - Start");
        
        Integer valor;
        valor = 15/0;
        System.out.println("Divisão = " + Integer.toString(valor));
        
        System.out.println("M3 - End");
    }

    private static void metodo4() {
        System.out.println("M4 - Start");
        
        String teste = "Nova String";
        teste = 5;
        
        System.out.println("M4 - End");
    }

    private static void metodo5() {
        System.out.println("M5 - Start");
        
        String nome;
        nome = geraNome();
        
        System.out.println("M5 - End");
    }
    
}
