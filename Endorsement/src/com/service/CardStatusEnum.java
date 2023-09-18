
package com.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cardStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cardStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AVAILABLE"/>
 *     &lt;enumeration value="PACKED"/>
 *     &lt;enumeration value="RECEIVED"/>
 *     &lt;enumeration value="WRONG_DESTINATION"/>
 *     &lt;enumeration value="LOST"/>
 *     &lt;enumeration value="DAMAGED"/>
 *     &lt;enumeration value="REJECTED"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="PRINT_IN_PROGRESS"/>
 *     &lt;enumeration value="PRINTING_ERROR"/>
 *     &lt;enumeration value="PRINTED"/>
 *     &lt;enumeration value="QC_PASSED"/>
 *     &lt;enumeration value="QC_FAILED"/>
 *     &lt;enumeration value="DISPATCHED"/>
 *     &lt;enumeration value="DELIVERED"/>
 *     &lt;enumeration value="DISPATCH_FAILED"/>
 *     &lt;enumeration value="DELIVERY_FAILED"/>
 *     &lt;enumeration value="PRINT_ON_HOLD"/>
 *     &lt;enumeration value="DATA_PREPARATION_FAILED"/>
 *     &lt;enumeration value="INACTIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cardStatusEnum")
@XmlEnum
public enum CardStatusEnum {

    AVAILABLE,
    PACKED,
    RECEIVED,
    WRONG_DESTINATION,
    LOST,
    DAMAGED,
    REJECTED,
    PENDING,
    CANCELLED,
    PRINT_IN_PROGRESS,
    PRINTING_ERROR,
    PRINTED,
    QC_PASSED,
    QC_FAILED,
    DISPATCHED,
    DELIVERED,
    DISPATCH_FAILED,
    DELIVERY_FAILED,
    PRINT_ON_HOLD,
    DATA_PREPARATION_FAILED,
    INACTIVE;

    public String value() {
        return name();
    }

    public static CardStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
