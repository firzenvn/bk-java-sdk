/*
 * Baokim CDN API Documentation
 * Manage & serve Baokim static files
 *
 * OpenAPI spec version: 1.0.0
 * Contact: developer@baokim.vn
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.InlineResponse200DataFilePaths;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse200Data
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-02T10:34:24.815Z[GMT]")
public class InlineResponse200Data {
  @SerializedName("filePaths")
  private List<InlineResponse200DataFilePaths> filePaths = null;

  public InlineResponse200Data filePaths(List<InlineResponse200DataFilePaths> filePaths) {
    this.filePaths = filePaths;
    return this;
  }

  public InlineResponse200Data addFilePathsItem(InlineResponse200DataFilePaths filePathsItem) {
    if (this.filePaths == null) {
      this.filePaths = new ArrayList<InlineResponse200DataFilePaths>();
    }
    this.filePaths.add(filePathsItem);
    return this;
  }

   /**
   * Get filePaths
   * @return filePaths
  **/
  @Schema(description = "")
  public List<InlineResponse200DataFilePaths> getFilePaths() {
    return filePaths;
  }

  public void setFilePaths(List<InlineResponse200DataFilePaths> filePaths) {
    this.filePaths = filePaths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Data inlineResponse200Data = (InlineResponse200Data) o;
    return Objects.equals(this.filePaths, inlineResponse200Data.filePaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filePaths);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Data {\n");
    
    sb.append("    filePaths: ").append(toIndentedString(filePaths)).append("\n");
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
