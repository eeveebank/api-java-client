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
import com.onfido.models.Webhook;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * WebhooksList
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-27T17:09:58.121Z")
public class WebhooksList   {
  @SerializedName("webhooks")
  private List<Webhook> webhooks = new ArrayList<Webhook>();

  public WebhooksList webhooks(List<Webhook> webhooks) {
    this.webhooks = webhooks;
    return this;
  }

  public WebhooksList addWebhooksItem(Webhook webhooksItem) {
    this.webhooks.add(webhooksItem);
    return this;
  }

   /**
   * Get webhooks
   * @return webhooks
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Webhook> getWebhooks() {
    return webhooks;
  }

  public void setWebhooks(List<Webhook> webhooks) {
    this.webhooks = webhooks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhooksList webhooksList = (WebhooksList) o;
    return Objects.equals(this.webhooks, webhooksList.webhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhooks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhooksList {\n");
    
    sb.append("    webhooks: ").append(toIndentedString(webhooks)).append("\n");
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
