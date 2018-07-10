package learn.ioccontainer;

/**
 * TODO(描述这个类的作用) <br/>
 *
 * @author qinhd
 * @version 1.0
 * @date 2018/7/6 0:40
 * @since JDK 1.8+
 */
public class IlleagelYmlException extends IlleagelResourceException {
    public IlleagelYmlException() {
    }

    public IlleagelYmlException(String message) {
        super(message);
    }

    public IlleagelYmlException(String message, Throwable cause) {
        super(message, cause);
    }

    public IlleagelYmlException(Throwable cause) {
        super(cause);
    }

    public IlleagelYmlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
