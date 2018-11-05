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

 Date: 05/11/2018 17:02:19
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
  `favoriteType` tinyint(5) NULL DEFAULT NULL,
  `dailyType` tinyint(5) NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `avator` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`userid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', 'd3c59d25033dbf980d29554025c23a75', '男', '18500236134', b'1', 1, 1, 'jing@163.com', 'dsfsd', '8d78869f470951332959580424d4bf4f');
INSERT INTO `user` VALUES (2, 'guest', 'd3c59d25033dbf980d29554025c23a75', '男', '18866668888', b'0', 1, 1, '23423@qq.com', 'touxaing', '8d78869f470951332959580424d4bf4f');
INSERT INTO `user` VALUES (3, 'clerk', 'd3c59d25033dbf980d29554025c23a75', '男', '16625251414', b'0', 1, 1, '3423@qq.com', 'touxiang', '8d78869f470951332959580424d4bf4f');
INSERT INTO `user` VALUES (4, 'manager', 'd3c59d25033dbf980d29554025c23a75', '男', '123546478910', b'0', 1, 1, '890789@qq.com', 'touxiang', '8d78869f470951332959580424d4bf4f');

SET FOREIGN_KEY_CHECKS = 1;
