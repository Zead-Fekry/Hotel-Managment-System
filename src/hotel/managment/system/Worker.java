package hotel.managment.system;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zead Fekry
 */
public abstract class Worker {
    public String name;
    public String email;
     public  String password;
      public String address;
      public String status;
      public String jobtitle;
    public  int salary;
      abstract public String getName();
      abstract public String getemail();
      abstract public String getpassword();
       abstract public String getaddress();
     abstract  public String getstatus();
     abstract  public String getjobtitle();
     abstract  public int getSalary();
       
     abstract  public void setName(String name);
     abstract  public void setemail(String email);
     abstract  public void setpassword(String password);
    abstract   public void setaddress(String address);
     abstract  public void setstatus();
     abstract  public void setjobtitle();
     abstract  public void setSalary();
       

    
}
