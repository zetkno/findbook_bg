/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : findbook

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-12-11 23:37:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `phoneNum` varchar(255) NOT NULL,
  `administrator` bit(1) DEFAULT NULL,
  `favoriteType` varchar(255) DEFAULT NULL,
  `dailyType` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `avator` varchar(255) NOT NULL,
  PRIMARY KEY (`userid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '123456', '男', '18500236134', '', '1020', '1020', 'jing@163.com', 'dsfsd');
INSERT INTO `user` VALUES ('2', 'guest', '123456', '男', '18866668888', '\0', '1020', '1020', '23423@qq.com', 'touxaing');
INSERT INTO `user` VALUES ('3', 'clerk', '123456', '男', '16625251414', '\0', '1020', '1020', '3423@qq.com', 'touxiang');
INSERT INTO `user` VALUES ('4', 'manager', '123456', '男', '12345678910', '\0', '1020', '1020', '890789@qq.com', 'touxiang');
