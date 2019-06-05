/**
 * designpattern
 * Created by AB052409 on 2019/5/26.
 */
public class LanHanSingleton {
    private static LanHanSingleton lanHanSingleton;

    //去除直接new实例
    private LanHanSingleton(){

    }

    public static LanHanSingleton getInstance(){
        if (lanHanSingleton==null){
            lanHanSingleton = new LanHanSingleton();
        }

        return lanHanSingleton;
    }

    public void sayLoveMe(){
        System.out.println("say hello method random num:"+Math.random());
    }
}
