package learn.ioccontainer;

import java.util.List;
import java.util.Map;

/**
 * TODO(描述这个类的作用) <br/>
 *
 * @author qinhd
 * @version 1.0
 * @date 2018/7/5 21:42
 * @since JDK 1.8+
 */
public abstract class AbstractBeanFactory implements BeanFactory{

    private List<BeanDefination> beanDefinations;

    /**
     * key:id
     * Object:具体的对象
     */
    private Map<String,Object> beans;

    public AbstractBeanFactory(ClassResource resource) {
        beanDefinations = resource.analysis();
        beans = loadBeans(beanDefinations);
    }

    public abstract Map<String,Object> loadBeans(List<BeanDefination> beanDefinations);



}
