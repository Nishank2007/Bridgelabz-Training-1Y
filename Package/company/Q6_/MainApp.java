package com.company.Q6_;

import com.company.Q6_.Employee.*;
import com.company.Q6_.Payroll.*;

    public class MainApp {

        public static void main(String[] args) {

            Employee e = new Employee(1,"Ravi","IT",50000);

            Payroll p = new Payroll();
            p.calculateBonus(e);

            e.display();
        }
    }

