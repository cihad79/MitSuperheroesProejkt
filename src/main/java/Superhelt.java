public class Superhelt {
    private String superHeltNavn;
    private String superkræft;
    private String virkelignavn;
    private int oprindelsesår;
    private boolean ermenneske;
    private double styrke;

    public Superhelt(String superHeltNavn, String superkræft, String virkelignavn,int oprindelsesår, boolean ermenneske, double styrke ){
        this.superHeltNavn = superHeltNavn;
        this.superkræft = superkræft;
        this.virkelignavn = virkelignavn;
        this.oprindelsesår = oprindelsesår;
        this.ermenneske = ermenneske;
        this.styrke = styrke;
    }
    public String getSuperHeltNavn(){
     return superHeltNavn;
    }
    public String getSuperkræft() {
        return superkræft;
    }
    public String getVirkelignavn() {
        return virkelignavn;
    }
    public int getOprindelsesår() {
        return oprindelsesår;
    }
    public boolean getErmenneske() {
        return ermenneske;
    }
    public double getStyrke(){
        return styrke;
    }
    public String toString(){
        return getSuperHeltNavn() + getSuperkræft() + getVirkelignavn() + getOprindelsesår() + getErmenneske() + getStyrke();
    }
}
