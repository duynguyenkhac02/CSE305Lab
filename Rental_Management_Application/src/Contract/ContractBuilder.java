/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Contract;

/**
 *
 * @author Duy
 */
public interface ContractBuilder {
    ContractBuilder buildContractID(String ContractID);
    ContractBuilder buildPropertyID(String PropertyID);
    ContractBuilder buildTenantID(String TenantID);
    ContractBuilder buildRentAmount(double RentAmount);
    Contract signContract();
}
