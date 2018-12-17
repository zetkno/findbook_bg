/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80011
 Source Host           : localhost:3306
 Source Schema         : findbook

 Target Server Type    : MySQL
 Target Server Version : 80011
 File Encoding         : 65001

 Date: 17/12/2018 18:42:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `gender` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phoneNum` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `administrator` bit(1) NULL DEFAULT NULL,
  `favoriteType` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dailyType` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `avator` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`userid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', '123456', '男', '18500236134', b'1', '1013', '1014', 'jing@163.com', 'dsfsd');
INSERT INTO `user` VALUES (2, 'guest', '123456', '男', '18866668888', b'0', '1011', '1013', '23423@qq.com', 'touxaing');
INSERT INTO `user` VALUES (3, 'clerk', '123456', '男', '16625251414', b'0', '', '1012', '3423@qq.com', 'touxiang');
INSERT INTO `user` VALUES (4, 'manager', '123456', '男', '12345678910', b'0', '', '1011', '890789@qq.com', 'touxiang');

SET FOREIGN_KEY_CHECKS = 1;
