package org.javaboy.test.model;

import java.util.Date;

public class Joblevel{

                /**
                * 
                */
                private Integer id;
                /**
                * 职称名称
                */
                private String name;
                /**
                * 
                */
                private Boolean enabled;
                public Integer getId(){
                return id;
                }
                public void setId(Integer id){
                this.id=id;
                }
                public String getName(){
                    return name;
                }
                public void setName(String name){
                    this.name=name;
                }
                public Boolean getEnabled(){
                return enabled;
                }
                public void setEnabled(Boolean enabled){
                this.enabled=enabled;
                }
}