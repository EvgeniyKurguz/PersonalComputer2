
package entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the entity package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PersonalComputer_QNAME = new QName("http://www.example.com/personalComputer", "personalComputer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: entity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ComputerPartList }
     * 
     */
    public ComputerPartList createComputerPartList() {
        return new ComputerPartList();
    }

    /**
     * Create an instance of {@link CpuType }
     * 
     */
    public CpuType createCpuType() {
        return new CpuType();
    }

    /**
     * Create an instance of {@link MonitorType }
     * 
     */
    public MonitorType createMonitorType() {
        return new MonitorType();
    }

    /**
     * Create an instance of {@link DriveType }
     * 
     */
    public DriveType createDriveType() {
        return new DriveType();
    }

    /**
     * Create an instance of {@link KeybordType }
     * 
     */
    public KeybordType createKeybordType() {
        return new KeybordType();
    }

    /**
     * Create an instance of {@link ComputerPartType }
     * 
     */
    public ComputerPartType createComputerPartType() {
        return new ComputerPartType();
    }

    /**
     * Create an instance of {@link VideocardType }
     * 
     */
    public VideocardType createVideocardType() {
        return new VideocardType();
    }

    /**
     * Create an instance of {@link MouseType }
     * 
     */
    public MouseType createMouseType() {
        return new MouseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComputerPartList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/personalComputer", name = "personalComputer")
    public JAXBElement<ComputerPartList> createPersonalComputer(ComputerPartList value) {
        return new JAXBElement<ComputerPartList>(_PersonalComputer_QNAME, ComputerPartList.class, null, value);
    }

}
