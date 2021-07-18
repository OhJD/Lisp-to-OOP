package com.company;

abstract class Pizza{
    abstract Pizza remA();
    abstract Pizza topAwC();
    abstract Pizza subAbC();
}
class Crust extends Pizza{
    Pizza remA(){
        return new Crust();
    }
    Pizza topAwC(){
        return new Crust();
    }
    Pizza subAbC(){
        return new Crust();
    }
}
class Cheese extends Pizza{
    Pizza p;
    Cheese(Pizza _p){
        p = _p;
    }
    Pizza remA(){
        return new Cheese(p.remA());
    }
    Pizza topAwC(){
        return new Cheese(p.topAwC());
    }
    Pizza subAbC(){
        return new Cheese(p.subAbC());
    }
}
class Olive extends Pizza{
    Pizza p;
    Olive(Pizza _p){
        p = _p;
    }
    Pizza remA(){
        return new Olive(p.remA());
    }
    Pizza topAwC(){
        return new Olive(p.topAwC());
    }
    Pizza subAbC(){
        return new Olive(p.subAbC());
    }
}
class Anchovy extends Pizza{
    Pizza p;
    Anchovy(Pizza _p){
        p = _p;
    }
    Pizza remA(){
        return p.remA();
    }
    Pizza topAwC(){
        return
                new Cheese(
                        new Anchovy(p.topAwC()));
    }
    Pizza subAbC(){
        return new Cheese(p.subAbC());
    }
}
class Sausage extends Pizza{
    Pizza p;
    Sausage(Pizza _p){
        p = _p;
    }
    Pizza remA(){
        return new Sausage(p.remA());
    }
    Pizza topAwC(){
        return new Sausage(p.topAwC());
    }
    Pizza subAbC(){
        return new Sausage(p.subAbC());
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here

    }
}
