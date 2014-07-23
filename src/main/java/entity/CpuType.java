
package entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cpuType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cpuType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quntityCore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="cacheMemory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cpuType", namespace = "http://www.example.com/personalComputer", propOrder = {
    "quntityCore",
    "frequency",
    "cacheMemory"
})
public class CpuType {

    protected int quntityCore;
    protected float frequency;
    protected int cacheMemory;

    /**
     * Gets the value of the quntityCore property.
     * 
     */
    public int getQuntityCore() {
        return quntityCore;
    }

    /**
     * Sets the value of the quntityCore property.
     * 
     */
    public void setQuntityCore(int value) {
        this.quntityCore = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     */
    public float getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     */
    public void setFrequency(float value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the cacheMemory property.
     * 
     */
    public int getCacheMemory() {
        return cacheMemory;
    }

    /**
     * Sets the value of the cacheMemory property.
     * 
     */
    public void setCacheMemory(int value) {
        this.cacheMemory = value;
    }

}
