package learn.ioccontainer;

/**
 * Bean工厂：工厂模式<br/>
 *
 * @author qinhd
 * @version 1.0
 * @date 2018/7/5 21:33
 * @since JDK 1.8+
 */
public interface BeanFactory {
    /**
     * @param cls 类对象
     * @param <T> 泛型类
     * @return 对象
     */
    <T> T getBean(Class<T> cls);

    /**
     * @param className 类名全路径
     * @return 类对象
     */
    Object getBeanByClsName(String className);

    /**
     * 根据bean名称获取对象
     * @param beanName
     * @return
     */
    Object getBeanByName(String beanName);
}
