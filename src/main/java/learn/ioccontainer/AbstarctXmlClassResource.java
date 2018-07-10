package learn.ioccontainer;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO(描述这个类的作用) <br/>
 *
 * @author qinhd
 * @version 1.0
 * @date 2018/7/6 0:14
 * @since JDK 1.8+
 */
public abstract class AbstarctXmlClassResource extends AbstractClassResource implements FilePathBuilder {

    private String filePath;

    public AbstarctXmlClassResource(String parthFileName) {
        //解析文件路径
        this.filePath = buildFilePath(parthFileName);
    }

    @Override
    public abstract String buildFilePath(String parthFileName);

    @Override
    public List<BeanDefination> analysis() {
        List<BeanDefination> list = new ArrayList<>();
        //TODO 校验
        validResource();
        //TODO 解析文件，根据dom结构解析Bean定义
        return list;
    }

    /**
     * 校验xml文件合法性
     *
     * @throws IlleagelXmlException 文件不合法
     */
    @Override
    protected void validResource() throws IlleagelXmlException {

    }
}
