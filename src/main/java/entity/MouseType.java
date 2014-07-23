
package entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MouseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MouseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="typeMouse" type="{http://www.example.com/personalComputer}typeMouse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MouseType", namespace = "http://www.example.com/personalComputer", propOrder = {
    "typeMouse"
})
public class MouseType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TypeMouse typeMouse;

    /**
     * Gets the value of the typeMouse property.
     * 
     * @return
     *     possible object is
     *     {@link TypeMouse }
     *     
     */
    public TypeMouse getTypeMouse() {
        return typeMouse;
    }

    /**
     * Sets the value of the typeMouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMouse }
     *     
     */
    public void setTypeMouse(TypeMouse value) {
        this.typeMouse = value;
    }

}
