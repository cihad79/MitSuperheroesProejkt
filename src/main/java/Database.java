public class Database {
    private Superhelt[] superhelte;
    private int antalSuperhelte;

    public Database(){
        superhelte = new Superhelt[5];
        antalSuperhelte = 0;
    }
    public void createSuperhelt(String superHeltnavn, String superkræft, String virkeligenavn, int oprindelsesår,
                               boolean ermenneske, double styrke) {
        Superhelt superhelt = new Superhelt(superHeltnavn, superkræft, virkeligenavn, oprindelsesår, ermenneske, styrke);
    superhelte[antalSuperhelte++] = superhelt;
        System.out.println(superhelt);
        System.out.println("antallet af superhelte i databasen" + antalSuperhelte);

    }
        public int getAntalSuperhelte(){
        return antalSuperhelte;

}



}

