package learn.ioccontainer;

import java.util.Collections;
import java.util.List;

/**
 * TODO(描述这个类的作用) <br/>
 *
 * @author qinhd
 * @version 1.0
 * @date 2018/7/6 0:10
 * @since JDK 1.8+
 */
public abstract class AbstractClassResource  implements ClassResource{
    @Override
    public List<BeanDefination> analysis() {
        return Collections.EMPTY_LIST;
    }

    protected abstract void validResource() throws IlleagelResourceException;
}
