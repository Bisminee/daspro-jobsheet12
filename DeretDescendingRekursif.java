import java.util.Scanner;
public class DeretDescendingRekursif {
    static int deretRekursif(int n){
        int temp = n;
        if(n == 0){
            temp = 0;
        }else{
            System.out.print(n + " ");
            temp = (deretRekursif(n - 1));
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan angka awal: ");
        angka = sc.nextInt();

        System.out.print(deretRekursif(angka));
    }
}
