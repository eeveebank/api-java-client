/**
 * Onfido API
 * The Onfido API is used to submit check requests.
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.onfido.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.onfido.models.ReportType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * ReportTypeGroup
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-08T15:56:57.777Z")
public class ReportTypeGroup   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("group_only")
  private Boolean groupOnly = null;

  @SerializedName("report_types")
  private List<ReportType> reportTypes = new ArrayList<ReportType>();

  public ReportTypeGroup id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ReportTypeGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ReportTypeGroup groupOnly(Boolean groupOnly) {
    this.groupOnly = groupOnly;
    return this;
  }

   /**
   * Get groupOnly
   * @return groupOnly
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getGroupOnly() {
    return groupOnly;
  }

  public void setGroupOnly(Boolean groupOnly) {
    this.groupOnly = groupOnly;
  }

  public ReportTypeGroup reportTypes(List<ReportType> reportTypes) {
    this.reportTypes = reportTypes;
    return this;
  }

  public ReportTypeGroup addReportTypesItem(ReportType reportTypesItem) {
    this.reportTypes.add(reportTypesItem);
    return this;
  }

   /**
   * Get reportTypes
   * @return reportTypes
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ReportType> getReportTypes() {
    return reportTypes;
  }

  public void setReportTypes(List<ReportType> reportTypes) {
    this.reportTypes = reportTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportTypeGroup reportTypeGroup = (ReportTypeGroup) o;
    return Objects.equals(this.id, reportTypeGroup.id) &&
        Objects.equals(this.name, reportTypeGroup.name) &&
        Objects.equals(this.groupOnly, reportTypeGroup.groupOnly) &&
        Objects.equals(this.reportTypes, reportTypeGroup.reportTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, groupOnly, reportTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportTypeGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    groupOnly: ").append(toIndentedString(groupOnly)).append("\n");
    sb.append("    reportTypes: ").append(toIndentedString(reportTypes)).append("\n");
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

