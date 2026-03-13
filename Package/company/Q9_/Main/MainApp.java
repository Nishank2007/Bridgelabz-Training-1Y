package com.company.Q9_.Main;

import com.company.Q9_.Analytics.sales.SalesReport;
import com.company.Q9_.Analytics.hr.EmployeeReport;

public class MainApp {

    public static void main(String[] args) {

        SalesReport s = new SalesReport();
        EmployeeReport e = new EmployeeReport();

        s.showSales();
        e.showHR();
    }
}