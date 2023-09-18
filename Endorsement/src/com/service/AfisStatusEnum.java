
package com.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for afisStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="afisStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="IN_PROGRESS"/>
 *     &lt;enumeration value="ADD_PENDING"/>
 *     &lt;enumeration value="UPDATE_PENDING"/>
 *     &lt;enumeration value="ADD_ERROR"/>
 *     &lt;enumeration value="UPDATE_ERROR"/>
 *     &lt;enumeration value="DEDUPLICATION_ERROR"/>
 *     &lt;enumeration value="ADD_PROCESSING"/>
 *     &lt;enumeration value="UPDATE_PROCESSING"/>
 *     &lt;enumeration value="DEDUPLICATION_PROCESSING"/>
 *     &lt;enumeration value="ADD_IN_PROGRESS"/>
 *     &lt;enumeration value="UPDATE_IN_PROGRESS"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="NO_MATCH"/>
 *     &lt;enumeration value="MATCH_FOUND"/>
 *     &lt;enumeration value="DUPLICATE"/>
 *     &lt;enumeration value="MATCH_VERIFIED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "afisStatusEnum")
@XmlEnum
public enum AfisStatusEnum {

    PENDING,
    IN_PROGRESS,
    ADD_PENDING,
    UPDATE_PENDING,
    ADD_ERROR,
    UPDATE_ERROR,
    DEDUPLICATION_ERROR,
    ADD_PROCESSING,
    UPDATE_PROCESSING,
    DEDUPLICATION_PROCESSING,
    ADD_IN_PROGRESS,
    UPDATE_IN_PROGRESS,
    ERROR,
    NO_MATCH,
    MATCH_FOUND,
    DUPLICATE,
    MATCH_VERIFIED;

    public String value() {
        return name();
    }

    public static AfisStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
