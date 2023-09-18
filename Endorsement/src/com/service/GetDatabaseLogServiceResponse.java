
package com.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDatabaseLogServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDatabaseLogServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="databaseLogs" type="{http://bean.license.ws.service.hsdl.soa.tigerit.com/}databaseLog" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totalRecord" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDatabaseLogServiceResponse", propOrder = {
    "databaseLogs",
    "totalRecord"
})
public class GetDatabaseLogServiceResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<DatabaseLog> databaseLogs;
    protected Long totalRecord;

    /**
     * Gets the value of the databaseLogs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the databaseLogs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatabaseLogs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatabaseLog }
     * 
     * 
     */
    public List<DatabaseLog> getDatabaseLogs() {
        if (databaseLogs == null) {
            databaseLogs = new ArrayList<DatabaseLog>();
        }
        return this.databaseLogs;
    }

    /**
     * Gets the value of the totalRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalRecord() {
        return totalRecord;
    }

    /**
     * Sets the value of the totalRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalRecord(Long value) {
        this.totalRecord = value;
    }

}
