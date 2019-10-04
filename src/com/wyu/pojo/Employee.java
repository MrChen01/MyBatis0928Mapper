package com.wyu.pojo;

public class Employee {

    private int id;
    private int dept_id;
    private int job_id;
    private String name;

//            `id` int(11) NOT NULL AUTO_INCREMENT,
//  `dept_id` int(11) NOT NULL,
//  `job_id` int(11) NOT NULL,
//  `name` varchar(20) NOT NULL,
//  `card_id` varchar(18) NOT NULL,
//  `address` varchar(50) NOT NULL,
//  `post_code` varchar(50) DEFAULT NULL,
//  `tel` varchar(16) DEFAULT NULL,
//  `phone` varchar(11) NOT NULL,
//  `qq_num` varchar(10) DEFAULT NULL,
//  `email` varchar(50) NOT NULL,
//  `sex` int(11) NOT NULL DEFAULT '1',
//            `party` varchar(10) DEFAULT NULL,
//  `birthday` datetime DEFAULT NULL,
//            `race` varchar(100) DEFAULT NULL,
//  `education` varchar(10) DEFAULT NULL,
//  `speciality` varchar(20) DEFAULT NULL,
//  `hobby` varchar(100) DEFAULT NULL,
//  `remark` varchar(500) DEFAULT NULL,
//  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
//    PRIMARY KEY (`id`) USING BTREE,
//    KEY `FK_EMP_DEPT` (`dept_id`) USING BTREE,
//    KEY `FK_EMP_JOB` (`job_id`) USING BTREE,
//    CONSTRAINT `FK_EMP_DEPT` FOREIGN KEY (`dept_id`) REFERENCES `dept` (`ID`),
//    CONSTRAINT `FK_EMP_JOB` FOREIGN KEY (`job_id`) REFERENCES `job` (`ID`)
//            ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
}
