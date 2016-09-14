
package com.mohh.nehr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="controlHeader">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="srcInstitution" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="srcApplication" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="msgID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="msgSequenceID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="msgDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="patient">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="MRNNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="name">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="aliasName">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="contactDetails">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="address">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="streetLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="streetLine2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="streetLine3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="streetLine4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="phone" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="type">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="HOME"/>
 *                                             &lt;enumeration value="MOBILE"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="phoneNumber">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="11112287"/>
 *                                             &lt;enumeration value="11111003 DAU"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="extensionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="countryOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="race" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="residencyStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="maritalStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="occupation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="VIPFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="VVIPFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="religion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="nextOfKin">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="relationship" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="medicationOrder">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="eventID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="orderID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="orderingInstitution" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="orderType">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="reasonForCancellation">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="orderStatus">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="orderedBy">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="authorizedBy">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="medicationItem">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="sequenceNo" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="groupNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="groupSequenceNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="orderSetConnectingTerm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="frequencyQualifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="dosageInstruction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="doseQuantity">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="lowValue" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                       &lt;element name="lowUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="highUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="medicationItemOrderedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="medicationStartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="medicationEndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="medicationItemStatus">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="reasonForMedication">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="changesMade">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="reasonForChanges">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="quantityOrderedUnits" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="duration">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="durationUnits" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="medicationName">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="frequency">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="routeOfAdministration">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="medicationStrength" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="medicationStrengthUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="additionalDosageInstruction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="doseForm">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "controlHeader",
    "patient",
    "medicationOrder"
})
@XmlRootElement(name = "putOrderedMedications")
public class PutOrderedMedications {

    @XmlElement(required = true)
    protected PutOrderedMedications.ControlHeader controlHeader;
    @XmlElement(required = true)
    protected PutOrderedMedications.Patient patient;
    @XmlElement(required = true)
    protected PutOrderedMedications.MedicationOrder medicationOrder;

    /**
     * Gets the value of the controlHeader property.
     * 
     * @return
     *     possible object is
     *     {@link PutOrderedMedications.ControlHeader }
     *     
     */
    public PutOrderedMedications.ControlHeader getControlHeader() {
        return controlHeader;
    }

