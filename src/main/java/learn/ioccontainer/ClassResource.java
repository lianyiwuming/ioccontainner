package learn.ioccontainer;

import java.util.List;

/**
 * 资源，可以在资源中解析class定义 <br/>
 *
 * @author qinhd
 * @version 1.0
 * @date 2018/7/5 22:08
 * @since JDK 1.8+
 */
public interface ClassResource {

    public List<BeanDefination> analysis() ;
}
