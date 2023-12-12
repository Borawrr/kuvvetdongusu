import java.util.Scanner;

public class dongukuvvet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        
        System.out.println("4'ün ve 5'in kuvvetleri:");

        for (int i = 0; i <= sayi; i++) {
            
            System.out.println("4^" + i + " = " + (int) Math.pow(4, i));
            System.out.println("5^" + i + " = " + (int) Math.pow(5, i));
        







        
        }
    
        scanner.close();
    
    }


}