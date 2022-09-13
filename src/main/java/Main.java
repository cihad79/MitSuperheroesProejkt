import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Database database = new Database();

        System.out.println("Velkommen Til Superhelte programmet");

        Scanner scan = new Scanner(System.in);

        int opretEllerAfslut;
        do {

            System.out.println("1. Opret superhelt");
            System.out.println("2. Afslut");
            opretEllerAfslut = scan.nextInt();

            if (opretEllerAfslut == 2) {
                System.out.println("Du har Afsluttet programmet");
                System.exit(0);
            }
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


       database.createSuperhelt(superHeltNavn, superKræft, virkelignavn, oprindelsesår, ermenneske, styrke);
            } while (opretEllerAfslut != 2);

        }
}
