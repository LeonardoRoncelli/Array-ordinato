import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        String [] parole=new String[100];
        System.out.println("Inserisci le stringhe");
        for (int i=0;i<parole.length;i++){
            parole[i]=input.nextLine();
            char carattere = 'A';
            int codiceAscii = (int) carattere;
            for (int j=0;j<parole.length;j++){
                if(parole[i].charAt(0)==carattere+1){
                    parole[i]=parole[j];
                }
            }
            if(parole[i].equalsIgnoreCase("fine")){
                break;
            }
        }
    }
}