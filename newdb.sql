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

insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (1,'Aaravind','23','chennai','2019-01-21','Robery','img89.png','Approved');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (2,'Babu','23','chennai','2018-11-21','Robery','image1.png','Approved');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (3,'Ram Mohan','31','Kilpauk','2018-11-11','Robery','Dataset.xlsx','Pending');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (4,'Ravi','32','Kilpauk','2019-01-21','Murder','CSE 2019.xlsx','Pending');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (5,'sekar','32','Kilpauk','2018-01-01','Murder','A Secure Data Forwarding In Multiple.docx','Approved');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (6,'Kannan','23','arani','2018-11-21','Murder','Enabling identity-based integrity auditing and data sharing with sensitive information hiding for secure cloud storage.docx','Pending');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (7,'Ram Varman','22','Avadi','0208-01-03','Murder','Enabling identity-based integrity auditing and data sharing with sensitive information hiding for secure cloud storage.docx','Pending');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (8,'Rohit','23','chennai','2019-01-02','Domestic Violence','Enabling identity-based integrity auditing and data sharing with sensitive information hiding for secure cloud storage.docx','Approved');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (9,'anbu','23','saidapet','2019-02-24','Murder','software & hardware specification.docx','Pending');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (10,'Vinoth','21','Guindy','2013-09-09','Robery','FIR-001.docx','Pending');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (101,'Ram','23','Annanager','2012-09-09','Domesric Violence','FIR-002.docx','Approved');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (102,'Asif','21','Annanager','2016-08-09','Murder','FIR-003.docx','Approved');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (103,'Dinesh','19','Annanager','2019-01-02','Murder','Dataset.xlsx','Pending');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (104,'Asraf','21','Annanager','2013-02-02','Robery','FIR-004.docx','Pending');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (105,'sekar','21','26,2nd floor,kota sreenivasaya charities ramanuja kudam building,T.nagar,chennai 6000 017 tamil nadu','2018-12-22','Robery','A Secure Data Forwarding In Multiple.docx','Approved');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (106,'Kala','23','Saidapet','2018-03-22','Corruption','Enabling identity-based integrity auditing and data sharing with sensitive information hiding for secure cloud storage.docx','Pending');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (110,'Ramesh','23','Annanager','2018-04-22','Drugs Trade','FIR-002.docx','Approved');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (112,'Asif Ali','22','Annanager','2018-08-12','Cyber Crime','FIR-003.docx','Approved');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (113,'Dennis','29','Annanager','2018-05-30','Dowry','Dataset.xlsx','Pending');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (114,'Ajay','21','Saidapet','2018-09-02','Corruption','FIR-004.docx','Pending');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (115,'sathish','32','T.nagar','2018-09-02','Corruption','Multiple.docx','Approved');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (116,'Mala','23','Saidapet','2018-09-02','Corruption','Enabling identity-based integrity auditing and data sharing with sensitive information hiding for secure cloud storage.docx','Pending');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (120,'Raj','24','Saidapet','2018-09-02','Drugs Trade','FIR-003.docx','Approved');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (121,'Khan','28','T.nager','2018-09-02','Drugs Trade','FIR-005.docx','Approved');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (123,'Danial','39','T.nager','2018-09-02','Cyber Crime','FIR-006.docx','Pending');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (124,'Akash','31','Saidapet','2018-09-02','Drugs Trade','FIR-006.docx','Pending');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (125,'sam','32','T.nagar','2018-09-02','Cyber Crime','Multiple.docx','Approved');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (126,'Manoj','23','Saidapet','2018-09-02','Drugs Trade','FIR-002.docx','Pending');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (127,'Varathan','39','T.nager','2018-09-09','Drug Trade','FIR-001.docx','Pending');
insert into `crecd` (`firno`,`cname`,`cage`,`cadd`,`cdate`,`crime`,`filename`,`status`) values (128,'RamKopal','45','T.nager','2017-09-02','Drug Trade','FIR-002.docx','Approved');

/*Table structure for table `fir` */

DROP TABLE IF EXISTS `fir`;

CREATE TABLE `fir` (
  `dis` varchar(30) default NULL,
  `da` varchar(33) default NULL,
  `ti` varchar(33) default NULL,
  `toi` varchar(20) default NULL,
  `place` varchar(20) default NULL,
  `seleect` varchar(20) default NULL,
  `fno` varchar(33) default NULL,
  `addd` varchar(200) default NULL,
  `police` varchar(20) default NULL,
  `email` varchar(30) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `fir` */

insert into `fir` (`dis`,`da`,`ti`,`toi`,`place`,`seleect`,`fno`,`addd`,`police`,`email`) values ('tirunelveli','18/03/2020','case','a','murder','12.00.30','1','chennai','tirunelveli','prabu.mk@pantechmail.com');

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

insert into `jaireg` (`jaid`,`username`,`password`,`gender`,`stat`,`email`,`phno`,`otp1`) values ('MjAwMg==','Rooban Roy','rooban','Male','A1 Jailer','selvamozhi1997@gmail.com','8939600165','tSokhE');
insert into `jaireg` (`jaid`,`username`,`password`,`gender`,`stat`,`email`,`phno`,`otp1`) values ('MjAwMQ==','Synd Dev','syndev','Male','A1 Jailer','selvamozhi1997@gmail.com','8939695818','xEipYL');
insert into `jaireg` (`jaid`,`username`,`password`,`gender`,`stat`,`email`,`phno`,`otp1`) values ('NjAwNA==','varshini','varshini','Female','A1 Jailer','bhavani.varshini97@gmail.com','987654321','lOdAGo');

/*Table structure for table `mis` */

DROP TABLE IF EXISTS `mis`;

CREATE TABLE `mis` (
  `name` varchar(50) default NULL,
  `mobile` varchar(50) default NULL,
  `addd` varchar(50) default NULL,
  `pin` varchar(50) default NULL,
  `da` date default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `mis` */

insert into `mis` (`name`,`mobile`,`addd`,`pin`,`da`) values ('\"+a+\"','\"+b+\"','\"+c+\"','\"+d+\"','0000-00-00');

/*Table structure for table `newregister` */

DROP TABLE IF EXISTS `newregister`;

CREATE TABLE `newregister` (
  `username` varchar(50) NOT NULL default '',
  `password` varchar(50) default NULL,
  `gender` varchar(50) default NULL,
  `email` varchar(50) NOT NULL default '',
  `phno` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `newregister` */

insert into `newregister` (`username`,`password`,`gender`,`email`,`phno`) values ('JAMES','james','Male','prabu.mk@pantechmail.com','7339300411');
insert into `newregister` (`username`,`password`,`gender`,`email`,`phno`) values ('Akash Raj','akash','Male','selvamozhi1997@gmail.com','7299196390');
insert into `newregister` (`username`,`password`,`gender`,`email`,`phno`) values ('varshini1','varshini','Female','bhavani.varshini97@gmail.com','987654321');

SET SQL_MODE=@OLD_SQL_MODE;