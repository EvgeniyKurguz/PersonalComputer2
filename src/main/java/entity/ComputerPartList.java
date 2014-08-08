
package entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for computerPartList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="computerPartList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="computerPart" type="{http://www.example.com/personalComputer}computerPartType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "computerPartList", namespace = "http://www.example.com/personalComputer", propOrder = {
    "computerPart"
})
public class ComputerPartList {

    @XmlElement(required = true)
    protected List<ComputerPartType> computerPart;

    /**
     * Gets the value of the computerPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the computerPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComputerPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComputerPartType }
     * 
     * 
     */
    public List<ComputerPartType> getComputerPart() {
        if (computerPart == null) {
            computerPart = new ArrayList<ComputerPartType>();
        }
        return this.computerPart;
    }



}