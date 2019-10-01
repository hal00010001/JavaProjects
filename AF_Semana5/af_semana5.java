import java.util.Scanner;

public class af_semana5 {

    public static void main(String[] args) {
        String caractere = null;
        Scanner captura = null;
        int counter = 0;
        while (!caractere.equals(".")){
          captura = new Scanner(System.in);
          caractere = captura.next();
          System.out.println(caractere);
          counter++;
        }
        System.out.println("Foram digitados "+counter+" caracteres!");
    }

}
