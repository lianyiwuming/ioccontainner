package learn.ioccontainer;

import java.util.List;
import java.util.Map;

/**
 * TODO(描述这个类的作用) <br/>
 *
 * @author qinhd
 * @version 1.0
 * @date 2018/7/5 22:30
 * @since JDK 1.8+
 */
public class DefaultBeanFactory extends AbstractBeanFactory {
    public DefaultBeanFactory(ClassResource resource) {
        super(resource);
    }

    @Override
    public final Map<String, Object> loadBeans(List<BeanDefination> beanDefinations) {
        return null;
    }

    @Override
    public final <T> T getBean(Class<T> cls) {
        return null;
    }

    @Override
    public final Object getBeanByClsName(String className) {
        return null;
    }

    @Override
    public final Object getBeanByName(String beanName) {
        return null;
    }

}
