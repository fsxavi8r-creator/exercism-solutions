public class LogLine {

    private String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        // not that it isn't uppercase already, but...why not?
        String logType = logLine.substring(1, 4).toUpperCase();
        return switch (logType) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        String subStrLog = this.logLine.substring(7);
        LogLevel logLvlType = this.getLogLevel();
        return logLvlType.getLogCode() + ":" + String.valueOf(subStrLog);
    }
}
