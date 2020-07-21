package org.apache.dubbo.demo;

/**
 * @author yuyx
 */
public interface DemoService {
    /**
     * 问好
     *
     * @param name 姓名
     * @return 问候语
     */
    String sayHello(String name);
}
