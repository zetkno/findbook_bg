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

 Date: 18/12/2018 19:51:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for favorite_type
-- ----------------------------
DROP TABLE IF EXISTS `favorite_type`;
CREATE TABLE `favorite_type`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) NULL DEFAULT NULL,
  `typeCode` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of favorite_type
-- ----------------------------
INSERT INTO `favorite_type` VALUES (1, 1, 1013);
INSERT INTO `favorite_type` VALUES (2, 1, 1012);
INSERT INTO `favorite_type` VALUES (3, 1, 1014);
INSERT INTO `favorite_type` VALUES (4, 2, 1010);
INSERT INTO `favorite_type` VALUES (5, 2, 1011);
INSERT INTO `favorite_type` VALUES (6, 3, 1015);
INSERT INTO `favorite_type` VALUES (7, 3, 1014);
INSERT INTO `favorite_type` VALUES (8, 4, 1010);

SET FOREIGN_KEY_CHECKS = 1;
