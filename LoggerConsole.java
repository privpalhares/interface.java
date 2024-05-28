package LoggerConsole;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class LoggerConsole implements System.Logger {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";

    @Override
    public String getName() {
        return "";
    }

    @Override
    public boolean isLoggable(Level level) {
        return true;
    }

    @Override
    public void log(Level level, ResourceBundle bundle, String msg, Throwable thrown) {
        return;
    }

    @Override
    public void log(Level level, ResourceBundle bundle, String format, Object... params) {
        return;
    }

    @Override
    public void log(Level level, String msg) {
        String color = "";

        switch (level) {
            case DEBUG:
                color = ANSI_GREEN;
                break;
            case WARNING:
                color = ANSI_YELLOW;
                break;
            case ERROR:
                color = ANSI_RED;
                break;
            default:
                break;
        }

        LocalDateTime dataAtual = LocalDateTime.now();
        DateTimeFormatter formartar = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(color + "[" + dataAtual.format(formartar) + "] " + msg + ANSI_RESET);
        System.Logger.super.log(level, msg);
    }

}
