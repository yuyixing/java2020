package org.apache.dubbo.demo.provider;

import org.apache.dubbo.demo.DemoService;

/**
 * @author yuyx
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
