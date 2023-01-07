public class User {

    public String firstName;
    public String lastName;

    //SETTER
    public void setfirstName(String firstName){
        this.firstName = firstName.toUpperCase();
    }

    //GETTER
    public String getfirstName(){
        return firstName;
    }
}
