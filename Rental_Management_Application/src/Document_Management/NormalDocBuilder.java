/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Document_Management;


public class NormalDocBuilder implements DocBuilder {
    private String name;
    private String type;
    private String content;
    private String extension;
    private boolean encryption;

   
    @Override
    public DocBuilder setDocumentName(String name) {
        this.name = name;
        return this;
    }

 
    @Override
    public DocBuilder setDocumentType(String type) {
        this.type = type;
        return this;
    }

   
    @Override
    public DocBuilder setContent(String content) {
        this.content = content;
        return this;
    }

 
    @Override
    public DocBuilder setExtension(String extension) {
        this.extension = extension;
        return this;
    }

  @Override
    public DocBuilder setEncryption(boolean encryption) {
        this.encryption = encryption;
        return this;
    }

    
    @Override
    public Document BuildDoc() {
        return new Document(name, type, content, extension, encryption);
    }

   
}


