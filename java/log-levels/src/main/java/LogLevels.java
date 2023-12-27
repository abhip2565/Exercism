public class LogLevels {
    
    public static String message(String logLine) {
       String msg=logLine.substring(logLine.indexOf(":")+1,logLine.length());
       return msg.trim();

    }

    public static String logLevel(String logLine) {
        String msg=logLine.contains("ERROR")?"error":logLine.contains("WARNING")?"warning":"info";
        return msg;
    }

    public static String reformat(String logLine) {
        String msg=message(logLine);
        String level=logLevel(logLine);
        return msg+" ("+level+")";
    }
}
