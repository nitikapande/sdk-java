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
 *         &lt;element name="customerProfileId" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}numericString"/>
 *         &lt;element name="hostedProfileSettings" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ArrayOfSetting" minOccurs="0"/>
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
    "customerProfileId",
    "hostedProfileSettings"
})
@XmlRootElement(name = "getHostedProfilePageRequest")
public class GetHostedProfilePageRequest
    extends ANetApiRequest
{

    @XmlElement(required = true)
    protected String customerProfileId;
    protected ArrayOfSetting hostedProfileSettings;

    /**
     * Gets the value of the customerProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerProfileId() {
        return customerProfileId;
    }

    /**
     * Sets the value of the customerProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerProfileId(String value) {
        this.customerProfileId = value;
    }

    /**
     * Gets the value of the hostedProfileSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSetting }
     *     
     */
    public ArrayOfSetting getHostedProfileSettings() {
        return hostedProfileSettings;
    }

    /**
     * Sets the value of the hostedProfileSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSetting }
     *     
     */
    public void setHostedProfileSettings(ArrayOfSetting value) {
        this.hostedProfileSettings = value;
    }

}
