/*
SQLyog Enterprise Trial - MySQL GUI v7.11 
MySQL - 5.0.22-community-nt : Database - crime
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`crime` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `crime`;

/*Table structure for table `crecd` */

DROP TABLE IF EXISTS `crecd`;

CREATE TABLE `crecd` (
  `firno` int(10) NOT NULL auto_increment,
  `cname` varchar(100) default NULL,
  `cage` varchar(100) default NULL,
  `cadd` varchar(100) default NULL,
  `filename` varchar(500) default NULL,
  `status` varchar(100) default 'Pending',
  PRIMARY KEY  (`firno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `crecd` */

insert  into `crecd`(`firno`,`cname`,`cage`,`cadd`,`filename`,`status`) values (1,'as','23','sds','img89.png','Approved'),(2,'as','23','sds','image1.png','Approved'),(3,'a','1','as','Dataset.xlsx','Pending'),(4,'a','1','as','CSE 2019.xlsx','Pending'),(5,'sekar','12','26,2nd floor,kota sreenivasaya charities ramanuja kudam building,T.nagar,chennai 6000 017 tamil nadu','A Secure Data Forwarding In Multiple.docx','Approved'),(6,'a','23','asd','Enabling identity-based integrity auditing and data sharing with sensitive information hiding for secure cloud storage.docx','Pending');

/*Table structure for table `jaireg` */

DROP TABLE IF EXISTS `jaireg`;

CREATE TABLE `jaireg` (
  `jaid` varchar(10) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) default NULL,
  `gender` varchar(100) default NULL,
  `stat` varchar(100) NOT NULL,
  `email` varchar(100) default NULL,
  `phno` varchar(100) default NULL,
  `otp1` varchar(100) default NULL,
  PRIMARY KEY  (`jaid`,`username`,`stat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `jaireg` */

insert  into `jaireg`(`jaid`,`username`,`password`,`gender`,`stat`,`email`,`phno`,`otp1`) values ('','anbu','asdf','Female','A1 Jailer','chennai.java@pantechmail.com','9876543212',NULL);

/*Table structure for table `newregister` */

DROP TABLE IF EXISTS `newregister`;

CREATE TABLE `newregister` (
  `poid` varchar(10) NOT NULL,
  `username` varchar(50) NOT NULL default '',
  `password` varchar(50) default NULL,
  `gender` varchar(50) default NULL,
  `stat` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL default '',
  `phno` varchar(100) default NULL,
  `otp1` varchar(100) default NULL,
  PRIMARY KEY  (`poid`,`stat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `newregister` */

insert  into `newregister`(`poid`,`username`,`password`,`gender`,`stat`,`email`,`phno`,`otp1`) values ('','arasi','asdf','Male','A1 Station','chennai.java@pantechmail.com','9876543212','JgEEdA'),('146','anbu','anbu','Female','A1 Station','chennai.java@pantechmail.com','9176434021','ZdBhpF');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
