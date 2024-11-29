import java.util.Scanner;
public class Percobaan2 {
    static int hitungPangkat(int x, int y){
        if (y == 0){
            return(1);
        }else{
            return(x * hitungPangkat(x, y-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.println("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.println("Pangkat: ");
        pangkat = sc.nextInt();

        System.out.println(hitungPangkat(bilangan, pangkat));
    }
}
