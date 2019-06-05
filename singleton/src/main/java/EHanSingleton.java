/**
 * designpattern
 * 饿汉单例
 * 缺点：类加载时就实例化 容易造成内存浪费
 * 优点：基于classloader机制 避免了多线程同步问题（不需要加锁）执行效率高
 * Created by AB052409 on 2019/5/26.
 */
public class EHanSingleton {
    private static EHanSingleton enumSingleton = new EHanSingleton();

    private EHanSingleton(){

    }

    public static EHanSingleton getInstance(){
        return enumSingleton;
    }

    public void sayHello(){
        System.out.println("say hello method"+Math.random());
    }
}
