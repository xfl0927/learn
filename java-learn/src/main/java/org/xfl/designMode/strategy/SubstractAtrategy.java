package org.xfl.designMode.strategy;/** * @program: learn * @description: * @author: xfl * @create: 2018-12-18 10:15 **/public class SubstractAtrategy implements Strategy {    @Override    public Integer compute(Integer a, Integer b) {        return a - b;    }}