package labs.starter.jmx.lab1;


import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

/**
 * @author developintelligence llc
 * @version 1.0
 */
public class CacheManagerAgent {

  public static void main(String[] args) throws Exception {
    MBeanServer server = ManagementFactory.getPlatformMBeanServer();
    ObjectName mBeanName = new ObjectName("examples.jmx:type=CacheManager");
    CacheManagerMBean mBean = new CacheManager();
    server.registerMBean(mBean, mBeanName);
    Thread.currentThread().join();
  }
}
