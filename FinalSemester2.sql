/*
 Navicat Premium Data Transfer

 Source Server         : Kheang
 Source Server Type    : MySQL
 Source Server Version : 80036
 Source Host           : 192.168.152.135:3306
 Source Schema         : FinalSemester2

 Target Server Type    : MySQL
 Target Server Version : 80036
 File Encoding         : 65001

 Date: 17/07/2024 08:34:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for Customers
-- ----------------------------
DROP TABLE IF EXISTS `Customers`;
CREATE TABLE `Customers`  (
  `customer_id` int NOT NULL AUTO_INCREMENT,
  `customer_last_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `customer_first_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `phone` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`customer_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of Customers
-- ----------------------------
INSERT INTO `Customers` VALUES (3, 'vattana', 'san', '012');
INSERT INTO `Customers` VALUES (4, 'John', 'Cena', '010');
INSERT INTO `Customers` VALUES (5, 'Iron', 'Man', '088');
INSERT INTO `Customers` VALUES (6, 'Bat', 'Man', '097');
INSERT INTO `Customers` VALUES (7, 'Ratana', 'Yi', '016');

SET FOREIGN_KEY_CHECKS = 1;
