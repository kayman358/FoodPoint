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


/**
 * Restaurants
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public class Restaurants   {
  @JsonProperty("id")
  private long id = 0;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("contact_number")
  private String contactNumber = null;

  @JsonProperty("upper_limit")
  private double upperLimit = 0;

  @JsonProperty("lower_limit")
  private double lowerLimit = 0;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("tags")
  private String tags = null;

  @JsonProperty("recommendation")
  private long recommendation = 0;

  @JsonProperty("likes")
  private long likes = 0;

  @JsonProperty("ratings")
  private double ratings = 0;

  public Restaurants id(long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  @ApiModelProperty(value = "")
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Restaurants name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Restaurants address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @JsonProperty("address")
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Restaurants contactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
    return this;
  }

   /**
   * Get contactNumber
   * @return contactNumber
  **/
  @JsonProperty("contact_number")
  @ApiModelProperty(value = "")
  public String getContactNumber() {
    return contactNumber;
  }

  public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
  }

  public Restaurants upperLimit(long upperLimit) {
    this.upperLimit = upperLimit;
    return this;
  }

   /**
   * Get upperLimit
   * @return upperLimit
  **/
  @JsonProperty("upper_limit")
  @ApiModelProperty(value = "")
  public double getUpperLimit() {
    return upperLimit;
  }

  public void setUpperLimit(long upperLimit) {
    this.upperLimit = upperLimit;
  }

  public Restaurants lowerLimit(long lowerLimit) {
    this.lowerLimit = lowerLimit;
    return this;
  }

   /**
   * Get lowerLimit
   * @return lowerLimit
  **/
  @JsonProperty("lower_limit")
  @ApiModelProperty(required = true, value = "")
  public double getLowerLimit() {
    return lowerLimit;
  }

  public void setLowerLimit(long lowerLimit) {
    this.lowerLimit = lowerLimit;
  }

  public Restaurants description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Restaurants tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @JsonProperty("tags")
  @ApiModelProperty(value = "")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public Restaurants recommendation(long recommendation) {
    this.recommendation = recommendation;
    return this;
  }

   /**
   * Get recommendation
   * @return recommendation
  **/
  @JsonProperty("recommendation")
  @ApiModelProperty(value = "")
  public long getRecommendation() {
    return recommendation;
  }

  public void setRecommendation(long recommendation) {
    this.recommendation = recommendation;
  }

  public Restaurants likes(long likes) {
    this.likes = likes;
    return this;
  }

   /**
   * Get likes
   * @return likes
  **/
  @JsonProperty("likes")
  @ApiModelProperty(value = "")
  public long getLikes() {
    return likes;
  }

  public void setLikes(long likes) {
    this.likes = likes;
  }

  public Restaurants ratings(long ratings) {
    this.ratings = ratings;
    return this;
  }

   /**
   * Get ratings
   * @return ratings
  **/
  @JsonProperty("ratings")
  @ApiModelProperty(value = "")
  public double getRatings() {
    return ratings;
  }

  public void setRatings(long ratings) {
    this.ratings = ratings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Restaurants restaurants = (Restaurants) o;
    return Objects.equals(this.id, restaurants.id) &&
        Objects.equals(this.name, restaurants.name) &&
        Objects.equals(this.address, restaurants.address) &&
        Objects.equals(this.contactNumber, restaurants.contactNumber) &&
        Objects.equals(this.upperLimit, restaurants.upperLimit) &&
        Objects.equals(this.lowerLimit, restaurants.lowerLimit) &&
        Objects.equals(this.description, restaurants.description) &&
        Objects.equals(this.tags, restaurants.tags) &&
        Objects.equals(this.recommendation, restaurants.recommendation) &&
        Objects.equals(this.likes, restaurants.likes) &&
        Objects.equals(this.ratings, restaurants.ratings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, contactNumber, upperLimit, lowerLimit, description, tags, recommendation, likes, ratings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Restaurants {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contactNumber: ").append(toIndentedString(contactNumber)).append("\n");
    sb.append("    upperLimit: ").append(toIndentedString(upperLimit)).append("\n");
    sb.append("    lowerLimit: ").append(toIndentedString(lowerLimit)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
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

