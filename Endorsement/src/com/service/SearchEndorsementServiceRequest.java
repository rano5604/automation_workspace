
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchEndorsementServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchEndorsementServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="criteria" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}endorsementSearchCriteria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchEndorsementServiceRequest", propOrder = {
    "criteria"
})
public class SearchEndorsementServiceRequest
    extends ServiceRequest
{

    protected EndorsementSearchCriteria criteria;

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link EndorsementSearchCriteria }
     *     
     */
    public EndorsementSearchCriteria getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndorsementSearchCriteria }
     *     
     */
    public void setCriteria(EndorsementSearchCriteria value) {
        this.criteria = value;
    }

}
