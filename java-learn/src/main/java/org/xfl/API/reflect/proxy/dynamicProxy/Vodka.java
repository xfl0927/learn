package org.xfl.API.reflect.proxy.dynamicProxy;/** * @program: learn * @description: 伏特加生产者 * @author: xfl * @create: 2018-07-16 16:30 **/public class Vodka implements Wine {    @Override    public void sell() {        System.out.println("Vodka开卖了，赶快来品尝战斗的滋味！");    }    @Override    public void high() {        System.out.println("Vodka:一口就嗨，嗨不停");    }}