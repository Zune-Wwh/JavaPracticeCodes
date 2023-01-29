package interface_practice;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

interface One {
    void one();
}

interface Two extends One {
    void two();
}

public class InterfaceExtendingInterface implements Two{

    @Override
    public void one() {
        System.out.println("This is Method One.");
    }

    @Override
    public void two() {
        System.out.println("This is Method Two");
    }

    public static void main(String[] args) {
        InterfaceExtendingInterface obj = new InterfaceExtendingInterface();
        obj.one();
        obj.two();
    }

}
