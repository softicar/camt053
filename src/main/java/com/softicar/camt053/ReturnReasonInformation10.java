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
 * <p>Java-Klasse für ReturnReasonInformation10 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ReturnReasonInformation10"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgnlBkTxCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}BankTransactionCodeStructure4" minOccurs="0"/&gt;
 *         &lt;element name="Orgtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}PartyIdentification32" minOccurs="0"/&gt;
 *         &lt;element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}ReturnReason5Choice" minOccurs="0"/&gt;
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}Max105Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnReasonInformation10", propOrder = {
    "orgnlBkTxCd",
    "orgtr",
    "rsn",
    "addtlInf"
})
public class ReturnReasonInformation10 {

    @XmlElement(name = "OrgnlBkTxCd")
    protected BankTransactionCodeStructure4 orgnlBkTxCd;
    @XmlElement(name = "Orgtr")
    protected PartyIdentification32 orgtr;
    @XmlElement(name = "Rsn")
    protected ReturnReason5Choice rsn;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Ruft den Wert der orgnlBkTxCd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BankTransactionCodeStructure4 }
     *     
     */
    public BankTransactionCodeStructure4 getOrgnlBkTxCd() {
        return orgnlBkTxCd;
    }

    /**
     * Legt den Wert der orgnlBkTxCd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransactionCodeStructure4 }
     *     
     */
    public void setOrgnlBkTxCd(BankTransactionCodeStructure4 value) {
        this.orgnlBkTxCd = value;
    }

    /**
     * Ruft den Wert der orgtr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification32 }
     *     
     */
    public PartyIdentification32 getOrgtr() {
        return orgtr;
    }

    /**
     * Legt den Wert der orgtr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification32 }
     *     
     */
    public void setOrgtr(PartyIdentification32 value) {
        this.orgtr = value;
    }

    /**
     * Ruft den Wert der rsn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReturnReason5Choice }
     *     
     */
    public ReturnReason5Choice getRsn() {
        return rsn;
    }

    /**
     * Legt den Wert der rsn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnReason5Choice }
     *     
     */
    public void setRsn(ReturnReason5Choice value) {
        this.rsn = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<String>();
        }
        return this.addtlInf;
    }

}
