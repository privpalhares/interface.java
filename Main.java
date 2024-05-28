public class Main {
    public static void main(String[] args) {
        System.Logger onConsoler = LoggerFactory.onConsoler();
        onConsoler.log(System.Logger.Level.DEBUG, "DEBUG");
        onConsoler.log(System.Logger.Level.WARNING, "WARNING");
        onConsoler.log(System.Logger.Level.ERROR, "ERROR");


        System.Logger onFiller = LoggerFactory.onFiller();
        onFiller.log(System.Logger.Level.DEBUG, "DEBUG");
        onFiller.log(System.Logger.Level.WARNING, "WARNING");
        onFiller.log(System.Logger.Level.ERROR, "ERROR");

    }
}
