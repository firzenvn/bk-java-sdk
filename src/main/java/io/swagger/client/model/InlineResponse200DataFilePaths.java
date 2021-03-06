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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse200DataFilePaths
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-02T10:34:24.815Z[GMT]")
public class InlineResponse200DataFilePaths {
  @SerializedName("$fileName1")
  private String $fileName1 = null;

  @SerializedName("$fileName2")
  private String $fileName2 = null;

  public InlineResponse200DataFilePaths $fileName1(String $fileName1) {
    this.$fileName1 = $fileName1;
    return this;
  }

   /**
   * Get $fileName1
   * @return $fileName1
  **/
  @Schema(example = "protected/origin/social_id/1620290635.download.jpeg", description = "")
  public String get$FileName1() {
    return $fileName1;
  }

  public void set$FileName1(String $fileName1) {
    this.$fileName1 = $fileName1;
  }

  public InlineResponse200DataFilePaths $fileName2(String $fileName2) {
    this.$fileName2 = $fileName2;
    return this;
  }

   /**
   * Get $fileName2
   * @return $fileName2
  **/
  @Schema(example = "protected/origin/social_id/1620290635.logo.png", description = "")
  public String get$FileName2() {
    return $fileName2;
  }

  public void set$FileName2(String $fileName2) {
    this.$fileName2 = $fileName2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200DataFilePaths inlineResponse200DataFilePaths = (InlineResponse200DataFilePaths) o;
    return Objects.equals(this.$fileName1, inlineResponse200DataFilePaths.$fileName1) &&
        Objects.equals(this.$fileName2, inlineResponse200DataFilePaths.$fileName2);
  }

  @Override
  public int hashCode() {
    return Objects.hash($fileName1, $fileName2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200DataFilePaths {\n");
    
    sb.append("    $fileName1: ").append(toIndentedString($fileName1)).append("\n");
    sb.append("    $fileName2: ").append(toIndentedString($fileName2)).append("\n");
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
