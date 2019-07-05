package uml.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela POSTS
 * @generated
 */
@Entity
@Table(name = "\"POSTS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("uml.entity.posts")
public class posts implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "title", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String title;

  /**
  * @generated
  */
  @Column(name = "content", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String content;

  /**
  * @generated
  */
  @Column(name = "text", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String text;

  /**
   * Construtor
   * @generated
   */
  public posts(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public posts setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém title
   * return title
   * @generated
   */
  
  public java.lang.String getTitle(){
    return this.title;
  }

  /**
   * Define title
   * @param title title
   * @generated
   */
  public posts setTitle(java.lang.String title){
    this.title = title;
    return this;
  }

  /**
   * Obtém content
   * return content
   * @generated
   */
  
  public java.lang.String getContent(){
    return this.content;
  }

  /**
   * Define content
   * @param content content
   * @generated
   */
  public posts setContent(java.lang.String content){
    this.content = content;
    return this;
  }

  /**
   * Obtém text
   * return text
   * @generated
   */
  
  public java.lang.String getText(){
    return this.text;
  }

  /**
   * Define text
   * @param text text
   * @generated
   */
  public posts setText(java.lang.String text){
    this.text = text;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    posts object = (posts)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
