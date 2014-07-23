
package entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeMouse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeMouse">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="optical"/>
 *     &lt;enumeration value="laser"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeMouse", namespace = "http://www.example.com/personalComputer")
@XmlEnum
public enum TypeMouse {

    @XmlEnumValue("optical")
    OPTICAL("optical"),
    @XmlEnumValue("laser")
    LASER("laser");
    private final String value;

    TypeMouse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeMouse fromValue(String v) {
        for (TypeMouse c: TypeMouse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
