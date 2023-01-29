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
public class receptionist extends Worker{
    

    @Override
    public String getName() {
        return name; 
    }

    @Override
    public String getemail() {
         return email; 
    }

    @Override
    public String getpassword() {
        return password; 
    }

    @Override
    public String getaddress() {
        return address; 
    }

    @Override
    public String getstatus() {
       return status; 
    }

    @Override
    public String getjobtitle() {
        return jobtitle; 
    }

    @Override
    public int getSalary() {
         return salary;
    }

    @Override
    public void setName(String Name) {
                    name=Name; 
    }

    @Override
    public void setemail(String Email) {
       email=Email;
    }

    @Override
    public void setpassword(String Password) {
        password=Password;
    }

    @Override
    public void setaddress(String Address) {
            address=Address;
    }

    @Override
    public void setstatus() {
          status="true";
    }

    @Override
    public void setjobtitle() {
         jobtitle="receptionist";
    }

    @Override
    public void setSalary() {

    salary=5000;
    }
}
