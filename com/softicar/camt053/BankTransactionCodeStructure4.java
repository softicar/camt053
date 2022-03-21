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
 * <p>Java-Klasse für BankTransactionCodeStructure4 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BankTransactionCodeStructure4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Domn" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}BankTransactionCodeStructure5" minOccurs="0"/&gt;
 *         &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}ProprietaryBankTransactionCodeStructure1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankTransactionCodeStructure4", propOrder = {
    "domn",
    "prtry"
})
public class BankTransactionCodeStructure4 {

    @XmlElement(name = "Domn")
    protected BankTransactionCodeStructure5 domn;
    @XmlElement(name = "Prtry")
    protected ProprietaryBankTransactionCodeStructure1 prtry;

    /**
     * Ruft den Wert der domn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BankTransactionCodeStructure5 }
     *     
     */
    public BankTransactionCodeStructure5 getDomn() {
        return domn;
    }

    /**
     * Legt den Wert der domn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransactionCodeStructure5 }
     *     
     */
    public void setDomn(BankTransactionCodeStructure5 value) {
        this.domn = value;
    }

    /**
     * Ruft den Wert der prtry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryBankTransactionCodeStructure1 }
     *     
     */
    public ProprietaryBankTransactionCodeStructure1 getPrtry() {
        return prtry;
    }

    /**
     * Legt den Wert der prtry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryBankTransactionCodeStructure1 }
     *     
     */
    public void setPrtry(ProprietaryBankTransactionCodeStructure1 value) {
        this.prtry = value;
    }

}