    /**
     * Sets the value of the controlHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link PutOrderedMedications.ControlHeader }
     *     
     */
    public void setControlHeader(PutOrderedMedications.ControlHeader value) {
        this.controlHeader = value;
    }

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link PutOrderedMedications.Patient }
     *     
     */
    public PutOrderedMedications.Patient getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link PutOrderedMedications.Patient }
     *     
     */
    public void setPatient(PutOrderedMedications.Patient value) {
        this.patient = value;
    }

    /**
     * Gets the value of the medicationOrder property.
     * 
     * @return
     *     possible object is
     *     {@link PutOrderedMedications.MedicationOrder }
     *     
     */
    public PutOrderedMedications.MedicationOrder getMedicationOrder() {
        return medicationOrder;
    }

    /**
     * Sets the value of the medicationOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link PutOrderedMedications.MedicationOrder }
     *     
     */
    public void setMedicationOrder(PutOrderedMedications.MedicationOrder value) {
        this.medicationOrder = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="srcInstitution" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="srcApplication" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="msgID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="msgSequenceID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="msgDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "srcInstitution",
        "srcApplication",
        "msgID",
        "msgSequenceID",
        "msgDateTime"
    })
    public static class ControlHeader {

        @XmlElement(required = true)
        protected String srcInstitution;
        @XmlElement(required = true)
        protected String srcApplication;
        protected int msgID;
        protected int msgSequenceID;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar msgDateTime;

        /**
         * Gets the value of the srcInstitution property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSrcInstitution() {
            return srcInstitution;
        }

        /**
         * Sets the value of the srcInstitution property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSrcInstitution(String value) {
            this.srcInstitution = value;
        }

        /**
         * Gets the value of the srcApplication property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSrcApplication() {
            return srcApplication;
        }

        /**
         * Sets the value of the srcApplication property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSrcApplication(String value) {
            this.srcApplication = value;
        }

        /**
         * Gets the value of the msgID property.
         * 
         */
        public int getMsgID() {
            return msgID;
        }

        /**
         * Sets the value of the msgID property.
         * 
         */
        public void setMsgID(int value) {
            this.msgID = value;
        }

        /**
         * Gets the value of the msgSequenceID property.
         * 
         */
        public int getMsgSequenceID() {
            return msgSequenceID;
        }

        /**
         * Sets the value of the msgSequenceID property.
         * 
         */
        public void setMsgSequenceID(int value) {
            this.msgSequenceID = value;
        }

        /**
         * Gets the value of the msgDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getMsgDateTime() {
            return msgDateTime;
        }

        /**
         * Sets the value of the msgDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setMsgDateTime(XMLGregorianCalendar value) {
            this.msgDateTime = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="eventID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="orderID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="orderingInstitution" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="orderType">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="reasonForCancellation">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="orderStatus">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="orderedBy">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="authorizedBy">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="medicationItem">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="sequenceNo" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="groupNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="groupSequenceNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="orderSetConnectingTerm" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="frequencyQualifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="dosageInstruction" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="doseQuantity">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="lowValue" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                             &lt;element name="lowUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="highUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="medicationItemOrderedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="medicationStartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="medicationEndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="medicationItemStatus">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="reasonForMedication">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="changesMade">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="reasonForChanges">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="quantityOrderedUnits" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="duration">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="durationUnits" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="medicationName">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                             &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="frequency">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="routeOfAdministration">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="medicationStrength" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="medicationStrengthUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="additionalDosageInstruction" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="doseForm">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "eventID",
        "orderID",
        "orderingInstitution",
        "orderType",
        "reasonForCancellation",
        "orderStatus",
        "orderedBy",
        "authorizedBy",
        "medicationItem"
    })
    public static class MedicationOrder {

        @XmlElement(required = true)
        protected String eventID;
        @XmlElement(required = true)
        protected String orderID;
        @XmlElement(required = true)
        protected String orderingInstitution;
        @XmlElement(required = true)
        protected PutOrderedMedications.MedicationOrder.OrderType orderType;
        @XmlElement(required = true)
        protected PutOrderedMedications.MedicationOrder.ReasonForCancellation reasonForCancellation;
        @XmlElement(required = true)
        protected PutOrderedMedications.MedicationOrder.OrderStatus orderStatus;
        @XmlElement(required = true)
        protected PutOrderedMedications.MedicationOrder.OrderedBy orderedBy;
        @XmlElement(required = true)
        protected PutOrderedMedications.MedicationOrder.AuthorizedBy authorizedBy;
        @XmlElement(required = true)
        protected PutOrderedMedications.MedicationOrder.MedicationItem medicationItem;

        /**
         * Gets the value of the eventID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEventID() {
            return eventID;
        }

        /**
         * Sets the value of the eventID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEventID(String value) {
            this.eventID = value;
        }

        /**
         * Gets the value of the orderID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderID() {
            return orderID;
        }

        /**
         * Sets the value of the orderID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderID(String value) {
            this.orderID = value;
        }

        /**
         * Gets the value of the orderingInstitution property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderingInstitution() {
            return orderingInstitution;
        }

        /**
         * Sets the value of the orderingInstitution property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderingInstitution(String value) {
            this.orderingInstitution = value;
        }

        /**
         * Gets the value of the orderType property.
         * 
         * @return
         *     possible object is
         *     {@link PutOrderedMedications.MedicationOrder.OrderType }
         *     
         */
        public PutOrderedMedications.MedicationOrder.OrderType getOrderType() {
            return orderType;
        }

        /**
         * Sets the value of the orderType property.
         * 
         * @param value
         *     allowed object is
         *     {@link PutOrderedMedications.MedicationOrder.OrderType }
         *     
         */
        public void setOrderType(PutOrderedMedications.MedicationOrder.OrderType value) {
            this.orderType = value;
        }

        /**
         * Gets the value of the reasonForCancellation property.
         * 
         * @return
         *     possible object is
         *     {@link PutOrderedMedications.MedicationOrder.ReasonForCancellation }
         *     
         */
        public PutOrderedMedications.MedicationOrder.ReasonForCancellation getReasonForCancellation() {
            return reasonForCancellation;
        }

        /**
         * Sets the value of the reasonForCancellation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PutOrderedMedications.MedicationOrder.ReasonForCancellation }
         *     
         */
        public void setReasonForCancellation(PutOrderedMedications.MedicationOrder.ReasonForCancellation value) {
            this.reasonForCancellation = value;
        }

        /**
         * Gets the value of the orderStatus property.
         * 
         * @return
         *     possible object is
         *     {@link PutOrderedMedications.MedicationOrder.OrderStatus }
         *     
         */
        public PutOrderedMedications.MedicationOrder.OrderStatus getOrderStatus() {
            return orderStatus;
        }

        /**
         * Sets the value of the orderStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link PutOrderedMedications.MedicationOrder.OrderStatus }
         *     
         */
        public void setOrderStatus(PutOrderedMedications.MedicationOrder.OrderStatus value) {
            this.orderStatus = value;
        }

        /**
         * Gets the value of the orderedBy property.
         * 
         * @return
         *     possible object is
         *     {@link PutOrderedMedications.MedicationOrder.OrderedBy }
         *     
         */
        public PutOrderedMedications.MedicationOrder.OrderedBy getOrderedBy() {
            return orderedBy;
        }

        /**
         * Sets the value of the orderedBy property.
         * 
         * @param value
         *     allowed object is
         *     {@link PutOrderedMedications.MedicationOrder.OrderedBy }
         *     
         */
        public void setOrderedBy(PutOrderedMedications.MedicationOrder.OrderedBy value) {
            this.orderedBy = value;
        }

        /**
         * Gets the value of the authorizedBy property.
         * 
         * @return
         *     possible object is
         *     {@link PutOrderedMedications.MedicationOrder.AuthorizedBy }
         *     
         */
        public PutOrderedMedications.MedicationOrder.AuthorizedBy getAuthorizedBy() {
            return authorizedBy;
        }

        /**
         * Sets the value of the authorizedBy property.
         * 
         * @param value
         *     allowed object is
         *     {@link PutOrderedMedications.MedicationOrder.AuthorizedBy }
         *     
         */
        public void setAuthorizedBy(PutOrderedMedications.MedicationOrder.AuthorizedBy value) {
            this.authorizedBy = value;
        }

        /**
         * Gets the value of the medicationItem property.
         * 
         * @return
         *     possible object is
         *     {@link PutOrderedMedications.MedicationOrder.MedicationItem }
         *     
         */
        public PutOrderedMedications.MedicationOrder.MedicationItem getMedicationItem() {
            return medicationItem;
        }

        /**
         * Sets the value of the medicationItem property.
         * 
         * @param value
         *     allowed object is
         *     {@link PutOrderedMedications.MedicationOrder.MedicationItem }
         *     
         */
        public void setMedicationItem(PutOrderedMedications.MedicationOrder.MedicationItem value) {
            this.medicationItem = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "name"
        })
        public static class AuthorizedBy {

            @XmlElement(required = true)
            protected String id;
            @XmlElement(required = true)
            protected String name;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="sequenceNo" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="groupNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="groupSequenceNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="orderSetConnectingTerm" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="frequencyQualifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="dosageInstruction" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="doseQuantity">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="lowValue" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *                   &lt;element name="lowUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="highUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="medicationItemOrderedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="medicationStartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="medicationEndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="medicationItemStatus">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="reasonForMedication">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="changesMade">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="reasonForChanges">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="quantityOrderedUnits" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="duration">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="durationUnits" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="medicationName">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *                   &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="frequency">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="routeOfAdministration">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="medicationStrength" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="medicationStrengthUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="additionalDosageInstruction" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="doseForm">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "itemId",
            "sequenceNo",
            "groupNo",
            "groupSequenceNo",
            "orderSetConnectingTerm",
            "frequencyQualifier",
            "dosageInstruction",
            "doseQuantity",
            "medicationItemOrderedDate",
            "medicationStartDateTime",
            "medicationEndDateTime",
            "medicationItemStatus",
            "reasonForMedication",
            "changesMade",
            "reasonForChanges",
            "quantityOrderedUnits",
            "duration",
            "durationUnits",
            "medicationName",
            "frequency",
            "routeOfAdministration",
            "medicationStrength",
            "medicationStrengthUnit",
            "additionalDosageInstruction",
            "doseForm"
        })
        public static class MedicationItem {

            @XmlElement(required = true)
            protected String itemId;
            protected byte sequenceNo;
            @XmlElement(required = true)
            protected String groupNo;
            @XmlElement(required = true)
            protected String groupSequenceNo;
            @XmlElement(required = true)
            protected String orderSetConnectingTerm;
            @XmlElement(required = true)
            protected String frequencyQualifier;
            @XmlElement(required = true)
            protected String dosageInstruction;
            @XmlElement(required = true)
            protected PutOrderedMedications.MedicationOrder.MedicationItem.DoseQuantity doseQuantity;
            @XmlElement(required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar medicationItemOrderedDate;
            @XmlElement(required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar medicationStartDateTime;
            @XmlElement(required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar medicationEndDateTime;
            @XmlElement(required = true)
            protected PutOrderedMedications.MedicationOrder.MedicationItem.MedicationItemStatus medicationItemStatus;
            @XmlElement(required = true)
            protected PutOrderedMedications.MedicationOrder.MedicationItem.ReasonForMedication reasonForMedication;
            @XmlElement(required = true)
            protected PutOrderedMedications.MedicationOrder.MedicationItem.ChangesMade changesMade;
            @XmlElement(required = true)
            protected PutOrderedMedications.MedicationOrder.MedicationItem.ReasonForChanges reasonForChanges;
            @XmlElement(required = true)
            protected String quantityOrderedUnits;
            @XmlElement(required = true)
            protected PutOrderedMedications.MedicationOrder.MedicationItem.Duration duration;
            @XmlElement(required = true)
            protected String durationUnits;
            @XmlElement(required = true)
            protected PutOrderedMedications.MedicationOrder.MedicationItem.MedicationName medicationName;
            @XmlElement(required = true)
            protected PutOrderedMedications.MedicationOrder.MedicationItem.Frequency frequency;
            @XmlElement(required = true)
            protected PutOrderedMedications.MedicationOrder.MedicationItem.RouteOfAdministration routeOfAdministration;
            @XmlElement(required = true)
            protected String medicationStrength;
            @XmlElement(required = true)
            protected String medicationStrengthUnit;
            @XmlElement(required = true)
            protected String additionalDosageInstruction;
            @XmlElement(required = true)
            protected PutOrderedMedications.MedicationOrder.MedicationItem.DoseForm doseForm;

            /**
             * Gets the value of the itemId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemId() {
                return itemId;
            }

            /**
             * Sets the value of the itemId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemId(String value) {
                this.itemId = value;
            }

            /**
             * Gets the value of the sequenceNo property.
             * 
             */
            public byte getSequenceNo() {
                return sequenceNo;
            }

            /**
             * Sets the value of the sequenceNo property.
             * 
             */
            public void setSequenceNo(byte value) {
                this.sequenceNo = value;
            }

            /**
             * Gets the value of the groupNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGroupNo() {
                return groupNo;
            }

            /**
             * Sets the value of the groupNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGroupNo(String value) {
                this.groupNo = value;
            }

            /**
             * Gets the value of the groupSequenceNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGroupSequenceNo() {
                return groupSequenceNo;
            }

            /**
             * Sets the value of the groupSequenceNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGroupSequenceNo(String value) {
                this.groupSequenceNo = value;
            }

            /**
             * Gets the value of the orderSetConnectingTerm property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrderSetConnectingTerm() {
                return orderSetConnectingTerm;
            }

            /**
             * Sets the value of the orderSetConnectingTerm property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrderSetConnectingTerm(String value) {
                this.orderSetConnectingTerm = value;
            }

            /**
             * Gets the value of the frequencyQualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFrequencyQualifier() {
                return frequencyQualifier;
            }

            /**
             * Sets the value of the frequencyQualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFrequencyQualifier(String value) {
                this.frequencyQualifier = value;
            }

            /**
             * Gets the value of the dosageInstruction property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDosageInstruction() {
                return dosageInstruction;
            }

            /**
             * Sets the value of the dosageInstruction property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDosageInstruction(String value) {
                this.dosageInstruction = value;
            }

            /**
             * Gets the value of the doseQuantity property.
             * 
             * @return
             *     possible object is
             *     {@link PutOrderedMedications.MedicationOrder.MedicationItem.DoseQuantity }
             *     
             */
            public PutOrderedMedications.MedicationOrder.MedicationItem.DoseQuantity getDoseQuantity() {
                return doseQuantity;
            }

            /**
             * Sets the value of the doseQuantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link PutOrderedMedications.MedicationOrder.MedicationItem.DoseQuantity }
             *     
             */
            public void setDoseQuantity(PutOrderedMedications.MedicationOrder.MedicationItem.DoseQuantity value) {
                this.doseQuantity = value;
            }

            /**
             * Gets the value of the medicationItemOrderedDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getMedicationItemOrderedDate() {
                return medicationItemOrderedDate;
            }

            /**
             * Sets the value of the medicationItemOrderedDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setMedicationItemOrderedDate(XMLGregorianCalendar value) {
                this.medicationItemOrderedDate = value;
            }

            /**
             * Gets the value of the medicationStartDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getMedicationStartDateTime() {
                return medicationStartDateTime;
            }

            /**
             * Sets the value of the medicationStartDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setMedicationStartDateTime(XMLGregorianCalendar value) {
                this.medicationStartDateTime = value;
            }

            /**
             * Gets the value of the medicationEndDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getMedicationEndDateTime() {
                return medicationEndDateTime;
            }

            /**
             * Sets the value of the medicationEndDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setMedicationEndDateTime(XMLGregorianCalendar value) {
                this.medicationEndDateTime = value;
            }

            /**
             * Gets the value of the medicationItemStatus property.
             * 
             * @return
             *     possible object is
             *     {@link PutOrderedMedications.MedicationOrder.MedicationItem.MedicationItemStatus }
             *     
             */
            public PutOrderedMedications.MedicationOrder.MedicationItem.MedicationItemStatus getMedicationItemStatus() {
                return medicationItemStatus;
            }

            /**
             * Sets the value of the medicationItemStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link PutOrderedMedications.MedicationOrder.MedicationItem.MedicationItemStatus }
             *     
             */
            public void setMedicationItemStatus(PutOrderedMedications.MedicationOrder.MedicationItem.MedicationItemStatus value) {
                this.medicationItemStatus = value;
            }

            /**
             * Gets the value of the reasonForMedication property.
             * 
             * @return
             *     possible object is
             *     {@link PutOrderedMedications.MedicationOrder.MedicationItem.ReasonForMedication }
             *     
             */
            public PutOrderedMedications.MedicationOrder.MedicationItem.ReasonForMedication getReasonForMedication() {
                return reasonForMedication;
            }

            /**
             * Sets the value of the reasonForMedication property.
             * 
             * @param value
             *     allowed object is
             *     {@link PutOrderedMedications.MedicationOrder.MedicationItem.ReasonForMedication }
             *     
             */
            public void setReasonForMedication(PutOrderedMedications.MedicationOrder.MedicationItem.ReasonForMedication value) {
                this.reasonForMedication = value;
            }

            /**
             * Gets the value of the changesMade property.
             * 
             * @return
             *     possible object is
             *     {@link PutOrderedMedications.MedicationOrder.MedicationItem.ChangesMade }
             *     
             */
            public PutOrderedMedications.MedicationOrder.MedicationItem.ChangesMade getChangesMade() {
                return changesMade;
            }

            /**
             * Sets the value of the changesMade property.
             * 
             * @param value
             *     allowed object is
             *     {@link PutOrderedMedications.MedicationOrder.MedicationItem.ChangesMade }
             *     
             */
            public void setChangesMade(PutOrderedMedications.MedicationOrder.MedicationItem.ChangesMade value) {
                this.changesMade = value;
            }

            /**
             * Gets the value of the reasonForChanges property.
             * 
             * @return
             *     possible object is
             *     {@link PutOrderedMedications.MedicationOrder.MedicationItem.ReasonForChanges }
             *     
             */
            public PutOrderedMedications.MedicationOrder.MedicationItem.ReasonForChanges getReasonForChanges() {
                return reasonForChanges;
            }

            /**
             * Sets the value of the reasonForChanges property.
             * 
             * @param value
             *     allowed object is
             *     {@link PutOrderedMedications.MedicationOrder.MedicationItem.ReasonForChanges }
             *     
             */
            public void setReasonForChanges(PutOrderedMedications.MedicationOrder.MedicationItem.ReasonForChanges value) {
                this.reasonForChanges = value;
            }

            /**
             * Gets the value of the quantityOrderedUnits property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQuantityOrderedUnits() {
                return quantityOrderedUnits;
            }

            /**
             * Sets the value of the quantityOrderedUnits property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQuantityOrderedUnits(String value) {
                this.quantityOrderedUnits = value;
            }

            /**
             * Gets the value of the duration property.
             * 
             * @return
             *     possible object is
             *     {@link PutOrderedMedications.MedicationOrder.MedicationItem.Duration }
             *     
             */
            public PutOrderedMedications.MedicationOrder.MedicationItem.Duration getDuration() {
                return duration;
            }

            /**
             * Sets the value of the duration property.
             * 
             * @param value
             *     allowed object is
             *     {@link PutOrderedMedications.MedicationOrder.MedicationItem.Duration }
             *     
             */
            public void setDuration(PutOrderedMedications.MedicationOrder.MedicationItem.Duration value) {
                this.duration = value;
            }

            /**
             * Gets the value of the durationUnits property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDurationUnits() {
                return durationUnits;
            }

            /**
             * Sets the value of the durationUnits property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDurationUnits(String value) {
                this.durationUnits = value;
            }

            /**
             * Gets the value of the medicationName property.
             * 
             * @return
             *     possible object is
             *     {@link PutOrderedMedications.MedicationOrder.MedicationItem.MedicationName }
             *     
             */
            public PutOrderedMedications.MedicationOrder.MedicationItem.MedicationName getMedicationName() {
                return medicationName;
            }

            /**
             * Sets the value of the medicationName property.
             * 
             * @param value
             *     allowed object is
             *     {@link PutOrderedMedications.MedicationOrder.MedicationItem.MedicationName }
             *     
             */
            public void setMedicationName(PutOrderedMedications.MedicationOrder.MedicationItem.MedicationName value) {
                this.medicationName = value;
            }

            /**
             * Gets the value of the frequency property.
             * 
             * @return
             *     possible object is
             *     {@link PutOrderedMedications.MedicationOrder.MedicationItem.Frequency }
             *     
             */
            public PutOrderedMedications.MedicationOrder.MedicationItem.Frequency getFrequency() {
                return frequency;
            }

            /**
             * Sets the value of the frequency property.
             * 
             * @param value
             *     allowed object is
             *     {@link PutOrderedMedications.MedicationOrder.MedicationItem.Frequency }
             *     
             */
            public void setFrequency(PutOrderedMedications.MedicationOrder.MedicationItem.Frequency value) {
                this.frequency = value;
            }

            /**
             * Gets the value of the routeOfAdministration property.
             * 
             * @return
             *     possible object is
             *     {@link PutOrderedMedications.MedicationOrder.MedicationItem.RouteOfAdministration }
             *     
             */
            public PutOrderedMedications.MedicationOrder.MedicationItem.RouteOfAdministration getRouteOfAdministration() {
                return routeOfAdministration;
            }

            /**
             * Sets the value of the routeOfAdministration property.
             * 
             * @param value
             *     allowed object is
             *     {@link PutOrderedMedications.MedicationOrder.MedicationItem.RouteOfAdministration }
             *     
             */
            public void setRouteOfAdministration(PutOrderedMedications.MedicationOrder.MedicationItem.RouteOfAdministration value) {
                this.routeOfAdministration = value;
            }

            /**
             * Gets the value of the medicationStrength property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMedicationStrength() {
                return medicationStrength;
            }

            /**
             * Sets the value of the medicationStrength property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMedicationStrength(String value) {
                this.medicationStrength = value;
            }

            /**
             * Gets the value of the medicationStrengthUnit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMedicationStrengthUnit() {
                return medicationStrengthUnit;
            }

            /**
             * Sets the value of the medicationStrengthUnit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMedicationStrengthUnit(String value) {
                this.medicationStrengthUnit = value;
            }

            /**
             * Gets the value of the additionalDosageInstruction property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdditionalDosageInstruction() {
                return additionalDosageInstruction;
            }

            /**
             * Sets the value of the additionalDosageInstruction property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdditionalDosageInstruction(String value) {
                this.additionalDosageInstruction = value;
            }

            /**
             * Gets the value of the doseForm property.
             * 
             * @return
             *     possible object is
             *     {@link PutOrderedMedications.MedicationOrder.MedicationItem.DoseForm }
             *     
             */
            public PutOrderedMedications.MedicationOrder.MedicationItem.DoseForm getDoseForm() {
                return doseForm;
            }

            /**
             * Sets the value of the doseForm property.
             * 
             * @param value
             *     allowed object is
             *     {@link PutOrderedMedications.MedicationOrder.MedicationItem.DoseForm }
             *     
             */
            public void setDoseForm(PutOrderedMedications.MedicationOrder.MedicationItem.DoseForm value) {
                this.doseForm = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "code",
                "codingSchemeName",
                "codingSchemeVersion",
                "textDescription"
            })
            public static class ChangesMade {

                @XmlElement(required = true)
                protected String code;
                @XmlElement(required = true)
                protected String codingSchemeName;
                @XmlElement(required = true)
                protected String codingSchemeVersion;
                @XmlElement(required = true)
                protected String textDescription;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the codingSchemeName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodingSchemeName() {
                    return codingSchemeName;
                }

                /**
                 * Sets the value of the codingSchemeName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodingSchemeName(String value) {
                    this.codingSchemeName = value;
                }

                /**
                 * Gets the value of the codingSchemeVersion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodingSchemeVersion() {
                    return codingSchemeVersion;
                }

                /**
                 * Sets the value of the codingSchemeVersion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodingSchemeVersion(String value) {
                    this.codingSchemeVersion = value;
                }

                /**
                 * Gets the value of the textDescription property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTextDescription() {
                    return textDescription;
                }

                /**
                 * Sets the value of the textDescription property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTextDescription(String value) {
                    this.textDescription = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "code",
                "codingSchemeName",
                "codingSchemeVersion",
                "textDescription"
            })
            public static class DoseForm {

                @XmlElement(required = true)
                protected String code;
                @XmlElement(required = true)
                protected String codingSchemeName;
                @XmlElement(required = true)
                protected String codingSchemeVersion;
                @XmlElement(required = true)
                protected String textDescription;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the codingSchemeName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodingSchemeName() {
                    return codingSchemeName;
                }

                /**
                 * Sets the value of the codingSchemeName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodingSchemeName(String value) {
                    this.codingSchemeName = value;
                }

                /**
                 * Gets the value of the codingSchemeVersion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodingSchemeVersion() {
                    return codingSchemeVersion;
                }

                /**
                 * Sets the value of the codingSchemeVersion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodingSchemeVersion(String value) {
                    this.codingSchemeVersion = value;
                }

                /**
                 * Gets the value of the textDescription property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTextDescription() {
                    return textDescription;
                }

                /**
                 * Sets the value of the textDescription property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTextDescription(String value) {
                    this.textDescription = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="lowValue" type="{http://www.w3.org/2001/XMLSchema}byte"/>
             *         &lt;element name="lowUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="highUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "lowValue",
                "lowUnit",
                "highUnit"
            })
            public static class DoseQuantity {

                protected byte lowValue;
                @XmlElement(required = true)
                protected String lowUnit;
                @XmlElement(required = true)
                protected String highUnit;

                /**
                 * Gets the value of the lowValue property.
                 * 
                 */
                public byte getLowValue() {
                    return lowValue;
                }

                /**
                 * Sets the value of the lowValue property.
                 * 
                 */
                public void setLowValue(byte value) {
                    this.lowValue = value;
                }

                /**
                 * Gets the value of the lowUnit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLowUnit() {
                    return lowUnit;
                }

                /**
                 * Sets the value of the lowUnit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLowUnit(String value) {
                    this.lowUnit = value;
                }

                /**
                 * Gets the value of the highUnit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHighUnit() {
                    return highUnit;
                }

                /**
                 * Sets the value of the highUnit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHighUnit(String value) {
                    this.highUnit = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}byte"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "code",
                "codingSchemeName",
                "codingSchemeVersion",
                "textDescription"
            })
            public static class Duration {

                @XmlElement(required = true)
                protected String code;
                @XmlElement(required = true)
                protected String codingSchemeName;
                @XmlElement(required = true)
                protected String codingSchemeVersion;
                protected byte textDescription;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the codingSchemeName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodingSchemeName() {
                    return codingSchemeName;
                }

                /**
                 * Sets the value of the codingSchemeName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodingSchemeName(String value) {
                    this.codingSchemeName = value;
                }

                /**
                 * Gets the value of the codingSchemeVersion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodingSchemeVersion() {
                    return codingSchemeVersion;
                }

                /**
                 * Sets the value of the codingSchemeVersion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodingSchemeVersion(String value) {
                    this.codingSchemeVersion = value;
                }

                /**
                 * Gets the value of the textDescription property.
                 * 
                 */
                public byte getTextDescription() {
                    return textDescription;
                }

                /**
                 * Sets the value of the textDescription property.
                 * 
                 */
                public void setTextDescription(byte value) {
                    this.textDescription = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "code",
                "codingSchemeName",
                "codingSchemeVersion",
                "textDescription"
            })
            public static class Frequency {

                @XmlElement(required = true)
                protected String code;
                @XmlElement(required = true)
                protected String codingSchemeName;
                @XmlElement(required = true)
                protected String codingSchemeVersion;
                @XmlElement(required = true)
                protected String textDescription;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the codingSchemeName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodingSchemeName() {
                    return codingSchemeName;
                }

                /**
                 * Sets the value of the codingSchemeName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodingSchemeName(String value) {
                    this.codingSchemeName = value;
                }

                /**
                 * Gets the value of the codingSchemeVersion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodingSchemeVersion() {
                    return codingSchemeVersion;
                }

                /**
                 * Sets the value of the codingSchemeVersion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodingSchemeVersion(String value) {
                    this.codingSchemeVersion = value;
                }

                /**
                 * Gets the value of the textDescription property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTextDescription() {
                    return textDescription;
                }

                /**
                 * Sets the value of the textDescription property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTextDescription(String value) {
                    this.textDescription = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "code",
                "codingSchemeName",
                "codingSchemeVersion",
                "textDescription"
            })
            public static class MedicationItemStatus {

                @XmlElement(required = true)
                protected String code;
                @XmlElement(required = true)
                protected String codingSchemeName;
                @XmlElement(required = true)
                protected String codingSchemeVersion;
                @XmlElement(required = true)
                protected String textDescription;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the codingSchemeName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodingSchemeName() {
                    return codingSchemeName;
                }

                /**
                 * Sets the value of the codingSchemeName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodingSchemeName(String value) {
                    this.codingSchemeName = value;
                }

                /**
                 * Gets the value of the codingSchemeVersion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodingSchemeVersion() {
                    return codingSchemeVersion;
                }

                /**
                 * Sets the value of the codingSchemeVersion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodingSchemeVersion(String value) {
                    this.codingSchemeVersion = value;
                }

                /**
                 * Gets the value of the textDescription property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTextDescription() {
                    return textDescription;
                }

                /**
                 * Sets the value of the textDescription property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTextDescription(String value) {
                    this.textDescription = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}long"/>
             *         &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "code",
                "codingSchemeName",
                "codingSchemeVersion",
                "textDescription"
            })
            public static class MedicationName {

                protected String code;
                @XmlElement(required = true)
                protected String codingSchemeName;
                @XmlElement(required = true)
                protected String codingSchemeVersion;
                @XmlElement(required = true)
                protected String textDescription;

                /**
                 * Gets the value of the code property.
                 * 
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the codingSchemeName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodingSchemeName() {
                    return codingSchemeName;
                }

                /**
                 * Sets the value of the codingSchemeName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodingSchemeName(String value) {
                    this.codingSchemeName = value;
                }

                /**
                 * Gets the value of the codingSchemeVersion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodingSchemeVersion() {
                    return codingSchemeVersion;
                }

                /**
                 * Sets the value of the codingSchemeVersion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodingSchemeVersion(String value) {
                    this.codingSchemeVersion = value;
                }

                /**
                 * Gets the value of the textDescription property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTextDescription() {
                    return textDescription;
                }

                /**
                 * Sets the value of the textDescription property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTextDescription(String value) {
                    this.textDescription = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "code",
                "codingSchemeName",
                "codingSchemeVersion",
                "textDescription"
            })
            public static class ReasonForChanges {

                @XmlElement(required = true)
                protected String code;
                @XmlElement(required = true)
                protected String codingSchemeName;
                @XmlElement(required = true)
                protected String codingSchemeVersion;
                @XmlElement(required = true)
                protected String textDescription;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the codingSchemeName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodingSchemeName() {
                    return codingSchemeName;
                }

                /**
                 * Sets the value of the codingSchemeName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodingSchemeName(String value) {
                    this.codingSchemeName = value;
                }

                /**
                 * Gets the value of the codingSchemeVersion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodingSchemeVersion() {
                    return codingSchemeVersion;
                }

                /**
                 * Sets the value of the codingSchemeVersion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodingSchemeVersion(String value) {
                    this.codingSchemeVersion = value;
                }

                /**
                 * Gets the value of the textDescription property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTextDescription() {
                    return textDescription;
                }

                /**
                 * Sets the value of the textDescription property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTextDescription(String value) {
                    this.textDescription = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "code",
                "codingSchemeName",
                "codingSchemeVersion",
                "textDescription"
            })
            public static class ReasonForMedication {

                @XmlElement(required = true)
                protected String code;
                @XmlElement(required = true)
                protected String codingSchemeName;
                @XmlElement(required = true)
                protected String codingSchemeVersion;
                @XmlElement(required = true)
                protected String textDescription;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the codingSchemeName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodingSchemeName() {
                    return codingSchemeName;
                }

                /**
                 * Sets the value of the codingSchemeName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodingSchemeName(String value) {
                    this.codingSchemeName = value;
                }

                /**
                 * Gets the value of the codingSchemeVersion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodingSchemeVersion() {
                    return codingSchemeVersion;
                }

                /**
                 * Sets the value of the codingSchemeVersion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodingSchemeVersion(String value) {
                    this.codingSchemeVersion = value;
                }

                /**
                 * Gets the value of the textDescription property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTextDescription() {
                    return textDescription;
                }

                /**
                 * Sets the value of the textDescription property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTextDescription(String value) {
                    this.textDescription = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "code",
                "codingSchemeName",
                "codingSchemeVersion",
                "textDescription"
            })
            public static class RouteOfAdministration {

                @XmlElement(required = true)
                protected String code;
                @XmlElement(required = true)
                protected String codingSchemeName;
                @XmlElement(required = true)
                protected String codingSchemeVersion;
                @XmlElement(required = true)
                protected String textDescription;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the codingSchemeName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodingSchemeName() {
                    return codingSchemeName;
                }

                /**
                 * Sets the value of the codingSchemeName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodingSchemeName(String value) {
                    this.codingSchemeName = value;
                }

                /**
                 * Gets the value of the codingSchemeVersion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodingSchemeVersion() {
                    return codingSchemeVersion;
                }

                /**
                 * Sets the value of the codingSchemeVersion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodingSchemeVersion(String value) {
                    this.codingSchemeVersion = value;
                }

                /**
                 * Gets the value of the textDescription property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTextDescription() {
                    return textDescription;
                }

                /**
                 * Sets the value of the textDescription property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTextDescription(String value) {
                    this.textDescription = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "name"
        })
        public static class OrderedBy {

            @XmlElement(required = true)
            protected String id;
            @XmlElement(required = true)
            protected String name;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "code",
            "codingSchemeName",
            "codingSchemeVersion",
            "textDescription"
        })
        public static class OrderStatus {

            @XmlElement(required = true)
            protected String code;
            @XmlElement(required = true)
            protected String codingSchemeName;
            @XmlElement(required = true)
            protected String codingSchemeVersion;
            @XmlElement(required = true)
            protected String textDescription;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the codingSchemeName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodingSchemeName() {
                return codingSchemeName;
            }

            /**
             * Sets the value of the codingSchemeName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodingSchemeName(String value) {
                this.codingSchemeName = value;
            }

            /**
             * Gets the value of the codingSchemeVersion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodingSchemeVersion() {
                return codingSchemeVersion;
            }

            /**
             * Sets the value of the codingSchemeVersion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodingSchemeVersion(String value) {
                this.codingSchemeVersion = value;
            }

            /**
             * Gets the value of the textDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTextDescription() {
                return textDescription;
            }

            /**
             * Sets the value of the textDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTextDescription(String value) {
                this.textDescription = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "code",
            "codingSchemeName",
            "codingSchemeVersion",
            "textDescription"
        })
        public static class OrderType {

            @XmlElement(required = true)
            protected String code;
            @XmlElement(required = true)
            protected String codingSchemeName;
            @XmlElement(required = true)
            protected String codingSchemeVersion;
            @XmlElement(required = true)
            protected String textDescription;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the codingSchemeName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodingSchemeName() {
                return codingSchemeName;
            }

            /**
             * Sets the value of the codingSchemeName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodingSchemeName(String value) {
                this.codingSchemeName = value;
            }

            /**
             * Gets the value of the codingSchemeVersion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodingSchemeVersion() {
                return codingSchemeVersion;
            }

            /**
             * Sets the value of the codingSchemeVersion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodingSchemeVersion(String value) {
                this.codingSchemeVersion = value;
            }

            /**
             * Gets the value of the textDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTextDescription() {
                return textDescription;
            }

            /**
             * Sets the value of the textDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTextDescription(String value) {
                this.textDescription = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="codingSchemeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="codingSchemeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="textDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "code",
            "codingSchemeName",
            "codingSchemeVersion",
            "textDescription"
        })
        public static class ReasonForCancellation {

            @XmlElement(required = true)
            protected String code;
            @XmlElement(required = true)
            protected String codingSchemeName;
            @XmlElement(required = true)
            protected String codingSchemeVersion;
            @XmlElement(required = true)
            protected String textDescription;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the codingSchemeName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodingSchemeName() {
                return codingSchemeName;
            }

            /**
             * Sets the value of the codingSchemeName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodingSchemeName(String value) {
                this.codingSchemeName = value;
            }

            /**
             * Gets the value of the codingSchemeVersion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodingSchemeVersion() {
                return codingSchemeVersion;
            }

            /**
             * Sets the value of the codingSchemeVersion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodingSchemeVersion(String value) {
                this.codingSchemeVersion = value;
            }

            /**
             * Gets the value of the textDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTextDescription() {
                return textDescription;
            }

            /**
             * Sets the value of the textDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTextDescription(String value) {
                this.textDescription = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="identification">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="MRNNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="name">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="aliasName">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="contactDetails">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="address">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="streetLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="streetLine2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="streetLine3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="streetLine4" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="phone" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="type">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="HOME"/>
     *                                   &lt;enumeration value="MOBILE"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="phoneNumber">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="11112287"/>
     *                                   &lt;enumeration value="11111003 DAU"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="extensionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="countryOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="race" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="residencyStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="maritalStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="occupation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="VIPFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="VVIPFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="religion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="nextOfKin">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="relationship" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "identification",
        "name",
        "aliasName",
        "contactDetails",
        "dateOfBirth",
        "countryOfBirth",
        "gender",
        "emailAddress",
        "nationality",
        "race",
        "residencyStatus",
        "language",
        "maritalStatus",
        "occupation",
        "vipFlag",
        "vvipFlag",
        "religion",
        "nextOfKin"
    })
    public static class Patient {

        @XmlElement(required = true)
        protected PutOrderedMedications.Patient.Identification identification;
        @XmlElement(required = true)
        protected PutOrderedMedications.Patient.Name name;
        @XmlElement(required = true)
        protected PutOrderedMedications.Patient.AliasName aliasName;
        @XmlElement(required = true)
        protected PutOrderedMedications.Patient.ContactDetails contactDetails;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateOfBirth;
        @XmlElement(required = true)
        protected String countryOfBirth;
        @XmlElement(required = true)
        protected String gender;
        @XmlElement(required = true)
        protected String emailAddress;
        @XmlElement(required = true)
        protected String nationality;
        @XmlElement(required = true)
        protected String race;
        @XmlElement(required = true)
        protected String residencyStatus;
        @XmlElement(required = true)
        protected String language;
        @XmlElement(required = true)
        protected String maritalStatus;
        @XmlElement(required = true)
        protected String occupation;
        @XmlElement(name = "VIPFlag", required = true)
        protected String vipFlag;
        @XmlElement(name = "VVIPFlag", required = true)
        protected String vvipFlag;
        @XmlElement(required = true)
        protected String religion;
        @XmlElement(required = true)
        protected PutOrderedMedications.Patient.NextOfKin nextOfKin;

        /**
         * Gets the value of the identification property.
         * 
         * @return
         *     possible object is
         *     {@link PutOrderedMedications.Patient.Identification }
         *     
         */
        public PutOrderedMedications.Patient.Identification getIdentification() {
            return identification;
        }

        /**
         * Sets the value of the identification property.
         * 
         * @param value
         *     allowed object is
         *     {@link PutOrderedMedications.Patient.Identification }
         *     
         */
        public void setIdentification(PutOrderedMedications.Patient.Identification value) {
            this.identification = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link PutOrderedMedications.Patient.Name }
         *     
         */
        public PutOrderedMedications.Patient.Name getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link PutOrderedMedications.Patient.Name }
         *     
         */
        public void setName(PutOrderedMedications.Patient.Name value) {
            this.name = value;
        }

        /**
         * Gets the value of the aliasName property.
         * 
         * @return
         *     possible object is
         *     {@link PutOrderedMedications.Patient.AliasName }
         *     
         */
        public PutOrderedMedications.Patient.AliasName getAliasName() {
            return aliasName;
        }

        /**
         * Sets the value of the aliasName property.
         * 
         * @param value
         *     allowed object is
         *     {@link PutOrderedMedications.Patient.AliasName }
         *     
         */
        public void setAliasName(PutOrderedMedications.Patient.AliasName value) {
            this.aliasName = value;
        }

        /**
         * Gets the value of the contactDetails property.
         * 
         * @return
         *     possible object is
         *     {@link PutOrderedMedications.Patient.ContactDetails }
         *     
         */
        public PutOrderedMedications.Patient.ContactDetails getContactDetails() {
            return contactDetails;
        }

        /**
         * Sets the value of the contactDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link PutOrderedMedications.Patient.ContactDetails }
         *     
         */
        public void setContactDetails(PutOrderedMedications.Patient.ContactDetails value) {
            this.contactDetails = value;
        }

        /**
         * Gets the value of the dateOfBirth property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateOfBirth() {
            return dateOfBirth;
        }

        /**
         * Sets the value of the dateOfBirth property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateOfBirth(XMLGregorianCalendar value) {
            this.dateOfBirth = value;
        }

        /**
         * Gets the value of the countryOfBirth property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryOfBirth() {
            return countryOfBirth;
        }

        /**
         * Sets the value of the countryOfBirth property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryOfBirth(String value) {
            this.countryOfBirth = value;
        }

        /**
         * Gets the value of the gender property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGender() {
            return gender;
        }

        /**
         * Sets the value of the gender property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGender(String value) {
            this.gender = value;
        }

        /**
         * Gets the value of the emailAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmailAddress() {
            return emailAddress;
        }

        /**
         * Sets the value of the emailAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmailAddress(String value) {
            this.emailAddress = value;
        }

        /**
         * Gets the value of the nationality property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNationality() {
            return nationality;
        }

        /**
         * Sets the value of the nationality property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNationality(String value) {
            this.nationality = value;
        }

        /**
         * Gets the value of the race property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRace() {
            return race;
        }

        /**
         * Sets the value of the race property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRace(String value) {
            this.race = value;
        }

        /**
         * Gets the value of the residencyStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResidencyStatus() {
            return residencyStatus;
        }

        /**
         * Sets the value of the residencyStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResidencyStatus(String value) {
            this.residencyStatus = value;
        }

        /**
         * Gets the value of the language property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguage() {
            return language;
        }

        /**
         * Sets the value of the language property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguage(String value) {
            this.language = value;
        }

        /**
         * Gets the value of the maritalStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaritalStatus() {
            return maritalStatus;
        }

        /**
         * Sets the value of the maritalStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaritalStatus(String value) {
            this.maritalStatus = value;
        }

        /**
         * Gets the value of the occupation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOccupation() {
            return occupation;
        }

        /**
         * Sets the value of the occupation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOccupation(String value) {
            this.occupation = value;
        }

        /**
         * Gets the value of the vipFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVIPFlag() {
            return vipFlag;
        }

        /**
         * Sets the value of the vipFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVIPFlag(String value) {
            this.vipFlag = value;
        }

        /**
         * Gets the value of the vvipFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVVIPFlag() {
            return vvipFlag;
        }

        /**
         * Sets the value of the vvipFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVVIPFlag(String value) {
            this.vvipFlag = value;
        }

        /**
         * Gets the value of the religion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReligion() {
            return religion;
        }

        /**
         * Sets the value of the religion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReligion(String value) {
            this.religion = value;
        }

        /**
         * Gets the value of the nextOfKin property.
         * 
         * @return
         *     possible object is
         *     {@link PutOrderedMedications.Patient.NextOfKin }
         *     
         */
        public PutOrderedMedications.Patient.NextOfKin getNextOfKin() {
            return nextOfKin;
        }

        /**
         * Sets the value of the nextOfKin property.
         * 
         * @param value
         *     allowed object is
         *     {@link PutOrderedMedications.Patient.NextOfKin }
         *     
         */
        public void setNextOfKin(PutOrderedMedications.Patient.NextOfKin value) {
            this.nextOfKin = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value",
            "title"
        })
        public static class AliasName {

            @XmlElement(required = true)
            protected String value;
            @XmlElement(required = true)
            protected String title;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the title property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * Sets the value of the title property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="address">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="streetLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="streetLine2" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="streetLine3" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="streetLine4" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="phone" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="type">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="HOME"/>
         *                         &lt;enumeration value="MOBILE"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="phoneNumber">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="11112287"/>
         *                         &lt;enumeration value="11111003 DAU"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="extensionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "address",
            "phone"
        })
        public static class ContactDetails {

            @XmlElement(required = true)
            protected PutOrderedMedications.Patient.ContactDetails.Address address;
            protected List<PutOrderedMedications.Patient.ContactDetails.Phone> phone;

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link PutOrderedMedications.Patient.ContactDetails.Address }
             *     
             */
            public PutOrderedMedications.Patient.ContactDetails.Address getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link PutOrderedMedications.Patient.ContactDetails.Address }
             *     
             */
            public void setAddress(PutOrderedMedications.Patient.ContactDetails.Address value) {
                this.address = value;
            }

            /**
             * Gets the value of the phone property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the phone property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPhone().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PutOrderedMedications.Patient.ContactDetails.Phone }
             * 
             * 
             */
            public List<PutOrderedMedications.Patient.ContactDetails.Phone> getPhone() {
                if (phone == null) {
                    phone = new ArrayList<PutOrderedMedications.Patient.ContactDetails.Phone>();
                }
                return this.phone;
            }

            public void setPhone(List<PutOrderedMedications.Patient.ContactDetails.Phone> phone) {
                this.phone = phone;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="streetLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="streetLine2" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="streetLine3" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="streetLine4" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "type",
                "streetLine1",
                "streetLine2",
                "streetLine3",
                "streetLine4",
                "city",
                "country",
                "postalCode"
            })
            public static class Address {

                @XmlElement(required = true)
                protected String type;
                @XmlElement(required = true)
                protected String streetLine1;
                @XmlElement(required = true)
                protected String streetLine2;
                @XmlElement(required = true)
                protected String streetLine3;
                @XmlElement(required = true)
                protected String streetLine4;
                @XmlElement(required = true)
                protected String city;
                @XmlElement(required = true)
                protected String country;
                protected int postalCode;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the streetLine1 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStreetLine1() {
                    return streetLine1;
                }

                /**
                 * Sets the value of the streetLine1 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStreetLine1(String value) {
                    this.streetLine1 = value;
                }

                /**
                 * Gets the value of the streetLine2 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStreetLine2() {
                    return streetLine2;
                }

                /**
                 * Sets the value of the streetLine2 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStreetLine2(String value) {
                    this.streetLine2 = value;
                }

                /**
                 * Gets the value of the streetLine3 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStreetLine3() {
                    return streetLine3;
                }

                /**
                 * Sets the value of the streetLine3 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStreetLine3(String value) {
                    this.streetLine3 = value;
                }

                /**
                 * Gets the value of the streetLine4 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStreetLine4() {
                    return streetLine4;
                }

                /**
                 * Sets the value of the streetLine4 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStreetLine4(String value) {
                    this.streetLine4 = value;
                }

                /**
                 * Gets the value of the city property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCity() {
                    return city;
                }

                /**
                 * Sets the value of the city property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCity(String value) {
                    this.city = value;
                }

                /**
                 * Gets the value of the country property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCountry() {
                    return country;
                }

                /**
                 * Sets the value of the country property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCountry(String value) {
                    this.country = value;
                }

                /**
                 * Gets the value of the postalCode property.
                 * 
                 */
                public int getPostalCode() {
                    return postalCode;
                }

                /**
                 * Sets the value of the postalCode property.
                 * 
                 */
                public void setPostalCode(int value) {
                    this.postalCode = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="type">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="HOME"/>
             *               &lt;enumeration value="MOBILE"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="phoneNumber">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="11112287"/>
             *               &lt;enumeration value="11111003 DAU"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="extensionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "type",
                "countryCode",
                "areaCode",
                "phoneNumber",
                "extensionNumber"
            })
            public static class Phone {

                @XmlElement(required = true)
                protected String type;
                @XmlElement(required = true)
                protected String countryCode;
                @XmlElement(required = true)
                protected String areaCode;
                @XmlElement(required = true)
                protected String phoneNumber;
                @XmlElement(required = true)
                protected String extensionNumber;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the countryCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCountryCode() {
                    return countryCode;
                }

                /**
                 * Sets the value of the countryCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCountryCode(String value) {
                    this.countryCode = value;
                }

                /**
                 * Gets the value of the areaCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAreaCode() {
                    return areaCode;
                }

                /**
                 * Sets the value of the areaCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAreaCode(String value) {
                    this.areaCode = value;
                }

                /**
                 * Gets the value of the phoneNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPhoneNumber() {
                    return phoneNumber;
                }

                /**
                 * Sets the value of the phoneNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPhoneNumber(String value) {
                    this.phoneNumber = value;
                }

                /**
                 * Gets the value of the extensionNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExtensionNumber() {
                    return extensionNumber;
                }

                /**
                 * Sets the value of the extensionNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExtensionNumber(String value) {
                    this.extensionNumber = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="MRNNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "mrnNumber",
            "type"
        })
        public static class Identification {

            @XmlElement(required = true)
            protected String id;
            @XmlElement(name = "MRNNumber", required = true)
            protected String mrnNumber;
            @XmlElement(required = true)
            protected String type;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the mrnNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMRNNumber() {
                return mrnNumber;
            }

            /**
             * Sets the value of the mrnNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMRNNumber(String value) {
                this.mrnNumber = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value",
            "title"
        })
        public static class Name {

            @XmlElement(required = true)
            protected String value;
            @XmlElement(required = true)
            protected String title;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the title property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * Sets the value of the title property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="relationship" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "phone",
            "relationship",
            "email"
        })
        public static class NextOfKin {

            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected String phone;
            @XmlElement(required = true)
            protected String relationship;
            @XmlElement(required = true)
            protected String email;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the phone property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhone() {
                return phone;
            }

            /**
             * Sets the value of the phone property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPhone(String value) {
                this.phone = value;
            }

            /**
             * Gets the value of the relationship property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRelationship() {
                return relationship;
            }

            /**
             * Sets the value of the relationship property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRelationship(String value) {
                this.relationship = value;
            }

            /**
             * Gets the value of the email property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmail() {
                return email;
            }

            /**
             * Sets the value of the email property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmail(String value) {
                this.email = value;
            }

        }

    }

}
