package xyz.fz.dubbo.service.impl;

import xyz.fz.dubbo.service.DemoService;

public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
