public class LogLevels {

    public static String message(String logLine) {
        String messageLog = new String();
        if (logLine.contains("ERROR")){
            messageLog = logLine.substring(9).strip();
        } else if (logLine.contains("WARNING")) {
            messageLog = logLine.substring(11).strip();
        } else if (logLine.contains("[INFO]: ")){
            messageLog = logLine.substring(8).strip();
        }
        return messageLog;
    }

    public static String logLevel(String logLine) {
        String levelLog = new String();
       if (logLine.contains("ERROR")){
           levelLog = "error";
        } else if (logLine.contains("WARNING")){
           levelLog = "warning";
        } else if (logLine.contains("INFO")){
           levelLog = "info";
        }
        return levelLog;
    }

    public static String reformat(String logLine) {
        String formattedMsg = new String();
        if (logLine.contains("ERROR")){
            formattedMsg = logLine.substring(9).strip() + " (error)";
        } else if (logLine.contains("WARNING")){
            formattedMsg = logLine.substring(11).strip() + " (warning)";
        } else if (logLine.contains("[INFO]: ")){
            formattedMsg = logLine.substring(8).strip() + " (info)";
        }
        return formattedMsg;
    }
}
