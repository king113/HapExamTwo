package job;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.hand.hap.job.AbstractJob;
import org.quartz.JobExecutionContext;

/**
 * Created by 凯哥 on 2017/5/2.
 * Quartz定时调度器 job接口小测试
 */
public class HelloJob extends AbstractJob{

    @Override
    public void safeExecute(JobExecutionContext jobExecutionContext) throws Exception {
        System.out.println("Hello Word");
    }
}
