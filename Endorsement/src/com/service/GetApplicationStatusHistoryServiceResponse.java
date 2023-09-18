
package com.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getApplicationStatusHistoryServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getApplicationStatusHistoryServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="historyList" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}applicationStatusHistory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getApplicationStatusHistoryServiceResponse", propOrder = {
    "historyList",
    "total"
})
public class GetApplicationStatusHistoryServiceResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<ApplicationStatusHistory> historyList;
    protected Integer total;

    /**
     * Gets the value of the historyList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historyList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoryList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationStatusHistory }
     * 
     * 
     */
    public List<ApplicationStatusHistory> getHistoryList() {
        if (historyList == null) {
            historyList = new ArrayList<ApplicationStatusHistory>();
        }
        return this.historyList;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotal(Integer value) {
        this.total = value;
    }

}
