package com.subhajit.SbOpenApi.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Student
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-28T00:15:47.087365100+05:30[Asia/Calcutta]")
public class Student   {
  @JsonProperty("stduentId")
  private Long stduentId;

  @JsonProperty("studentName")
  private String studentName;

  public Student stduentId(Long stduentId) {
    this.stduentId = stduentId;
    return this;
  }

  /**
   * Get stduentId
   * @return stduentId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getStduentId() {
    return stduentId;
  }

  public void setStduentId(Long stduentId) {
    this.stduentId = stduentId;
  }

  public Student studentName(String studentName) {
    this.studentName = studentName;
    return this;
  }

  /**
   * Get studentName
   * @return studentName
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return Objects.equals(this.stduentId, student.stduentId) &&
        Objects.equals(this.studentName, student.studentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stduentId, studentName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Student {\n");
    
    sb.append("    stduentId: ").append(toIndentedString(stduentId)).append("\n");
    sb.append("    studentName: ").append(toIndentedString(studentName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

