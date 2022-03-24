//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.03.24 um 11:20:20 AM CET 
//


package com.softicar.camt053;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Party6Choice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Party6Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="OrgId" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}OrganisationIdentification4"/&gt;
 *           &lt;element name="PrvtId" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}PersonIdentification5"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party6Choice", propOrder = {
    "orgId",
    "prvtId"
})
public class Party6Choice {

    @XmlElement(name = "OrgId")
    protected OrganisationIdentification4 orgId;
    @XmlElement(name = "PrvtId")
    protected PersonIdentification5 prvtId;

    /**
     * Ruft den Wert der orgId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification4 }
     *     
     */
    public OrganisationIdentification4 getOrgId() {
        return orgId;
    }

    /**
     * Legt den Wert der orgId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification4 }
     *     
     */
    public void setOrgId(OrganisationIdentification4 value) {
        this.orgId = value;
    }

    /**
     * Ruft den Wert der prvtId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification5 }
     *     
     */
    public PersonIdentification5 getPrvtId() {
        return prvtId;
    }

    /**
     * Legt den Wert der prvtId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification5 }
     *     
     */
    public void setPrvtId(PersonIdentification5 value) {
        this.prvtId = value;
    }

}
