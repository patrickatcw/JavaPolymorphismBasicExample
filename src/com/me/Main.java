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





public class Main {

    public static void main(String[] args) {

    }

}
