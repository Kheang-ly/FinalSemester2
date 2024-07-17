/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisplayCustomers;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Customers {
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the customers
     */
    public static List<Customers> getCustomers() {
        return customers;
    }

    /**
     * @param aCustomers the customers to set
     */
    public static void setCustomers(List<Customers> aCustomers) {
        customers = aCustomers;
    }
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private static List<Customers> customers=new ArrayList<>();
    public Customers(int id,String firstName,String lastName,String phone)
    {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.phone=phone;
        customers.add(this);
    }
    public static void initializeCustomer()
    {
        try
        {
            String sql="SELECT * FROM Customers";
            Statement s=DatabaseConnection.getDataCon().createStatement();
            ResultSet r=s.executeQuery(sql);
            while(r.next())
            {
                int cus_id=r.getInt(1);
                String l_name=r.getString(2);
                String f_name=r.getString(3);
                String ph=r.getString(4);
                Customers cs=new Customers(cus_id,l_name,f_name,ph);
            }
            r.close();
            s.close();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
}
