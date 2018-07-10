package learn.ioccontainer;

/**
 * 类路径下加载xml文件的beanFactory <br/>
 *
 * @author qinhd
 * @version 1.0
 * @date 2018/7/6 1:04
 * @since JDK 1.8+
 */
public class ClassPathXmlBeanFactory extends XmlBeanFactory{

    public ClassPathXmlBeanFactory(String xmlFileName) {
        super(new ClassPathXmlClassResource(xmlFileName));
    }
}
