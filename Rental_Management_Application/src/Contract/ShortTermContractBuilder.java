/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contract;

/**
 *
 * @author Duy
 */
public class ShortTermContractBuilder implements ContractBuilder {
    private Contract contract;

    public ShortTermContractBuilder() {
        this.contract = new Contract();
    }

    @Override
    public ContractBuilder buildContractID(String contractID) {
        contract.setContractID(contractID);
        return this;
    }

    @Override
    public ContractBuilder buildPropertyID(String propertyID) {
        contract.setPropertyID(propertyID);
        return this;
    }

    @Override
    public ContractBuilder buildTenantID(String tenantID) {
        contract.setTenantID(tenantID);
        return this;
    }

    @Override
    public ContractBuilder buildRentAmount(double rentAmount) {
        contract.setRentAmount(rentAmount);
        return this;
    }

    @Override
    public Contract signContract() {
        return contract;
    }
}
