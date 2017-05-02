package com.phone.dto;

/**
 * Created by 凯哥 on 2017/5/2.
 * 联系人管理类
 */
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
import groovy.util.logging.Commons;
import org.springframework.test.annotation.Commit;

@ExtensionAttribute(disable=true)
@Table(name = "phonelist")
public class Phonellist extends BaseDTO {
     @Id
     @GeneratedValue(
             generator = "IDENTITY"
     )
     @Column
      private Long id;
    @Column
      private String name;
    @Column
      private Long phone;
    @Column
      private String email;
    @Column
      private String parea;
    @Column
      private String sex;


     public void setId(Long id){
         this.id = id;
     }

     public Long getId(){
         return id;
     }

     public void setName(String name){
         this.name = name;
     }

     public String getName(){
         return name;
     }

     public void setPhone(Long phone){
         this.phone = phone;
     }

     public Long getPhone(){
         return phone;
     }

     public void setEmail(String email){
         this.email = email;
     }

     public String getEmail(){
         return email;
     }

     public void setParea(String parea){
         this.parea = parea;
     }

     public String getParea(){
         return parea;
     }

     public void setSex(String sex){
         this.sex = sex;
     }

     public String getSex(){
         return sex;
     }

     }
