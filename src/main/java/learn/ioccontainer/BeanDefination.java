package learn.ioccontainer;

import java.util.Map;

/**
 * bean 定义 <br/>
 *
 * @author qinhd
 * @version 1.0
 * @date 2018/7/5 22:04
 * @since JDK 1.8+
 */
public class BeanDefination {
    String beanId;
    String clsName;
    Map<String,BeanDefination> beanRef;

    public String getBeanId() {
        return beanId;
    }

    public void setBeanId(String beanId) {
        this.beanId = beanId;
    }

    public String getClsName() {
        return clsName;
    }

    public void setClsName(String clsName) {
        this.clsName = clsName;
    }

    public Map<String, BeanDefination> getBeanRef() {
        return beanRef;
    }

    public void setBeanRef(Map<String, BeanDefination> beanRef) {
        this.beanRef = beanRef;
    }
}
