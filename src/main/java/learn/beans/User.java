package learn.beans;

/**
 * TODO(描述这个类的作用) <br/>
 *
 * @author qinhd
 * @version 1.0
 * @date 2018/7/18 10:55
 * @since JDK 1.8+
 */
public class User {
    private String name;
    private int age;

    public static String gj = "china";

    {
        name = "34";
    }

    static {
        gj = "asdfa";
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("hello hhhh");
    }
}
