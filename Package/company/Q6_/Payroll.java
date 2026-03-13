package com.company.Q6_;

import com.company.Q6_.Employee;

    public class Payroll {

        public void calculateBonus(Employee e){
            double bonus = e.getSalary()*0.10;
            e.setSalary(e.getSalary()+bonus);
        }
    }

