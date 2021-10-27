public class Logger {

    private static Logger logger;

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    private Logger() {

    }

    protected int num = 1;

    public void log(String msg) {

        System.out.println("[" + num++ + "] " + msg);
    }

}