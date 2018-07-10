package learn.ioccontainer;

/**
 * TODO(描述这个类的作用) <br/>
 *
 * @author qinhd
 * @version 1.0
 * @date 2018/7/6 0:35
 * @since JDK 1.8+
 */
public class IlleagelResourceException extends RuntimeException {
    public IlleagelResourceException() {
    }

    public IlleagelResourceException(String message) {
        super(message);
    }

    public IlleagelResourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public IlleagelResourceException(Throwable cause) {
        super(cause);
    }

    public IlleagelResourceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
