/**
 * designpattern
 * Created by AB052409 on 2019/5/26.
 */

/**
 * 单例设计模式：枚举单例
 * EnumSingleton本质也是类
 */
public enum EnumSingleton {

    INSTANCE;
    private EnumSingleton(){
        System.out.println("初始化...");
    }

    public  void sayHello(){

        System.out.println("枚举单例方法"+Math.random());
    }


}
