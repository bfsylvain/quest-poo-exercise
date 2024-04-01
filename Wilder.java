public class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }
    public String getFirstname() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        String myNameIsVF = "Je m'appelle " + this.getFirstname();

        if(aware) {
            return myNameIsVF + " et je suis aware";
        } else {
            return myNameIsVF + " et je ne suis pas aware";
        }
    }
}