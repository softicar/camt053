//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.03.21 um 12:31:16 PM CET 
//


package com.softicar.camt053;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Pagination complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Pagination"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PgNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}Max5NumericText"/&gt;
 *         &lt;element name="LastPgInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}YesNoIndicator"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pagination", propOrder = {
    "pgNb",
    "lastPgInd"
})
public class Pagination {

    @XmlElement(name = "PgNb", required = true)
    protected String pgNb;
    @XmlElement(name = "LastPgInd")
    protected boolean lastPgInd;

    /**
     * Ruft den Wert der pgNb-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgNb() {
        return pgNb;
    }

    /**
     * Legt den Wert der pgNb-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgNb(String value) {
        this.pgNb = value;
    }

    /**
     * Ruft den Wert der lastPgInd-Eigenschaft ab.
     * 
     */
    public boolean isLastPgInd() {
        return lastPgInd;
    }

    /**
     * Legt den Wert der lastPgInd-Eigenschaft fest.
     * 
     */
    public void setLastPgInd(boolean value) {
        this.lastPgInd = value;
    }

}