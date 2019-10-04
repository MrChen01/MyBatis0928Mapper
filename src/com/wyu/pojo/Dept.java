package com.wyu.pojo;

public class Dept {
    private  double ID;
    private  String name;
    private String remark;

    @Override
    public String toString() {
        return "Dept{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public double getID() {
        return ID;
    }

    public void setID(double ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Dept() {
    }


//    create table `Dept` (
//            `ID` double ,
//            `name` varchar (90),
//	`remark` varchar (300)
//);
}
