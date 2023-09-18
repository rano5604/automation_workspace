
package com.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchEndorsementServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchEndorsementServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="endorsementList" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}endorsement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchEndorsementServiceResponse", propOrder = {
    "endorsementList",
    "totalCount"
})
public class SearchEndorsementServiceResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<Endorsement> endorsementList;
    protected Integer totalCount;

    /**
     * Gets the value of the endorsementList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endorsementList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndorsementList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Endorsement }
     * 
     * 
     */
    public List<Endorsement> getEndorsementList() {
        if (endorsementList == null) {
            endorsementList = new ArrayList<Endorsement>();
        }
        return this.endorsementList;
    }

    /**
     * Gets the value of the totalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCount(Integer value) {
        this.totalCount = value;
    }

}
