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
 * <p>Java-Klasse für Rate3 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Rate3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}RateType4Choice"/&gt;
 *         &lt;element name="VldtyRg" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}CurrencyAndAmountRange2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rate3", propOrder = {
    "tp",
    "vldtyRg"
})
public class Rate3 {

    @XmlElement(name = "Tp", required = true)
    protected RateType4Choice tp;
    @XmlElement(name = "VldtyRg")
    protected CurrencyAndAmountRange2 vldtyRg;

    /**
     * Ruft den Wert der tp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateType4Choice }
     *     
     */
    public RateType4Choice getTp() {
        return tp;
    }

    /**
     * Legt den Wert der tp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType4Choice }
     *     
     */
    public void setTp(RateType4Choice value) {
        this.tp = value;
    }

    /**
     * Ruft den Wert der vldtyRg-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmountRange2 }
     *     
     */
    public CurrencyAndAmountRange2 getVldtyRg() {
        return vldtyRg;
    }

    /**
     * Legt den Wert der vldtyRg-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmountRange2 }
     *     
     */
    public void setVldtyRg(CurrencyAndAmountRange2 value) {
        this.vldtyRg = value;
    }

}
