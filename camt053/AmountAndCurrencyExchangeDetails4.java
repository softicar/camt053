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
 * <p>Java-Klasse für AmountAndCurrencyExchangeDetails4 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AmountAndCurrencyExchangeDetails4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}Max35Text"/&gt;
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}ActiveOrHistoricCurrencyAndAmount"/&gt;
 *         &lt;element name="CcyXchg" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}CurrencyExchange5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountAndCurrencyExchangeDetails4", propOrder = {
    "tp",
    "amt",
    "ccyXchg"
})
public class AmountAndCurrencyExchangeDetails4 {

    @XmlElement(name = "Tp", required = true)
    protected String tp;
    @XmlElement(name = "Amt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "CcyXchg")
    protected CurrencyExchange5 ccyXchg;

    /**
     * Ruft den Wert der tp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Legt den Wert der tp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTp(String value) {
        this.tp = value;
    }

    /**
     * Ruft den Wert der amt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Legt den Wert der amt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Ruft den Wert der ccyXchg-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange5 }
     *     
     */
    public CurrencyExchange5 getCcyXchg() {
        return ccyXchg;
    }

    /**
     * Legt den Wert der ccyXchg-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange5 }
     *     
     */
    public void setCcyXchg(CurrencyExchange5 value) {
        this.ccyXchg = value;
    }

}
