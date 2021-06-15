import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Çift Sayi Giriniz (Çıkmak için tek sayi giriniz): ");
        int sayi=0,toplam=0;
        while(sayi%2==0){
            sayi=input.nextInt();
            if(sayi%4==0){
                toplam=toplam+sayi;
            }
        }
        System.out.println("Toplam:"+toplam);
    }
}
