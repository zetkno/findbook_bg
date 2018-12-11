/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : findbook

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-12-11 23:37:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book_type
-- ----------------------------
DROP TABLE IF EXISTS `book_type`;
CREATE TABLE `book_type` (
  `typeId` int(11) NOT NULL,
  `parentId` varchar(255) DEFAULT NULL,
  `parentName` varchar(255) DEFAULT NULL,
  `typeName` varchar(255) DEFAULT NULL,
  `typeCode` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`typeId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of book_type
-- ----------------------------
INSERT INTO `book_type` VALUES ('1', '101', '言情小说', '言情小说', '1010');
INSERT INTO `book_type` VALUES ('2', '101', '言情小说', '后宫文', '1011');
INSERT INTO `book_type` VALUES ('3', '101', '言情小说', '穿越文', '1012');
INSERT INTO `book_type` VALUES ('4', '101', '言情小说', '都市文', '1013');
INSERT INTO `book_type` VALUES ('5', '101', '言情小说', '青春校园', '1014');
INSERT INTO `book_type` VALUES ('6', '102', '武侠小说', '武侠小说', '1020');
