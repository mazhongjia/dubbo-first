package com.mzj.service.first;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        context.start();

        System.out.println("Dubbo provider start...");

        try {
            System.in.read();	// 此处目的是不让进程立即退出，按任意键退出
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

