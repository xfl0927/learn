package org.xfl.reflect.proxy.staticProxy;/** * @program: learn * @description: 静态代理执行类 * @author: xfl * @create: 2018-07-16 15:55 **/public class StaticProxyMain {    public static void main(String[] args){        Producer producer = new Producer();        Movie movie = new Proxy(producer);        movie.play();    }}