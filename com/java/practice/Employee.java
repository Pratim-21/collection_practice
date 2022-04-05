package com.java.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Employee {
    private int eid;
    private int salary;
    private String ename;

    public Employee(int eid,  String ename, int salary) {
        this.eid=eid ;
        this.ename=ename ;
        this.salary=salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEmp_id() {
        return eid;
    }

    public String getEmp_name() {
        return ename;
    }

    public int getEmp_Salary() {
        return salary;
    }



    public String toString(){
        return eid +" "+ ename +"  "+salary ;
    }

    public static void main(String args[]) {
        Collection<Employee> c = new ArrayList<Employee>();

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);


        int ch;
        do {
            System.out.println("enter 1 to insert");
            System.out.println("enter 2 to display");
            System.out.println("enter 3 to search");
            System.out.println("enter 4 to delete");
            System.out.println("enter 5 to update");

            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("enter employee id");
                    int empid = sc.nextInt();
                    System.out.println("enter employee name");
                    String empname = sc2.nextLine();
                    System.out.println("enter employee salary");
                    int empsalary = sc.nextInt();
                    c.add(new Employee(empid, empname, empsalary));
                    break;
                case 2:
                    System.out.println("------------------------");
                    Iterator<Employee> i = c.iterator();
                        while(i.hasNext()) {
                            Employee e = i.next();
                            System.out.println(e);
                        }
                    break;

                case 3:
                    boolean found = false;

                    System.out.println("enter employee id you want to search");
                    empid=sc.nextInt();
                    System.out.println("------------------------");
                    i = c.iterator();
                    while(i.hasNext()) {
                        Employee e = i.next();
                        if(e.getEmp_id() == empid)
                        System.out.println(e);
                        found = true;
                    }
                    if(!found)
                        System.out.println("not found");
                    break;
                case 4:
                    found = false;

                    System.out.println("enter employee id you want to delete");
                    empid=sc.nextInt();
                    System.out.println("------------------------");
                    i = c.iterator();
                    while(i.hasNext()) {
                        Employee e = i.next();
                        if(e.getEmp_id() == empid)
                            i.remove();
                        found = true;
                    }
                    if(!found)
                        System.out.println("not found");
                    else
                        System.out.println("deleted");
                    break;
                case 5:
                    found = false;

                    System.out.println("enter employee id you want to update");
                    empid=sc.nextInt();

                    i = c.iterator();
                    while(i.hasNext()) {
                        Employee e = i.next();
                        if(e.getEmp_id() == empid) {
                            System.out.println("set new name");
                            empname = sc2.nextLine();
                            e.setEname(empname);
                            System.out.println("set new salary");
                            empsalary = sc.nextInt();
                            e.setSalary(empsalary);

                            found = true;
                        }
                            if(!found)
                                System.out.println("not updated");
                            else
                                System.out.println("updated successfully");
                            break;
                            }
            }
        } while (ch != 0);
    }
}


