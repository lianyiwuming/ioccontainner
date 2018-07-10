package learn.ioccontainer;

/**
 * TODO(描述这个类的作用) <br/>
 *
 * @author qinhd
 * @version 1.0
 * @date 2018/7/9 18:57
 * @since JDK 1.8+
 */
public class FileSystemPathXmlClassResource extends DefaultXmlClassResource{
    public FileSystemPathXmlClassResource(String parthFileName) {
        super(parthFileName);
    }

    @Override
    public String buildFilePath(String parthFileName) {
        return null;
    }
}
