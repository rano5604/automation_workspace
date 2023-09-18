
package com.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for markAsOnHoldApplicationServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="markAsOnHoldApplicationServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="applId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="applicationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="onholdReasonList" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}applicationRemark" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "markAsOnHoldApplicationServiceRequest", propOrder = {
    "applId",
    "applicationStatus",
    "onholdReasonList"
})
public class MarkAsOnHoldApplicationServiceRequest
    extends ServiceRequest
{

    protected Long applId;
    protected String applicationStatus;
    @XmlElement(nillable = true)
    protected List<ApplicationRemark> onholdReasonList;

    /**
     * Gets the value of the applId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplId() {
        return applId;
    }

    /**
     * Sets the value of the applId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplId(Long value) {
        this.applId = value;
    }

    /**
     * Gets the value of the applicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationStatus() {
        return applicationStatus;
    }

    /**
     * Sets the value of the applicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationStatus(String value) {
        this.applicationStatus = value;
    }

    /**
     * Gets the value of the onholdReasonList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onholdReasonList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnholdReasonList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationRemark }
     * 
     * 
     */
    public List<ApplicationRemark> getOnholdReasonList() {
        if (onholdReasonList == null) {
            onholdReasonList = new ArrayList<ApplicationRemark>();
        }
        return this.onholdReasonList;
    }

}
