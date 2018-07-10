package learn.ioccontainer;

/**
 * <br/>
 *
 * @author qinhd
 * @version 1.0
 * @date 2018/7/5 21:45
 * @since JDK 1.8+
 */
public class XmlBeanFactory extends DefaultBeanFactory {
    public XmlBeanFactory(ClassResource resource) {
        super(resource);
    }

    public XmlBeanFactory(String xmlFile) {
        super(new DefaultXmlClassResource(xmlFile));
    }

}
