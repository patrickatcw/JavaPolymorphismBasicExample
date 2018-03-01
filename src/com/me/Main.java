package com.me;
//the ability of an object to take on many forms.
// The most common use of polymorphism in OOP occurs
// when a parent class reference is used to refer to a
// child class object
//no separate class files, everything is in 1 file

//working with movies here.....

//step 1 creating the super class Movie
class Movie{

    //step 2 creating fields
    private String name;

    //step 3 create constructor with purpose to set value for field
    public Movie(String name) {
        this.name = name;
    }

    //step 4 create another method for plot of movie
    public String plot(){
        return "No plot here";
    }

}

//step 5 create more classes that will inherit from base Movie class
class Jaws extends Movie{

    //step 6 create constructor, a little different structure here
    public Jaws() {
        super("Jaws");
    }

    //step 7 plot method, this will override plot method in movie class
    public String plot(){
        return "A great white shark dealing with an existential crises";

    }

}

//step 8 another class
class IndependenceDay extends Movie{

    //step 9 make your own constructor
    public IndependenceDay(){
        super("Independence Day");
    }

    //step 10 doing an override through menu
    @Override
    public String plot() {
        //return super.plot();, changed to...
        return "Randy Quad is a drunk pilot";

    }
}

//step 11 another class
class MaizeRunner extends Movie{

    //step 12 constructor
    public MaizeRunner() {
        super("Maize Runner");
    }

    //step 13 override
    @Override
    public String plot() {
        return "Kids on peyote thing they live in a fantasy land";
    }
}





public class Main {

    public static void main(String[] args) {

    }

}
