//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.03.24 um 11:20:20 AM CET 
//


package com.softicar.camt053;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AccountInterest2 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AccountInterest2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}InterestType1Choice" minOccurs="0"/&gt;
 *         &lt;element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}Rate3" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FrToDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}DateTimePeriodDetails" minOccurs="0"/&gt;
 *         &lt;element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountInterest2", propOrder = {
    "tp",
    "rate",
    "frToDt",
    "rsn"
})
public class AccountInterest2 {

    @XmlElement(name = "Tp")
    protected InterestType1Choice tp;
    @XmlElement(name = "Rate")
    protected List<Rate3> rate;
    @XmlElement(name = "FrToDt")
    protected DateTimePeriodDetails frToDt;
    @XmlElement(name = "Rsn")
    protected String rsn;

    /**
     * Ruft den Wert der tp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterestType1Choice }
     *     
     */
    public InterestType1Choice getTp() {
        return tp;
    }

    /**
     * Legt den Wert der tp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestType1Choice }
     *     
     */
    public void setTp(InterestType1Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rate3 }
     * 
     * 
     */
    public List<Rate3> getRate() {
        if (rate == null) {
            rate = new ArrayList<Rate3>();
        }
        return this.rate;
    }

    /**
     * Ruft den Wert der frToDt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodDetails }
     *     
     */
    public DateTimePeriodDetails getFrToDt() {
        return frToDt;
    }

    /**
     * Legt den Wert der frToDt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodDetails }
     *     
     */
    public void setFrToDt(DateTimePeriodDetails value) {
        this.frToDt = value;
    }

    /**
     * Ruft den Wert der rsn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsn() {
        return rsn;
    }

    /**
     * Legt den Wert der rsn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsn(String value) {
        this.rsn = value;
    }

}
