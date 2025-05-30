/*
SQLyog - Free MySQL GUI v5.13
Host - 5.0.22-community-nt : Database - crime
*********************************************************************
Server version : 5.0.22-community-nt
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `crime`;

USE `crime`;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `crecd` */

DROP TABLE IF EXISTS `crecd`;

CREATE TABLE `crecd` (
  `firno` int(10) NOT NULL auto_increment,
  `cname` varchar(100) default NULL,
  `cage` varchar(100) default NULL,
  `cadd` varchar(100) default NULL,
  `cdate` date default NULL,
  `crime` varchar(100) default NULL,
  `filename` varchar(500) default NULL,
  `status` varchar(100) default 'Pending',
  PRIMARY KEY  (`firno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `crecd` */

insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (1,'Aaravind','23','chennai','2019-01-21','Robery','img89.png','Approved'),(2,'Babu','23','chennai','2018-11-21','Robery','image1.png','Approved'),(3,'Ram Mohan','31','Kilpauk','2018-11-11','Robery','Dataset.xlsx','Pending'),(4,'Ravi','32','Kilpauk','2019-01-21','Murder','CSE 2019.xlsx','Pending'),(5,'sekar','32','Kilpauk','2018-01-01','Murder','A Secure Data Forwarding In Multiple.docx','Approved'),(6,'Kannan','23','arani','2018-11-21','Murder','Enabling identity-based integrity auditing and data sharing with sensitive information hiding for secure cloud storage.docx','Pending'),(7,'Ram Varman','22','Avadi','0208-01-03','Murder','Enabling identity-based integrity auditing and data sharing with sensitive information hiding for secure cloud storage.docx','Pending'),(8,'Rohit','23','chennai','2019-01-02','Domestic Violence','Enabling identity-based integrity auditing and data sharing with sensitive information hiding for secure cloud storage.docx','Approved'),(9,'anbu','23','saidapet','2019-02-24','Murder','software & hardware specification.docx','Pending'),(10,'Vinoth','21','Guindy','2013-09-09','Robery','FIR-001.docx','Pending'),(101,'Ram','23','Annanager','2012-09-09','Domesric Violence','FIR-002.docx','Approved'),(102,'Asif','21','Annanager','2016-08-09','Murder','FIR-003.docx','Approved'),(103,'Dinesh','19','Annanager','2019-01-02','Murder','Dataset.xlsx','Pending'),(104,'Asraf','21','Annanager','2013-02-02','Robery','FIR-004.docx','Pending'),(105,'sekar','21','26,2nd floor,kota sreenivasaya charities ramanuja kudam building,T.nagar,chennai 6000 017 tamil nadu','2018-12-22','Robery','A Secure Data Forwarding In Multiple.docx','Approved'),(106,'Kala','23','Saidapet','2018-03-22','Corruption','Enabling identity-based integrity auditing and data sharing with sensitive information hiding for secure cloud storage.docx','Pending'),(110,'Ramesh','23','Annanager','2018-04-22','Drugs Trade','FIR-002.docx','Approved'),(112,'Asif Ali','22','Annanager','2018-08-12','Cyber Crime','FIR-003.docx','Approved'),(113,'Dennis','29','Annanager','2018-05-30','Dowry','Dataset.xlsx','Pending'),(114,'Ajay','21','Saidapet','2018-09-02','Corruption','FIR-004.docx','Pending'),(115,'sathish','32','T.nagar','2018-09-02','Corruption','Multiple.docx','Approved'),(116,'Mala','23','Saidapet','2018-09-02','Corruption','Enabling identity-based integrity auditing and data sharing with sensitive information hiding for secure cloud storage.docx','Pending'),(120,'Raj','24','Saidapet','2018-09-02','Drugs Trade','FIR-003.docx','Approved'),(121,'Khan','28','T.nager','2018-09-02','Drugs Trade','FIR-005.docx','Approved'),(123,'Danial','39','T.nager','2018-09-02','Cyber Crime','FIR-006.docx','Pending'),(124,'Akash','31','Saidapet','2018-09-02','Drugs Trade','FIR-006.docx','Pending'),(125,'sam','32','T.nagar','2018-09-02','Cyber Crime','Multiple.docx','Approved'),(126,'Manoj','23','Saidapet','2018-09-02','Drugs Trade','FIR-002.docx','Pending'),(127,'Varathan','39','T.nager','2018-09-09','Drug Trade','FIR-001.docx','Pending'),(128,'RamKopal','45','T.nager','2017-09-02','Drug Trade','FIR-002.docx','Approved');

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

insert into `jaireg` (`jaid`,`username`,`password`,`gender`,`stat`,`email`,`phno`,`otp1`) values ('MjAwMg==','Rooban Roy','rooban','Male','A1 Jailer','selvamozhi1997@gmail.com','8939600165','tSokhE'),('MjAwMQ==','Synd Dev','syndev','Male','A1 Jailer','selvamozhi1997@gmail.com','8939695818','xEipYL'),('NjAwNA==','varshini','varshini','Female','A1 Jailer','bhavani.varshini97@gmail.com','987654321','lOdAGo');

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

insert into `newregister` (`poid`,`username`,`password`,`gender`,`stat`,`email`,`phno`,`otp1`) values ('MTAwMQ==','Akash Raj','akash','Male','A1 Station','selvamozhi1997@gmail.com','7299196390','iOhHFA'),('NjAwNQ==','varshini1','varshini','Female','B1 Station','bhavani.varshini97@gmail.com','987654321','gHAzLe');

SET SQL_MODE=@OLD_SQL_MODE;