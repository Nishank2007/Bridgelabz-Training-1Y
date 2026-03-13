package com.GLA.Q5_;

    import com.GLA.Q5_.Book.*;
import com.GLA.Q5_.Member.*;
import com.GLA.Q5_.Transaction.*;

    public class MainApp {

        public static void main(String[] args) {

            Book b = new Book("Java Programming","James Gosling");
            Member m = new Member("Amit");

            Transaction t = new Transaction();

            b.display();
            m.display();
            t.issueBook(b,m);
        }
    }

