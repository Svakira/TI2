package exceptions;

public class NoCountryFound extends Exception{
    public NoCountryFound(){
        super("The country entered does not exist in the database, you have to register a country first");
    }
}
