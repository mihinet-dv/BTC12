import java.util.Scanner;
public class test {

    public static void main(String[]args){
            Scanner test =  new Scanner(System.in);
            System.out.println("hello Welcome bank TEB ");
        System.out.println("Enter pin code  ");
        int pin =    Integer.parseInt(test.nextLine());
            if (pin ==1234){
                System.out.println("pin is corectli");
                System.out.println("Mihnet Veliji");
            }else{
                System.out.println("pin is false");
                return;
            }


        //som ostanav da naprajm kako da iskoci na opcija
        System.out.println("Podini novac  1");
        System.out.println("Proveri novac 2");
        System.out.println("Ubaci Novac 3");


        int opcije = test.nextInt();

        int Ubaci = test.nextInt();
        int Novac = 2599;


        switch (opcije) {

            case 1:
                System.out.println("20$ 30$ 50$");
                break;
            case 2:
                System.out.println(Novac + "$");
                break;
            case 3:
                System.out.println("Na vas racun imate");
                System.out.println(Ubaci + Novac + "$" );
                break;
        }
        int podini = test.nextInt();
        System.out.println(podini - Novac +"$" );
        System.out.println("Podigli ste $" + podini);







    }


}
