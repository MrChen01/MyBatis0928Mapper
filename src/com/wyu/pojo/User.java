package com.wyu.pojo;

import java.io.Serializable;
import java.util.Date;

public class User  implements Serializable{
    private String number;
    private String password;
    private int status;
    private String phone;
    private Date timestamp;
    private String username;
    private String remark;

    public User() {
    }

    @Override
    public String
    toString() {
        return "User{" +
                "number='" + number + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", phone='" + phone + '\'' +
                ", timestamp=" + timestamp +
                ", username='" + username + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //    CREATE TABLE `user` (
//            `number` varchar(20) NOT NULL,
//  `password` varchar(16) NOT NULL,
//  `status` int(11) NOT NULL DEFAULT '1',
//            `phone` varchar(11) NOT NULL,
//  `createdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
//            `username` varchar(20) DEFAULT NULL,
//  `remark` varchar(255) DEFAULT NULL,
//    PRIMARY KEY (`number`) USING BTREE,
//    UNIQUE KEY `phone` (`phone`) USING BTREE
//) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
}
