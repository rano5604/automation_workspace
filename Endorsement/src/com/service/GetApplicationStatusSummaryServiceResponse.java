
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getApplicationStatusSummaryServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getApplicationStatusSummaryServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="appStatusSummary" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}appStatusSummary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getApplicationStatusSummaryServiceResponse", propOrder = {
    "appStatusSummary"
})
public class GetApplicationStatusSummaryServiceResponse
    extends ServiceResponse
{

    protected AppStatusSummary appStatusSummary;

    /**
     * Gets the value of the appStatusSummary property.
     * 
     * @return
     *     possible object is
     *     {@link AppStatusSummary }
     *     
     */
    public AppStatusSummary getAppStatusSummary() {
        return appStatusSummary;
    }

    /**
     * Sets the value of the appStatusSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppStatusSummary }
     *     
     */
    public void setAppStatusSummary(AppStatusSummary value) {
        this.appStatusSummary = value;
    }

}
