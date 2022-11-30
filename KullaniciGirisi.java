import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String password,userName,password2;
        int secim;
        Scanner in=new Scanner(System.in);
        System.out.print("Kullanici adinizi giriniz:");
        userName=in.next();
        System.out.print("Sifrenizi giriniz:");
        password=in.next();

        if(userName.equals("patika")&&password.equals("dev"))
            System.out.println("Giris Basarili!!!!");
        else
        {
            System.out.println("Bilgileriniz Yanlis\n-----------------------------------------------------------");
              if(userName.equals("patika")&&!password.equals("dev"))
              {
                  System.out.print("Sifrenizi sifirlamak ister misiniz?[1-Evet 2-Hayir]:");
                  secim=in.nextInt();
                  if(secim==1)
                  {
                      System.out.print("Lutfen yeni bir sifre giriniz:");
                      password2=in.next();
                      if(password.equals(password2))
                          System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                      else
                          System.out.println("Sifre basariyla degistirildi");
                  }


              }

        }


    }



}
