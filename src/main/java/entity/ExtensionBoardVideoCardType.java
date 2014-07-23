
package entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for extensionBoardVideoCardType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="extensionBoardVideoCardType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PCI-Ex"/>
 *     &lt;enumeration value="AGP"/>
 *     &lt;enumeration value="PCI"/>
 *     &lt;enumeration value="ISA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "extensionBoardVideoCardType", namespace = "http://www.example.com/personalComputer")
@XmlEnum
public enum ExtensionBoardVideoCardType {

    @XmlEnumValue("PCI-Ex")
    PCI_EX("PCI-Ex"),
    AGP("AGP"),
    PCI("PCI"),
    ISA("ISA");
    private final String value;

    ExtensionBoardVideoCardType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExtensionBoardVideoCardType fromValue(String v) {
        for (ExtensionBoardVideoCardType c: ExtensionBoardVideoCardType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
