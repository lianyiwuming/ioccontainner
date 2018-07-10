package learn.ioccontainer;

/**
 * TODO(描述这个类的作用) <br/>
 *
 * @author qinhd
 * @version 1.0
 * @date 2018/7/6 0:23
 * @since JDK 1.8+
 */
public class IlleagelXmlException extends IlleagelResourceException {
    public IlleagelXmlException() {
    }

    public IlleagelXmlException(String message) {
        super(message);
    }

    public IlleagelXmlException(String message, Throwable cause) {
        super(message, cause);
    }

    public IlleagelXmlException(Throwable cause) {
        super(cause);
    }

    public IlleagelXmlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
