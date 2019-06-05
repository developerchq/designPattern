/**
 * designpattern
 * 单例模式
 * 意图：保证一个类仅有一个实例 并提供一个getInstance访问点
 * 解决的问题：控制实例数量 节省内存资源
 * 关键代码：构造函数是私有的
 * Created by AB052409 on 2019/5/26.
 */
public class Client {

    public static void main(String[] args) {



        System.out.println("懒汉单例");
        LanHanSingleton lanHanSingleton = LanHanSingleton.getInstance();
        LanHanSingleton lanHanSingleton2 = LanHanSingleton.getInstance();

        System.out.println("lanHanSingleton = " + lanHanSingleton);
        System.out.println("lanHanSingleton2 = " + lanHanSingleton2);

        lanHanSingleton.sayLoveMe();
        lanHanSingleton2.sayLoveMe();


        System.out.println("饿汉单例");
        EHanSingleton eHanSingleton = EHanSingleton.getInstance();
        EHanSingleton eHanSingleton2 = EHanSingleton.getInstance();

        System.out.println("eHanSingleton = " + eHanSingleton);
        System.out.println("eHanSingleton2 = " + eHanSingleton2);
        eHanSingleton.sayHello();
        eHanSingleton2.sayHello();


        System.out.println("枚举单例");
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;

        System.out.println("enumSingleton2 == enumSingleton >>>>" + (enumSingleton2==enumSingleton));

        enumSingleton.sayHello();
        enumSingleton2.sayHello();


        System.out.println("静态内部类单例");
        StaticInnerClassSingleton s1 = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton s2 = StaticInnerClassSingleton.getInstance();

        System.out.println("s2 = " + s2);
        System.out.println("s1 = " + s1);
        s1.sayHello();
        s2.sayHello();

    }


}
