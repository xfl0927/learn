package org.xfl.objectInit;/** * @program: learn * @description: * @author: xfl * @create: 2018-09-19 15:02 **/public class hidden {    public static void main(String[] args)  {        Shape shape = new Circle();        System.out.println(shape.name);        shape.printType();        shape.printName();    }}class Shape {    public String name = "shape";    public Shape(){        System.out.println("shape constructor");    }    public void printType() {        System.out.println("this is shape");    }    public  void printName() {        System.out.println("shape");    }}class Circle extends Shape {    public String name = "circle";    public Circle() {        System.out.println("circle constructor");    }    @Override    public void printType() {        System.out.println("this is circle");    }    @Override    public void printName() {        System.out.println("circle");    }}