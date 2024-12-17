import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  public static void main (String... args){
  
    Scanner input = new Scanner(System.in);
    int numero = 0;
    while(true){
      System.out.println("Digite o número a ser convertido: ");
      if(input.hasNextInt()){
        numero = input.nextInt();
        break;
      }
      else{
        System.out.println("Valor invalido");
        input.nextLine();
      }
    }
    
    ArrayList<Integer> binaryArray = new ArrayList<Integer>();
    ArrayList<String> reversedBinaryArray = new ArrayList<String>();
    while (numero / 2 != 1 && numero != 2){
      binaryArray.add(numero % 2);
      if (numero / 2 == 2){
         binaryArray.add((numero / 2) % 2);
         binaryArray.add((numero / 4) % 2);
      }
      numero /= 2;
    }

    for(int i = binaryArray.size() - 1; i >= 0; i--){
      System.out.print(binaryArray.get(i));
    }

    System.out.println("");
  }

}
