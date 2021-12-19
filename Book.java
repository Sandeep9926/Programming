package com.sapient.linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class Book {
    private String name;
    private String authorname;

    public Book(String name, String authorname) {
        super();
        this.name = name;
        this.authorname = authorname;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    @Override
    public String toString()
    {
        return name+"\t\t"+authorname;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Book> l = new LinkedList<Book>();
        System.out.println("Enter Book name");
        String name = sc.next();
        System.out.println("Enter Authorname");
        String authorname = sc.next();
        l.add(new Book(name, authorname));

        for (int i = 0; i < l.size(); i++) {

            System.out.println("Book name is :"+l.get(i).getName());
            System.out.println("Book Authorname is :"+l.get(i).getAuthorname());
        }


    }
}