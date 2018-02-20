
package clientjavawsperiodictable;
import com.sun.org.apache.xml.internal.serialize.Serializer;
import java.util.*;

public class ClientJavaWsPeriodicTable {

    
    public static void main(String[] args) {
        String text = "Gold";
        String response1 = getAtomicNumber(text);
        String response2 = getElementSymbol(text);
        if (!response1.equals("<NewDataSet />")) {
            String atomicNumber = parseResponse(response1, "</AtomicNumber>");
            System.out.println("Gold atomic number is: " + atomicNumber);
        }
        if (!response2.equals("<NewDataSet />")) {
            String elementSymbol = parseResponse(response2, "</Symbol>");
            System.out.println("Gold element symbol is: " + elementSymbol );

        }
    }

    private static String getAtomicWeight(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicWeight(elementName);
    }

    private static String getAtomicNumber(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicNumber(elementName);
    }

    private static String getAtoms() {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtoms();
    }

    private static String getElementSymbol(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getElementSymbol(elementName);
    }

    private static String parseResponse(String response1, String atomicNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
