package com.GLA.Q5_;

public class Book {
        public String title;
        public String author;

        public Book(String title,String author){
            this.title = title;
            this.author = author;
        }

        public void display(){
            System.out.println("Book: "+title+" Author: "+author);
        }
    }

