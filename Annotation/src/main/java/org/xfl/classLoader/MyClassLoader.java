package org.xfl.classLoader;import java.io.FileInputStream;import java.lang.reflect.InvocationTargetException;import java.lang.reflect.Method;/** * @program: learn * @description: 自定义ClassLoader * @author: xfl * @create: 2018-07-17 10:29 **/public class MyClassLoader extends ClassLoader {    private String classPath;    public MyClassLoader(String classPath) {        this.classPath = classPath;    }    private byte[] loadByte(String name) throws Exception{        name = name.replaceAll("\\.","/");        String path = classPath + "/" + name + ".class";        System.out.println(path);        FileInputStream fi = new FileInputStream(path);        int len = fi.available();        byte[] data = new byte[len];        fi.read(data);        fi.close();        return data;    }    @Override    protected Class<?> findClass(String name) throws ClassCastException{        try {            byte[] data = loadByte(name);            return defineClass(name, data, 0, data.length);        } catch (Exception e) {            e.printStackTrace();            throw new ClassCastException();        }    }    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {        MyClassLoader classLoader = new MyClassLoader("/Users/huangwenlong");        System.out.println("自定义类加载器："+classLoader.toString());        System.out.println("自定义类加载器父加载器："+classLoader.getParent().toString());        Class clazz = classLoader.findClass("Test");        Object object = clazz.newInstance();        Method method = clazz.getDeclaredMethod("display",String.class);        method.invoke(object,"xfl");        System.out.println(object);    }}