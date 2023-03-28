import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        double km,perkm=2.20,total,startPrice=10;
        Scanner input=new Scanner(System.in);
        System.out.print("Gideceğiniz Mesafeyi Km Cinsinden Yazınız : ");
        km= input.nextDouble();
        total=(km*perkm)+ startPrice;
        total = (total<20)? 20:total;

        System.out.println("Toplam Tutar:"+total);


    }
}
