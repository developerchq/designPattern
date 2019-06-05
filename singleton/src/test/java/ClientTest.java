import net.sourceforge.groboutils.junit.v1.MultiThreadedTestRunner;
import net.sourceforge.groboutils.junit.v1.TestRunnable;
import org.junit.Test;

/**
 * designpattern
 * 多线程并发测试
 * Created by AB052409 on 2019/5/26.
 */
public class ClientTest {

    @Test
    public void MultiRequestsTest() {
        // 构造一个Runner
        TestRunnable runner = new TestRunnable() {
            @Override
            public void runTest() throws Throwable {
                // 测试内容
//                LanHanSingleton lanHanSingleton = LanHanSingleton.getInstance();
//                System.out.println(lanHanSingleton);

                EHanSingleton eHanSingleton = EHanSingleton.getInstance();
                System.out.println(eHanSingleton);
            }
        };
        int runnerCount = 3000;
        //Rnner数组，想当于并发多少个。
        TestRunnable[] trs = new TestRunnable[runnerCount];
        for (int i = 0; i < runnerCount; i++) {
            trs[i] = runner;
        }
        // 用于执行多线程测试用例的Runner，将前面定义的单个Runner组成的数组传入
        MultiThreadedTestRunner mttr = new MultiThreadedTestRunner(trs);
        try {
            // 开发并发执行数组里定义的内容
            mttr.runTestRunnables();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
