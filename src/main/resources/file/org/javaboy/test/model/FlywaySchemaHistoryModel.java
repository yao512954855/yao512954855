package org.javaboy.test.model;

import java.util.Date;

public class FlywaySchemaHistory{

                /**
                * 
                */
                private Integer installedRank;
                /**
                * 
                */
                private String version;
                /**
                * 
                */
                private String description;
                /**
                * 
                */
                private String type;
                /**
                * 
                */
                private String script;
                /**
                * 
                */
                private Integer checksum;
                /**
                * 
                */
                private String installedBy;
                /**
                * 
                */
                private Integer executionTime;
                /**
                * 
                */
                private Boolean success;
                public Integer getInstalledRank(){
                return installedRank;
                }
                public void setInstalledRank(Integer installedRank){
                this.installedRank=installedRank;
                }
                public String getVersion(){
                    return version;
                }
                public void setVersion(String version){
                    this.version=version;
                }
                public String getDescription(){
                    return description;
                }
                public void setDescription(String description){
                    this.description=description;
                }
                public String getType(){
                    return type;
                }
                public void setType(String type){
                    this.type=type;
                }
                public String getScript(){
                    return script;
                }
                public void setScript(String script){
                    this.script=script;
                }
                public Integer getChecksum(){
                return checksum;
                }
                public void setChecksum(Integer checksum){
                this.checksum=checksum;
                }
                public String getInstalledBy(){
                    return installedBy;
                }
                public void setInstalledBy(String installedBy){
                    this.installedBy=installedBy;
                }
                public Integer getExecutionTime(){
                return executionTime;
                }
                public void setExecutionTime(Integer executionTime){
                this.executionTime=executionTime;
                }
                public Boolean getSuccess(){
                return success;
                }
                public void setSuccess(Boolean success){
                this.success=success;
                }
}