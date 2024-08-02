
package com.mycompany.project;

public class order extends Product {
    private int id;
    private String data;
    Person person = new Person();
    Product product =new Product();
  public boolean is_paid (){
  if(product.getPrice()==0){
  return false;
  }
  else{
  return true;
  }
  }
    @Override
    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public void setData(String data) {
        this.data = data;
    }

 
    
    
}
