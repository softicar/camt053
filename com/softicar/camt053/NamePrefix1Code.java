//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.03.21 um 12:31:16 PM CET 
//


package com.softicar.camt053;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NamePrefix1Code.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="NamePrefix1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DOCT"/&gt;
 *     &lt;enumeration value="MIST"/&gt;
 *     &lt;enumeration value="MISS"/&gt;
 *     &lt;enumeration value="MADM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NamePrefix1Code")
@XmlEnum
public enum NamePrefix1Code {

    DOCT,
    MIST,
    MISS,
    MADM;

    public String value() {
        return name();
    }

    public static NamePrefix1Code fromValue(String v) {
        return valueOf(v);
    }

}
