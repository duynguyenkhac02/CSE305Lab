/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Document_Management;

/**
 *
 * @author Duy
 */
public class Client {
    public static void main(String[] args) {
        DocBuilder normaldoc = new NormalDocBuilder();
        Document normalDocument = (Document) normaldoc
                .setDocumentName("Property inspection report 1")
                .setDocumentType("Normal")
                .setContent("")
                .setExtension(".txt")
                .setEncryption(false);
        
       System.out.println(normalDocument);
        
       DocBuilder confinedoc = new ConfidentialDocBuilder();
        Document confineDocument = (Document) confinedoc
                .setDocumentName("Lease agreements 1")
                .setDocumentType("Confidential")
                .setContent("")
                .setExtension(".zip")
                .setEncryption(true);
        
       System.out.println(confineDocument);
    }

}