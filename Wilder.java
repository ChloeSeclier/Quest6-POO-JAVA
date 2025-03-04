public class Wilder{

    //Add attributs
    private String firstname;
    private boolean aware;

    // constructors
    public Wilder(String firstname, boolean aware){
        this.firstname=firstname;
        this.aware=aware;
    }

    //getter
    public String getFirstName(){
        return this.firstname;
    }    

    public boolean isAware(){
        return this.aware;
    }

    //setter
    public void setFirstName(String firstname){
        this.firstname=firstname;
    }

    public void setAware(boolean aware){
        this.aware=aware;
    }

    //methods
    public String whoAmI(){
        String reponse="";
        reponse = "Je m'appelle " + this.getFirstName();
        if(this.aware){
            reponse = reponse + " et je suis aware";
        } else {
            reponse = reponse + " et je ne suis pas aware";
        }
        return reponse;
    }
}