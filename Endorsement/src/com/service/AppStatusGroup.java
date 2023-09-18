
package com.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for appStatusGroup.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="appStatusGroup">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AFIS_PENDING"/>
 *     &lt;enumeration value="AFIS_MATCHED"/>
 *     &lt;enumeration value="AFIS_ERROR"/>
 *     &lt;enumeration value="PRINT_PENDING"/>
 *     &lt;enumeration value="PAYMENT_PENDING"/>
 *     &lt;enumeration value="PRINT_FAILED"/>
 *     &lt;enumeration value="QC_PENDING"/>
 *     &lt;enumeration value="QC_FAILED"/>
 *     &lt;enumeration value="PACK_PENDING"/>
 *     &lt;enumeration value="WRONG_DESTINATION"/>
 *     &lt;enumeration value="DELIVERY_PENDING"/>
 *     &lt;enumeration value="SUSPENDED"/>
 *     &lt;enumeration value="SHIPMENT_PENDING"/>
 *     &lt;enumeration value="RECEIVE_PENDING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "appStatusGroup")
@XmlEnum
public enum AppStatusGroup {

    AFIS_PENDING,
    AFIS_MATCHED,
    AFIS_ERROR,
    PRINT_PENDING,
    PAYMENT_PENDING,
    PRINT_FAILED,
    QC_PENDING,
    QC_FAILED,
    PACK_PENDING,
    WRONG_DESTINATION,
    DELIVERY_PENDING,
    SUSPENDED,
    SHIPMENT_PENDING,
    RECEIVE_PENDING;

    public String value() {
        return name();
    }

    public static AppStatusGroup fromValue(String v) {
        return valueOf(v);
    }

}
