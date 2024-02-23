import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        String [] parole=new String[100];
        System.out.println("Inserisci le stringhe");
        for (int i=0;i<parole.length;i++){
            parole[i]=input.nextLine();
            
            if(parole[i].equalsIgnoreCase("fine")){
                break;
            }
        }
    }
}