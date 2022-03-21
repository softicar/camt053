//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.03.17 um 11:27:27 AM CET 
//


package camt053v2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BalanceType12 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BalanceType12"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CdOrPrtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}BalanceType5Choice"/&gt;
 *         &lt;element name="SubTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}BalanceSubType1Choice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceType12", propOrder = {
    "cdOrPrtry",
    "subTp"
})
public class BalanceType12 {

    @XmlElement(name = "CdOrPrtry", required = true)
    protected BalanceType5Choice cdOrPrtry;
    @XmlElement(name = "SubTp")
    protected BalanceSubType1Choice subTp;

    /**
     * Ruft den Wert der cdOrPrtry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BalanceType5Choice }
     *     
     */
    public BalanceType5Choice getCdOrPrtry() {
        return cdOrPrtry;
    }

    /**
     * Legt den Wert der cdOrPrtry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceType5Choice }
     *     
     */
    public void setCdOrPrtry(BalanceType5Choice value) {
        this.cdOrPrtry = value;
    }

    /**
     * Ruft den Wert der subTp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSubType1Choice }
     *     
     */
    public BalanceSubType1Choice getSubTp() {
        return subTp;
    }

    /**
     * Legt den Wert der subTp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSubType1Choice }
     *     
     */
    public void setSubTp(BalanceSubType1Choice value) {
        this.subTp = value;
    }

}
