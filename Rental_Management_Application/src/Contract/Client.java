/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Contract;

/**
 *
 * @author Duy
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContractBuilder permanentBuilder = new PermanentContractBuilder();
        Contract permanentContract = permanentBuilder
            .buildContractID("PC1")
            .buildPropertyID("P001")
            .buildTenantID("T001")
            .buildRentAmount(1200)
            .signContract();
        
        System.out.println(permanentContract);

    
        ContractBuilder longTermBuilder = new LongTermContractBuilder();
        Contract longTermContract = longTermBuilder
            .buildContractID("LC1")
            .buildPropertyID("P002")
            .buildTenantID("T002")
            .buildRentAmount(1500)
            .signContract();
        
        System.out.println(longTermContract);

        
        ContractBuilder shortTermBuilder = new ShortTermContractBuilder();
        Contract shortTermContract = shortTermBuilder
            .buildContractID("SC1")
            .buildPropertyID("P003")
            .buildTenantID("T003")
            .buildRentAmount(800)
            .signContract();
        
        System.out.println(shortTermContract);

    }
    
}
