-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.67-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema db
--

CREATE DATABASE IF NOT EXISTS db;
USE db;

--
-- Definition of table `add_book`
--

DROP TABLE IF EXISTS `add_book`;
CREATE TABLE `add_book` (
  `book_name` varchar(50) default NULL,
  `book_author` varchar(50) default NULL,
  `course` varchar(20) default NULL,
  `branch` varchar(20) default NULL,
  `year` int(3) default NULL,
  `semester` int(4) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `add_book`
--

/*!40000 ALTER TABLE `add_book` DISABLE KEYS */;
INSERT INTO `add_book` (`book_name`,`book_author`,`course`,`branch`,`year`,`semester`) VALUES 
 ('OOPS','E-Balagoswami','B.Tech','C.S.E',2,3),
 ('Let Us C','Yashwant Kanetkar','Diploma','C.S.E',2,4),
 ('DBMS','Navathe','B.Tech','C.S.E',2,4),
 ('RB_Patel','RB_Mishra','B.Tech','C.S.E',2,4),
 ('Operating System','Galvin','B.Tech','C.S.E',2,3);
/*!40000 ALTER TABLE `add_book` ENABLE KEYS */;


--
-- Definition of table `issue_book`
--

DROP TABLE IF EXISTS `issue_book`;
CREATE TABLE `issue_book` (
  `Roll_No` int(20) default NULL,
  `Book_Name` varchar(50) default NULL,
  `course` varchar(30) default NULL,
  `branch` varchar(20) default NULL,
  `year` int(3) default NULL,
  `semester` int(3) default NULL,
  `Date_of_issue` varchar(30) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `issue_book`
--

/*!40000 ALTER TABLE `issue_book` DISABLE KEYS */;
INSERT INTO `issue_book` (`Roll_No`,`Book_Name`,`course`,`branch`,`year`,`semester`,`Date_of_issue`) VALUES 
 (11142550,'DBMS','B.Tech','C.S.E',2,4,'Thu Jul 07 16:08:01 IST 2016'),
 (11142529,'Operating System','B.Tech','C.S.E',2,3,'Thu Jul 07 16:45:56 IST 2016'),
 (111,'Let Us C','Diploma','C.S.E',2,4,'Thu Jul 07 17:25:55 IST 2016');
/*!40000 ALTER TABLE `issue_book` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
