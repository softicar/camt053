//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.03.17 um 11:27:27 AM CET 
//


package camt053v2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BalanceType12Code.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="BalanceType12Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="XPCD"/&gt;
 *     &lt;enumeration value="OPAV"/&gt;
 *     &lt;enumeration value="ITAV"/&gt;
 *     &lt;enumeration value="CLAV"/&gt;
 *     &lt;enumeration value="FWAV"/&gt;
 *     &lt;enumeration value="CLBD"/&gt;
 *     &lt;enumeration value="ITBD"/&gt;
 *     &lt;enumeration value="OPBD"/&gt;
 *     &lt;enumeration value="PRCD"/&gt;
 *     &lt;enumeration value="INFO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BalanceType12Code")
@XmlEnum
public enum BalanceType12Code {

    XPCD,
    OPAV,
    ITAV,
    CLAV,
    FWAV,
    CLBD,
    ITBD,
    OPBD,
    PRCD,
    INFO;

    public String value() {
        return name();
    }

    public static BalanceType12Code fromValue(String v) {
        return valueOf(v);
    }

}
