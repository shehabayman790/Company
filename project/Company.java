
package com.mycompany.project;
import java.util.ArrayList;
import java.util.List;
public class Company {
  private List<Person> persons ;
  private List<Product> products ;
  private List<order> Orders ;
  public Company(){
  Orders= new ArrayList<>();
  persons= new ArrayList<>();
  products= new ArrayList<>();
  }

   
  void add_product(Product product){
  product.getId();
  product.getName();
  product.getPrice();

  }
  void add_person(Person person){
      person.getGender();
      person.getId();
      person.getName();
      person.getPhone();
  }
  void add_order(order Order){
      Order.getData();
      Order.getId();
     
  }

    
     
     
    public void removeProdect(int id){
          for (int i = 0; products.size() >= i; i++) {
            if (products.get(i).getName().equals(products))
                products.remove(products.get(i));
        }
    }
       
   public  void RemovePerson(int id){
          for (int i = 0; persons.size() >= i; i++) {
            if (persons.get(i).getName().equals(persons))
                persons.remove(persons.get(i));
           
        }
         }
 public void removeorder(int id){
          for (int i = 0; Orders.size() >= i; i++) {
            if (Orders.get(i).getName().equals(Orders)){
                Orders.remove(Orders.get(i));
            }
        }
         }
  void print_product_info(int id){
        for (Product a:products) {
            if (id==(a.getId())) {
           a.getId();
           a.getName();
           a.getPrice();
         }
        }
     }
  void print_order_info(int id){
        for (order a:Orders) {
            if (id==(a.getId())) {
           a.getId();
           a.getName();
           a.getPrice();
         }
        }
     }
  void print_person_info(int id){
        for (Person a:persons) {
            if (id==(a.getId())) {
           a.getId();
           a.getName();
           a.getPhone();
           a.getGender();
         }
        }
     }
  
     }
   
       
       
   
  
           
 

 


    


        
  

