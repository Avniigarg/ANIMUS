package com.avnigarg.animus;


public class model {
    String name, sciname, type, photo, desc;
    model(){

    }
    public model(String name, String sciname, String type, String photo, String desc) {
        this.name = name;
        this.sciname = sciname;
        this.type = type;
        this.photo = photo;
        this.desc=desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSciname() {
        return sciname;
    }

    public void setSciname(String sciname) {
        this.sciname = sciname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}