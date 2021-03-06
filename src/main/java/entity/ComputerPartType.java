
package entity;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for computerPartType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="computerPartType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="country" type="{http://www.example.com/personalComputer}countryType"/>
 *         &lt;element name="maker" type="{http://www.example.com/personalComputer}makerType"/>
 *         &lt;element name="parametersCPU" type="{http://www.example.com/personalComputer}cpuType"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="parameterDrive" type="{http://www.example.com/personalComputer}DriveType"/>
 *         &lt;element name="parameterKeybord" type="{http://www.example.com/personalComputer}KeybordType"/>
 *         &lt;element name="parameterMonitor" type="{http://www.example.com/personalComputer}MonitorType"/>
 *         &lt;element name="parametersMouse" type="{http://www.example.com/personalComputer}MouseType"/>
 *         &lt;element name="parametersVideocard" type="{http://www.example.com/personalComputer}VideocardType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.example.com/personalComputer}IdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "computerPartType", namespace = "http://www.example.com/personalComputer", propOrder = {
    "name",
    "country",
    "maker",
    "parametersCPU",
    "price",
    "parameterDrive",
    "parameterKeybord",
    "parameterMonitor",
    "parametersMouse",
    "parametersVideocard"
})
public class ComputerPartType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CountryType country;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MakerType maker;
    @XmlElement(required = true)
    protected String parametersCPU;
    protected int price;
    @XmlElement(required = true)
    protected DriveType parameterDrive;
    @XmlElement(required = true)
    protected KeybordType parameterKeybord;
    @XmlElement(required = true)
    protected MonitorType parameterMonitor;
    @XmlElement(required = true)
    protected MouseType parametersMouse;
    @XmlElement(required = true)
    protected String parametersVideocard;
    @XmlAttribute(name = "id", required = true)
    protected Integer id;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the maker property.
     * 
     * @return
     *     possible object is
     *     {@link MakerType }
     *     
     */
    public MakerType getMaker() {
        return maker;
    }

    /**
     * Sets the value of the maker property.
     * 
     * @param value
     *     allowed object is
     *     {@link MakerType }
     *     
     */
    public void setMaker(MakerType value) {
        this.maker = value;
    }

    /**
     * Gets the value of the parametersCPU property.
     * 
     * @return
     *     possible object is
     *     {@link CpuType }
     *     
     */
    public String getParametersCPU() {
        return parametersCPU;
    }

    /**
     * Sets the value of the parametersCPU property.
     *
     * @param value
     *     allowed object is
     *     {@link entity.CpuType }
     *     
     */
    public void setParametersCPU(String value) {
        this.parametersCPU = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(int value) {
        this.price = value;
    }

    /**
     * Gets the value of the parameterDrive property.
     * 
     * @return
     *     possible object is
     *     {@link DriveType }
     *     
     */
    public DriveType getParameterDrive() {
        return parameterDrive;
    }

    /**
     * Sets the value of the parameterDrive property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriveType }
     *     
     */
    public void setParameterDrive(DriveType value) {
        this.parameterDrive = value;
    }

    /**
     * Gets the value of the parameterKeybord property.
     * 
     * @return
     *     possible object is
     *     {@link KeybordType }
     *     
     */
    public KeybordType getParameterKeybord() {
        return parameterKeybord;
    }

    /**
     * Sets the value of the parameterKeybord property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeybordType }
     *     
     */
    public void setParameterKeybord(KeybordType value) {
        this.parameterKeybord = value;
    }

    /**
     * Gets the value of the parameterMonitor property.
     * 
     * @return
     *     possible object is
     *     {@link MonitorType }
     *     
     */
    public MonitorType getParameterMonitor() {
        return parameterMonitor;
    }

    /**
     * Sets the value of the parameterMonitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitorType }
     *     
     */
    public void setParameterMonitor(MonitorType value) {
        this.parameterMonitor = value;
    }

    /**
     * Gets the value of the parametersMouse property.
     * 
     * @return
     *     possible object is
     *     {@link MouseType }
     *     
     */
    public MouseType getParametersMouse() {
        return parametersMouse;
    }

    /**
     * Sets the value of the parametersMouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link MouseType }
     *     
     */
    public void setParametersMouse(MouseType value) {
        this.parametersMouse = value;
    }

    /**
     * Gets the value of the parametersVideocard property.
     * 
     * @return
     *     possible object is
     *     {@link VideocardType }
     *     
     */
    public String getParametersVideocard() {
        return parametersVideocard;
    }

    /**
     * Sets the value of the parametersVideocard property.
     *
     * @param value
     *     allowed object is
     *     {@link entity.VideocardType }
     *     
     */
    public void setParametersVideocard(String value) {
        this.parametersVideocard = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

}
