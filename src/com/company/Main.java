package com.company;

abstract class Layer{}
class Base extends Layer{
    Object o;
    Base(Object _o){
        o = _o;
    }
}
class Slice extends Layer{
    Layer l;
    Slice(Layer _l){
        l = _l;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here

    }
}
