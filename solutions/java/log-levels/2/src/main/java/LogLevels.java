public class LogLevels {

    public static final int ERROR_IDX = 9;
    public static final int WARNING_IDX = 11;
    public static final int INFO_IDX = 8;
    

    public static String message(String logLine) {
        String messageLog = new String();
        if (logLine.contains("ERROR")){
            messageLog = logLine.substring(ERROR_IDX).strip();
        } else if (logLine.contains("WARNING")) {
            messageLog = logLine.substring(WARNING_IDX).strip();
        } else if (logLine.contains("[INFO]: ")){
            messageLog = logLine.substring(INFO_IDX).strip();
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
            formattedMsg = logLine.substring(ERROR_IDX).strip() + " (error)";
        } else if (logLine.contains("WARNING")){
            formattedMsg = logLine.substring(WARNING_IDX).strip() + " (warning)";
        } else if (logLine.contains("[INFO]: ")){
            formattedMsg = logLine.substring(INFO_IDX).strip() + " (info)";
        }
        return formattedMsg;
    }
}
