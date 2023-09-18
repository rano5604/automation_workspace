
package com.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for appStatusSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="appStatusSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusGroup" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}appStatusGroup" minOccurs="0"/>
 *         &lt;element name="summaryList" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}statusCount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appStatusSummary", propOrder = {
    "statusGroup",
    "summaryList"
})
public class AppStatusSummary {

    @XmlSchemaType(name = "string")
    protected AppStatusGroup statusGroup;
    @XmlElement(nillable = true)
    protected List<StatusCount> summaryList;

    /**
     * Gets the value of the statusGroup property.
     * 
     * @return
     *     possible object is
     *     {@link AppStatusGroup }
     *     
     */
    public AppStatusGroup getStatusGroup() {
        return statusGroup;
    }

    /**
     * Sets the value of the statusGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppStatusGroup }
     *     
     */
    public void setStatusGroup(AppStatusGroup value) {
        this.statusGroup = value;
    }

    /**
     * Gets the value of the summaryList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summaryList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummaryList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusCount }
     * 
     * 
     */
    public List<StatusCount> getSummaryList() {
        if (summaryList == null) {
            summaryList = new ArrayList<StatusCount>();
        }
        return this.summaryList;
    }

}
