/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Tables {

    public static void main(String[] args) {
        try {
            String usertable = "Create table user(Id int AUTO_INCREMENT primary key,Name varchar(50),address varchar(200),DOB varchar(10),phone_num varchar(10),Mail varchar(200),password varchar(200),status varchar(20),UNIQUE (Mail))";
            String adminDetails = "insert into user values('admin','kelaniya','123456789','1234567890','admin@gmail.com','admin1','true')";
            String categoryTable = "Create table category (id int AUTO_INCREMENT primary key,Name varchar(200)) ";
            String productTable = "Create table product (id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200))";
            String Billtable = "Create table bill (id int AUTO_INCREMENT primary key,Name varchar(200),Mobil_number varchar(11),email varchar(200),date varchar(15),total varchar(100),createby varchar(200)) ";

            DBoperation.setDataOrDelete(Billtable, "bill table created successfuly");
            DBoperation.setDataOrDelete(productTable, "product table created successfuly");
            DBoperation.setDataOrDelete(categoryTable, "category table created successfuly");
            DBoperation.setDataOrDelete(usertable, "user table created successfuly");
            DBoperation.setDataOrDelete(adminDetails, "Admin Details Added Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
