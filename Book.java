package com.sapient.map;


import java.util.*;

public class Book
{
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
        Map<String,String> s=new HashMap<String,String>();
        System.out.println("Enter Book name");
        String name = sc.next();
        System.out.println("Enter Authorname");
        String authorname = sc.next();
        s.put(name, authorname);

        System.out.println("Name\t\tAuthorname");
        System.out.println("---------------------------------------");
        Set<Map.Entry<String,String>> entry=s.entrySet();
        Iterator<Map.Entry<String,String>> itr=entry.iterator();
        while(itr.hasNext())
        {
            Map.Entry<String,String> e=itr.next();
            System.out.println(e.getKey()+"\t\t"+e.getValue());
        }



    }
}
