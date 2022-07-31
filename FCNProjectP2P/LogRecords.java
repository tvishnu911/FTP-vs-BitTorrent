import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Formatter;
import java.util.logging.*;
import java.io.IOException;
import java.util.Date;

public class LogRecords {

    Logger log;
    FileHandler file;

    LogRecords(String peerId) throws IOException {
        log = Logger.getLogger(peerId);
        file = new FileHandler("./" + peerId + "/logs_" + peerId + ".log");
        file.setFormatter(new MyNewFormatter());
        log.addHandler(file);

    }

    public void logInfo(String message) {
        log.log(new LogRecord(Level.INFO, message));
    }

    public void logError(String message) {
        log.log(new LogRecord(Level.SEVERE, message));
    }

    class MyNewFormatter extends Formatter {

        @Override
        public String format(LogRecord logRecord) {
            DateFormat simple
                    = new SimpleDateFormat(
                    "dd MMM yyyy HH:mm:ss:SSS Z");

            Date result = new Date(logRecord.getMillis());


            return result + " >>>> " + logRecord.getMessage() + "\n";
        }

    }

}

