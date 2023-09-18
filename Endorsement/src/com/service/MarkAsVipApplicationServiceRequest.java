
package com.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for markAsVipApplicationServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="markAsVipApplicationServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="check" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="referenceNumberList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "markAsVipApplicationServiceRequest", propOrder = {
    "check",
    "referenceNumberList"
})
public class MarkAsVipApplicationServiceRequest
    extends ServiceRequest
{

    protected boolean check;
    @XmlElement(nillable = true)
    protected List<String> referenceNumberList;

    /**
     * Gets the value of the check property.
     * 
     */
    public boolean isCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     */
    public void setCheck(boolean value) {
        this.check = value;
    }

    /**
     * Gets the value of the referenceNumberList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceNumberList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceNumberList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReferenceNumberList() {
        if (referenceNumberList == null) {
            referenceNumberList = new ArrayList<String>();
        }
        return this.referenceNumberList;
    }

}
