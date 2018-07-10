import learn.ioccontainer.BeanFactory;
import learn.ioccontainer.ClassPathXmlBeanFactory;
import learn.ioccontainer.FileSystemPathXmlBeanFactory;
import learn.ioccontainer.XmlBeanFactory;
import org.junit.Test;

/**
 * TODO(描述这个类的作用) <br/>
 *
 * @author qinhd
 * @version 1.0
 * @date 2018/7/5 21:48
 * @since JDK 1.8+
 */
public class BeanFactoryTest {

    @Test
    public void test(){
        String xmlFile = "";
        BeanFactory beanFactory = new XmlBeanFactory(xmlFile);
        beanFactory.getBeanByName("sd");
    }

    @Test
    public void test1(){
        String xmlFile = "";
        BeanFactory beanFactory = new ClassPathXmlBeanFactory(xmlFile);
        beanFactory.getBeanByName("sd");
    }

    @Test
    public void test2(){
        String xmlFile = "";
        BeanFactory beanFactory = new FileSystemPathXmlBeanFactory(xmlFile);
        beanFactory.getBeanByName("sd");
    }
}
