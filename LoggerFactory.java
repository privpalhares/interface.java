import LoggerConsole.LoggerConsole;
import LoggerFile.LoggerFile;

public class LoggerFactory {

    public static System.Logger onConsoler() {
        return new LoggerConsole();
    }
    public static System.Logger onFiller() {
        return new LoggerFile();
    }

}
