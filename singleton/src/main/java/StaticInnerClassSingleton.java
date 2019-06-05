/**
 * designpattern
 * Created by AB052409 on 2019/5/26.
 */
public class StaticInnerClassSingleton {

    private static class inner{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return inner.staticInnerClassSingleton;
    }

    private StaticInnerClassSingleton(){
        System.out.println("初始化...");
    }

    public void sayHello(){

        System.out.print("打印操作"+Math.random());
    }

    public static void main(String[] args) {
        StaticInnerClassSingleton template = StaticInnerClassSingleton.getInstance();

        template.sayHello();


        StaticInnerClassSingleton template2 = StaticInnerClassSingleton.getInstance();

        template2.sayHello();
    }
}
