/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Product;

/**
 *
 * @author Duy
 *
 *
 */
public class Product {

    public static void main(String[] args) {
        RequestProduct lowPriority = new LowPriorityRequest();
        lowPriority.processRequest();

        RequestProduct mediumPriority = new MediumPriorityRequest();
        mediumPriority.processRequest();

        RequestProduct highPriority = new HighPriorityRequest();
        highPriority.processRequest();
    }
}

class Request {

    String priority;
    String expireDate;
    String status;

    public Request(String priority, String expireDate, String status) {
        this.priority = priority;
        this.expireDate = expireDate;
        this.status = status;
    }
}

interface RequestProduct {

    void setPriority();

    void setStatus();

    void setExpire();

    void processRequest();
}

class LowPriorityRequest implements RequestProduct {

    private Request request;

    public LowPriorityRequest() {
        this.request = new Request("", null, "");
    }

    @Override
    public void setPriority() {
        this.request.priority = "Ignore";
    }

    @Override
    public void setStatus() {
        this.request.status = "Done";
    }

    @Override
    public void setExpire() {
        this.request.expireDate = "28/05/2024";
    }

    @Override
    public void processRequest() {
        setPriority();
        setStatus();
        setExpire();
        System.out.println("Request denied \n");

    }
}

class MediumPriorityRequest implements RequestProduct {

    private Request request;

    public MediumPriorityRequest() {
        this.request = new Request("", null, "");
    }

    @Override
    public void setPriority() {
        this.request.priority = "Medium";
    }

    @Override
    public void setStatus() {
        this.request.status = "Accepted";
    }

    @Override
    public void setExpire() {
        this.request.expireDate = "28/06/2024";
    }

    @Override
    public void processRequest() {
        setPriority();
        setStatus();
        setExpire();
        System.out.println("Request accepted, estimated completion date is " + this.request.expireDate + "\n");

    }
}

class HighPriorityRequest implements RequestProduct {

    private Request request;

    public HighPriorityRequest() {
        this.request = new Request("", null, "");
    }

    @Override
    public void setPriority() {
        this.request.priority = "Emergency";
    }

    @Override
    public void setStatus() {
        this.request.status = "Accept";
    }

    @Override
    public void setExpire() {
        this.request.expireDate = "28/05/2024";
    }

    @Override
    public void processRequest() {
        setPriority();
        setStatus();
        setExpire();
        System.out.println("Emergency request, our Administer will contact you immediately ! \n");

    }
}
