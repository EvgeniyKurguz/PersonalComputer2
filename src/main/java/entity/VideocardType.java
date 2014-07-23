
package entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideocardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideocardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extensionBoard" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataBus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="versionShader" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="videoMemory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideocardType", namespace = "http://www.example.com/personalComputer", propOrder = {
    "extensionBoard",
    "dataBus",
    "versionShader",
    "videoMemory"
})
public class VideocardType {

    @XmlElement(required = true)
    protected String extensionBoard;
    protected int dataBus;
    protected float versionShader;
    protected int videoMemory;

    /**
     * Gets the value of the extensionBoard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionBoard() {
        return extensionBoard;
    }

    /**
     * Sets the value of the extensionBoard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionBoard(String value) {
        this.extensionBoard = value;
    }

    /**
     * Gets the value of the dataBus property.
     * 
     */
    public int getDataBus() {
        return dataBus;
    }

    /**
     * Sets the value of the dataBus property.
     * 
     */
    public void setDataBus(int value) {
        this.dataBus = value;
    }

    /**
     * Gets the value of the versionShader property.
     * 
     */
    public float getVersionShader() {
        return versionShader;
    }

    /**
     * Sets the value of the versionShader property.
     * 
     */
    public void setVersionShader(float value) {
        this.versionShader = value;
    }

    /**
     * Gets the value of the videoMemory property.
     * 
     */
    public int getVideoMemory() {
        return videoMemory;
    }

    /**
     * Sets the value of the videoMemory property.
     * 
     */
    public void setVideoMemory(int value) {
        this.videoMemory = value;
    }

}
