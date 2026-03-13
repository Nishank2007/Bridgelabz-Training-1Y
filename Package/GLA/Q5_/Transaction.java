package com.GLA.Q5_;

import com.GLA.Q5_.Book;
import com.GLA.Q5_.Member;
public class Transaction {

        public void issueBook(Book b, Member m){
            System.out.println(m.name + " issued book " + b.title);
        }
    }

