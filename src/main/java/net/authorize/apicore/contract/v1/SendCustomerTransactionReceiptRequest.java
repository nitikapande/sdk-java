//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.22 at 01:24:58 PM PDT 
//


package net.authorize.apicore.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ANetApiRequest">
 *       &lt;sequence>
 *         &lt;element name="transId" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}numericString"/>
 *         &lt;element name="customerEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailSettings" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}emailSettingsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transId",
    "customerEmail",
    "emailSettings"
})
@XmlRootElement(name = "sendCustomerTransactionReceiptRequest")
public class SendCustomerTransactionReceiptRequest
    extends ANetApiRequest
{

    @XmlElement(required = true)
    protected String transId;
    @XmlElement(required = true)
    protected String customerEmail;
    protected EmailSettingsType emailSettings;

    /**
     * Gets the value of the transId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransId() {
        return transId;
    }

    /**
     * Sets the value of the transId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransId(String value) {
        this.transId = value;
    }

    /**
     * Gets the value of the customerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * Sets the value of the customerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerEmail(String value) {
        this.customerEmail = value;
    }

    /**
     * Gets the value of the emailSettings property.
     * 
     * @return
     *     possible object is
     *     {@link EmailSettingsType }
     *     
     */
    public EmailSettingsType getEmailSettings() {
        return emailSettings;
    }

    /**
     * Sets the value of the emailSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailSettingsType }
     *     
     */
    public void setEmailSettings(EmailSettingsType value) {
        this.emailSettings = value;
    }

}
