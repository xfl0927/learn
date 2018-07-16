package org.xfl.classLoader;import java.net.URISyntaxException;import java.net.URL;import java.util.Properties;import java.util.Set;/** * @program: learn * @description: Java ClassLoader Learn Note * @author: xfl * @create: 2018-07-16 18:03 **/public class ClassLoaderLearn {    public static void main (String[] args) throws URISyntaxException {        /**         * 获取系统类加载器         */        ClassLoader loader = ClassLoader.getSystemClassLoader();        while (loader != null){            loader = loader.getParent();            System.out.println(loader);        }        /**         * 获取BootStrapLoader加载路径         */        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();        for (int i = 0 ; i < urls.length ; i++){            System.out.println(urls[i].toExternalForm());        }        /**         * 获取系统Properties名称列表         */        Properties properties =  System.getProperties();        Set<String>  propertyNames  = properties.stringPropertyNames();        for (String pro:propertyNames){            System.out.println(pro +":"+ System.getProperty(pro));            System.out.println("_________split__________");        }    }}