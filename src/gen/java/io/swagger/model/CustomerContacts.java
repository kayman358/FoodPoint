/*
 * Foodzone API Specification
 * For the love of food
 *
 * OpenAPI spec version: 1.0.0
 * Contact: dev@foodzone.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * CustomerContacts
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public class CustomerContacts   {
  @JsonProperty("customerId")
  private long customerId = 0;

  @JsonProperty("customerAddress")
  private String customerAddress = null;

  @JsonProperty("id")
  private long id = 0;

  @JsonProperty("creationDate")
  private Date creationDate = null;

  @JsonProperty("modificationDate")
  private Date modificationDate = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("mainContact")
  private Boolean mainContact = false;

  public CustomerContacts customerId(long customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * customer id of a customer's secondary contacts
   * @return customerId
  **/
  @JsonProperty("customerId")
  @ApiModelProperty(required = true, value = "customer id of a customer's secondary contacts")
  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }

  public CustomerContacts customerAddress(String customerAddress) {
    this.customerAddress = customerAddress;
    return this;
  }

   /**
   * Secondary address of a customer
   * @return customerAddress
  **/
  @JsonProperty("customerAddress")
  @ApiModelProperty(required = true, value = "Secondary address of a customer")
  public String getCustomerAddress() {
    return customerAddress;
  }

  public void setCustomerAddress(String customerAddress) {
    this.customerAddress = customerAddress;
  }

  public CustomerContacts id(long id) {
    this.id = id;
    return this;
  }

   /**
   * id of a customer's secondary contacts
   * @return id
  **/
  @JsonProperty("id")
  @ApiModelProperty(value = "id of a customer's secondary contacts")
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public CustomerContacts creationDate(Date creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Date when the contact was created
   * @return creationDate
  **/
  @JsonProperty("creationDate")
  @ApiModelProperty(value = "Date when the contact was created")
  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  public CustomerContacts modificationDate(Date modificationDate) {
    this.modificationDate = modificationDate;
    return this;
  }

   /**
   * Date when the contact was modified
   * @return modificationDate
  **/
  @JsonProperty("modificationDate")
  @ApiModelProperty(value = "Date when the contact was modified")
  public Date getModificationDate() {
    return modificationDate;
  }

  public void setModificationDate(Date modificationDate) {
    this.modificationDate = modificationDate;
  }

  public CustomerContacts phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number added to the customer's secondary contacts
   * @return phoneNumber
  **/
  @JsonProperty("phoneNumber")
  @ApiModelProperty(required = true, value = "Phone number added to the customer's secondary contacts")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public CustomerContacts mainContact(Boolean mainContact) {
    this.mainContact = mainContact;
    return this;
  }

   /**
   * The main contact activation for any secondary contact
   * @return mainContact
  **/
  @JsonProperty("mainContact")
  @ApiModelProperty(required = true, value = "The main contact activation for any secondary contact")
  public Boolean getMainContact() {
    return mainContact;
  }

  public void setMainContact(Boolean mainContact) {
    this.mainContact = mainContact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerContacts customerContacts = (CustomerContacts) o;
    return Objects.equals(this.customerId, customerContacts.customerId) &&
        Objects.equals(this.customerAddress, customerContacts.customerAddress) &&
        Objects.equals(this.id, customerContacts.id) &&
        Objects.equals(this.creationDate, customerContacts.creationDate) &&
        Objects.equals(this.modificationDate, customerContacts.modificationDate) &&
        Objects.equals(this.phoneNumber, customerContacts.phoneNumber) &&
        Objects.equals(this.mainContact, customerContacts.mainContact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, customerAddress, id, creationDate, modificationDate, phoneNumber, mainContact);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerContacts {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerAddress: ").append(toIndentedString(customerAddress)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    mainContact: ").append(toIndentedString(mainContact)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

