package learn.ioccontainer;

import java.util.List;

/**
 * TODO(描述这个类的作用) <br/>
 *
 * @author qinhd
 * @version 1.0
 * @date 2018/7/6 0:30
 * @since JDK 1.8+
 */
public class YmlClassResource extends  AbstractClassResource implements ClassResource{
    @Override
    public List<BeanDefination> analysis() {
        return super.analysis();
    }

    @Override
    protected void validResource() throws IlleagelYmlException {

    }
}
