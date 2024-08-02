
package com.mycompany.project;

public class Person {
    private int id ;
    private String name;
    private String phone;
    private String gender;
    Person(){
          }
    
    public void printe_extra_info(){
    System.out.println(id);
    System.out.println(name);
    System.out.println(phone);
    System.out.println(gender);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

   
    
}
