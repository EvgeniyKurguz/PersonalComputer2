
package entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for makerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="makerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AMD_FX8200"/>
 *     &lt;enumeration value="Samsung"/>
 *     &lt;enumeration value="Hi tech"/>
 *     &lt;enumeration value="BENQ"/>
 *     &lt;enumeration value="HP"/>
 *     &lt;enumeration value="Radeon_HD7990"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "makerType", namespace = "http://www.example.com/personalComputer")
@XmlEnum
public enum MakerType {

    @XmlEnumValue("AMD_FX8200")
    AMD_FX_8200("AMD_FX8200"),
    @XmlEnumValue("Samsung")
    SAMSUNG("Samsung"),
    @XmlEnumValue("Hi tech")
    HI_TECH("Hi tech"),
    BENQ("BENQ"),
    HP("HP"),
    @XmlEnumValue("Radeon_HD7990")
    RADEON_HD_7990("Radeon_HD7990");
    private final String value;

    MakerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MakerType fromValue(String v) {
        for (MakerType c: MakerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
