/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : findbook

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-12-11 23:37:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `bookId` int(11) NOT NULL AUTO_INCREMENT,
  `bookName` varchar(255) DEFAULT NULL,
  `bookEngName` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `translator` varchar(255) DEFAULT NULL,
  `typeCode` varchar(255) DEFAULT NULL,
  `bookNumber` varchar(255) DEFAULT NULL COMMENT '书号',
  `publishHours` varchar(255) DEFAULT NULL COMMENT '出版社',
  `publishDate` date DEFAULT NULL,
  `introduce` varchar(255) DEFAULT NULL COMMENT '简介',
  PRIMARY KEY (`bookId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', '搜神记', 'SouShenJi', '张帆', 'lisi', '1003', '3423423', '长江出版社', '2018-11-24', '一些介绍');
