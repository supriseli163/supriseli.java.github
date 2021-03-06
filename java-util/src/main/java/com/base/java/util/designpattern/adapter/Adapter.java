package com.base.java.util.designpattern.adapter;

public class Adapter extends Adaptee implements Target {
    /**
     * 适配器模式的优点:
     *  1,更好的复用性:
     *      系统需要实现现有的类,而此类的接口不符合系统的需要,那么通过适配器模式就可以让这些功能得到更好的复用
     *
     *  2.更好的扩展性:
     *      在实现适配器功能的时候,可以调用自己开发的功能,从而自然地扩展系统的功能.
     *
     *
     * 适配器模式的缺点:
     *      1,过多地使用适配器,会让系统变得非常凌乱,不易整体进行把握.
     *      比如:明明看到调用的是A接口,其实内部被适配成了B接口的实现
     *          如果一个系统太多出现这种情况,无异于异常灾难,因此如果不是很有必要,可以不使用适配器,而是直接对系统进行重构
     *
     *
     * 缺省适配模式:
     *  缺省适配(Default Adapter)模式为一个接口提供缺省实现,这样子类型可以从这个缺省实现进行扩展,而不必从原有接口进行扩展
     *      作为适配器模式的一个特例,缺省是适配模式在java语言中有着特殊的应用.
     */
    @Override
    public void sampleOperation2() {

    }
}
