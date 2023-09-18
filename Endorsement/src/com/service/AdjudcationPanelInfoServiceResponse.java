
package com.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adjudcationPanelInfoServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adjudcationPanelInfoServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="primaryInfo" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}adjudicationPanelInfo" minOccurs="0"/>
 *         &lt;element name="secondaryInfoList" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}adjudicationPanelInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adjudcationPanelInfoServiceResponse", propOrder = {
    "primaryInfo",
    "secondaryInfoList"
})
public class AdjudcationPanelInfoServiceResponse
    extends ServiceResponse
{

    protected AdjudicationPanelInfo primaryInfo;
    @XmlElement(nillable = true)
    protected List<AdjudicationPanelInfo> secondaryInfoList;

    /**
     * Gets the value of the primaryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdjudicationPanelInfo }
     *     
     */
    public AdjudicationPanelInfo getPrimaryInfo() {
        return primaryInfo;
    }

    /**
     * Sets the value of the primaryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjudicationPanelInfo }
     *     
     */
    public void setPrimaryInfo(AdjudicationPanelInfo value) {
        this.primaryInfo = value;
    }

    /**
     * Gets the value of the secondaryInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdjudicationPanelInfo }
     * 
     * 
     */
    public List<AdjudicationPanelInfo> getSecondaryInfoList() {
        if (secondaryInfoList == null) {
            secondaryInfoList = new ArrayList<AdjudicationPanelInfo>();
        }
        return this.secondaryInfoList;
    }

}
