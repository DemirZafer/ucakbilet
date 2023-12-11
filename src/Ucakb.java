import java.util.Scanner;
public class Ucakb {
    public static void main(String[] args) {
        Scanner dt = new Scanner(System.in);
        int mes , age , tip ;
        float mesb = 0.10f , totalPrice , discountPrice , typceDiscount ;

        System.out.println("Kaç Km Mesafe Gideceksiniz : ");
        mes = dt.nextInt();
        totalPrice = mes*mesb;
        System.out.println("Kaç Yaşındasınız? : ");
        age = dt.nextInt();
        System.out.println("Yolculuk Tipiniz Nedir?(1-Tek Yön),(2-Gidiş ve Dönüş) :  ");
        tip = dt.nextInt();

        if (mes>0&&age>0&&(tip==1||tip==2)){
            if (tip==2){
                 typceDiscount =totalPrice*0.20f;
                if (age<12){
                    discountPrice = totalPrice*0.50f;
                    totalPrice -=discountPrice;
                    totalPrice -=totalPrice*0.20f;
                    System.out.println("Bilet Fiyatınız : "+totalPrice*2);
                }
                else if (age>=12&&age<=24){
                    discountPrice = totalPrice*0.10f;
                    totalPrice -=discountPrice;
                    totalPrice -=totalPrice*0.20f;
                    System.out.println("Bilet Fiyatınız : "+totalPrice*2);
                } else if (age>65) {
                    discountPrice = totalPrice*0.30f;
                    totalPrice -=discountPrice;
                    totalPrice -=totalPrice*0.20f;
                    System.out.println("Bilet Fiyatınız : "+totalPrice*2);
                }else {
                    totalPrice -=typceDiscount;
                    System.out.println("Bilet Fiyatınız : "+totalPrice*2);
                }
            }else {
                if (age<12){
                    discountPrice = totalPrice*0.50f;
                    totalPrice -=discountPrice;
                    System.out.println("Bilet Fiyatınız : "+totalPrice);
                }
                else if (age>=12&&age<=24){
                    discountPrice = totalPrice*0.10f;
                    totalPrice -=discountPrice;
                    System.out.println("Bilet Fiyatınız : "+totalPrice);
                } else if (age>65) {
                    discountPrice = totalPrice*0.30f;
                    totalPrice -=discountPrice;
                    System.out.println("Bilet Fiyatınız : "+totalPrice);
                }else {
                    System.out.println("Bilet Fiyatınız : "+totalPrice);
                }
            }
        }else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
