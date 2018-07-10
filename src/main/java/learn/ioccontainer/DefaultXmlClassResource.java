package learn.ioccontainer;

import java.util.List;

/**
 * 默认实现： <br/>
 *
 * @author qinhd
 * @version 1.0
 * @date 2018/7/9 18:28
 * @since JDK 1.8+
 */
public class DefaultXmlClassResource  extends AbstarctXmlClassResource {
    public DefaultXmlClassResource(String parthFileName) {
        super(parthFileName);
    }

    @Override
    public String buildFilePath(String parthFileName) {
        //TODO 默认在classpath下寻找文件
        return null;
    }

}
