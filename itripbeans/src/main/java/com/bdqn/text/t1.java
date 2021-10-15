package com.bdqn.text;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;

import java.io.FileWriter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class t1 {
    public static void main(String[] args) throws Exception {

        t2();
    }

    public static  void t2() throws Exception {
        Map obj = new HashMap();

        List<UserEntity> list = new ArrayList<UserEntity>();
        for (int i=0;i<=10;i++){
            UserEntity userEntity = new UserEntity();
            userEntity.setId(i);
            userEntity.setName("名字"+i);
            list.add(userEntity);
        }
        obj.put("li",list);
        Configuration cfg = new Configuration();
        cfg.setDefaultEncoding("utf-8");
        cfg.setDirectoryForTemplateLoading(new File("D:\\itripbackend\\itripbeans\\src\\main\\resources"));
        Template template = cfg.getTemplate("b.flt");

        template.process(obj,new FileWriter("D://a.html"));

        System.out.println("处理完成");
    }

    public static  void t1() throws Exception {
        Map obj = new HashMap();
        obj.put("name","自动");
        Configuration cfg = new Configuration();
        cfg.setDefaultEncoding("utf-8");
        cfg.setDirectoryForTemplateLoading(new File("D:\\itripbackend\\itripbeans\\src\\main\\resources"));
        Template template = cfg.getTemplate("a.flt");

        template.process(obj,new FileWriter("D://a.txt"));

        System.out.println("处理完成");
    }
}
