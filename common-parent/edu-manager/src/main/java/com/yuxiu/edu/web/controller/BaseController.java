package com.yuxiu.edu.web.controller;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

//控制器基类的抽取
public abstract class BaseController<T> {
    public static String MANAGE_PAGE;
    public static String INFO_PAGE;
    public static String EDIT_PAGE;

    public static final String MANAGE = "manage";
    public static final String INFO = "info";
    public static final String EDIT = "edit";

    public BaseController(){
        //1.获取泛型的真实类型
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        //打印出type来看看具体是什么
        System.out.println("==========="+type);
        Class<?> modelClass = (Class<?>) type.getActualTypeArguments()[0];
        //看看这到底是什么
        System.out.println("==========="+modelClass);

        //2.获取模块名
        String moduleName = modelClass.getSimpleName().toLowerCase();

        //3.给静态页面赋值
        MANAGE_PAGE = moduleName + "/" + MANAGE;
        INFO_PAGE = moduleName + "/" + INFO;
        EDIT_PAGE = moduleName + "/" + EDIT;


    }

}
