//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.03.21 um 12:10:46 PM CET 
//


package camt053;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CashAccountType4Code.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CashAccountType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="CHAR"/&gt;
 *     &lt;enumeration value="COMM"/&gt;
 *     &lt;enumeration value="TAXE"/&gt;
 *     &lt;enumeration value="CISH"/&gt;
 *     &lt;enumeration value="TRAS"/&gt;
 *     &lt;enumeration value="SACC"/&gt;
 *     &lt;enumeration value="CACC"/&gt;
 *     &lt;enumeration value="SVGS"/&gt;
 *     &lt;enumeration value="ONDP"/&gt;
 *     &lt;enumeration value="MGLD"/&gt;
 *     &lt;enumeration value="NREX"/&gt;
 *     &lt;enumeration value="MOMA"/&gt;
 *     &lt;enumeration value="LOAN"/&gt;
 *     &lt;enumeration value="SLRY"/&gt;
 *     &lt;enumeration value="ODFT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CashAccountType4Code")
@XmlEnum
public enum CashAccountType4Code {

    CASH,
    CHAR,
    COMM,
    TAXE,
    CISH,
    TRAS,
    SACC,
    CACC,
    SVGS,
    ONDP,
    MGLD,
    NREX,
    MOMA,
    LOAN,
    SLRY,
    ODFT;

    public String value() {
        return name();
    }

    public static CashAccountType4Code fromValue(String v) {
        return valueOf(v);
    }

}
