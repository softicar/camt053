//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.03.21 um 12:10:46 PM CET 
//


package camt053;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CashAccount20 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CashAccount20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}AccountIdentification4Choice"/&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}CashAccountType2" minOccurs="0"/&gt;
 *         &lt;element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}ActiveOrHistoricCurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="Ownr" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}PartyIdentification32" minOccurs="0"/&gt;
 *         &lt;element name="Svcr" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}BranchAndFinancialInstitutionIdentification4" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccount20", propOrder = {
    "id",
    "tp",
    "ccy",
    "nm",
    "ownr",
    "svcr"
})
public class CashAccount20 {

    @XmlElement(name = "Id", required = true)
    protected AccountIdentification4Choice id;
    @XmlElement(name = "Tp")
    protected CashAccountType2 tp;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Ownr")
    protected PartyIdentification32 ownr;
    @XmlElement(name = "Svcr")
    protected BranchAndFinancialInstitutionIdentification4 svcr;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public void setId(AccountIdentification4Choice value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der tp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountType2 }
     *     
     */
    public CashAccountType2 getTp() {
        return tp;
    }

    /**
     * Legt den Wert der tp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountType2 }
     *     
     */
    public void setTp(CashAccountType2 value) {
        this.tp = value;
    }

    /**
     * Ruft den Wert der ccy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Legt den Wert der ccy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Ruft den Wert der nm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Legt den Wert der nm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Ruft den Wert der ownr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification32 }
     *     
     */
    public PartyIdentification32 getOwnr() {
        return ownr;
    }

    /**
     * Legt den Wert der ownr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification32 }
     *     
     */
    public void setOwnr(PartyIdentification32 value) {
        this.ownr = value;
    }

    /**
     * Ruft den Wert der svcr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification4 getSvcr() {
        return svcr;
    }

    /**
     * Legt den Wert der svcr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public void setSvcr(BranchAndFinancialInstitutionIdentification4 value) {
        this.svcr = value;
    }

}
