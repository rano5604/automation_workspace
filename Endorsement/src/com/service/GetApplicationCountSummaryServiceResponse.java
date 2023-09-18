
package com.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getApplicationCountSummaryServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getApplicationCountSummaryServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="statusCountList" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}statusCount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getApplicationCountSummaryServiceResponse", propOrder = {
    "statusCountList"
})
public class GetApplicationCountSummaryServiceResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<StatusCount> statusCountList;

    /**
     * Gets the value of the statusCountList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusCountList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusCountList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusCount }
     * 
     * 
     */
    public List<StatusCount> getStatusCountList() {
        if (statusCountList == null) {
            statusCountList = new ArrayList<StatusCount>();
        }
        return this.statusCountList;
    }

}
