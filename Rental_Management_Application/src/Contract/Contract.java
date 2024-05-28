/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contract;

/**
 *
 * @author Duy
 */
public class Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;
    
    
    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public void setPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    public void setTenantID(String tenantID) {
        this.tenantID = tenantID;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    @Override
    public String toString() {
        return "Contract [ContractID: " + contractID + ", PropertyID: " + propertyID + 
               ", TenantID: " + tenantID + ", RentAmount: " + rentAmount + "]";
    }


}
