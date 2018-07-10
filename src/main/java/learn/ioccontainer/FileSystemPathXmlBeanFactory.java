package learn.ioccontainer;

/**
 * TODO(描述这个类的作用) <br/>
 *
 * @author qinhd
 * @version 1.0
 * @date 2018/7/9 18:55
 * @since JDK 1.8+
 */
public class FileSystemPathXmlBeanFactory extends XmlBeanFactory{
    public FileSystemPathXmlBeanFactory(String xmlFile) {
            super(new FileSystemPathXmlClassResource(xmlFile));
    }
}
