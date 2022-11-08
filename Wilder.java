public class Wilder {

    

    //attributes
    private String firstname;
    private boolean aware;

    // constructor
    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    // getters
    public String getFirstName() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    // setters
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    // methods
    public String whoAmI()  {
        return this.isAware() ? "Je m'appelle " + this.getFirstName() + " et je suis aware" : "Je m'appelle " + this.getFirstName() + " et je ne suis pas aware";
    }

}
