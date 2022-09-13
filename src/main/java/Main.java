import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Velkommen Til Superhelte programmet");

        Scanner scan = new Scanner(System.in);

        System.out.println("indtast navnet på din superhelt");
        String superHeltNavn = scan.next();

        System.out.println("indstast superkræft");
        String superKræft = scan.next();

        System.out.println("indtast virkelig navn");
        String virkelignavn = scan.next();

        System.out.println("indtast oprindelsesår");
        int oprindelsesår = scan.nextInt();

        System.out.println("er superhelten menneske (true/false)");
        boolean ermenneske = scan.nextBoolean();

        System.out.println("hvor høj er " + superHeltNavn + " i syrke");
        double styrke = scan.nextDouble();


        System.out.println("din super helt er " + superHeltNavn + ", " + superKræft + ", " + virkelignavn + ", " + oprindelsesår + ", " + ermenneske + ", " + styrke + ", ");
    }
}
