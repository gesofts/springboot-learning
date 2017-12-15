/*
Navicat MySQL Data Transfer

Source Server         : springboot
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : springboot

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2017-11-21 09:16:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `id` int(255) NOT NULL,
  `province_id` int(255) DEFAULT NULL,
  `city_name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES ('1', '1', '福建', '1');
INSERT INTO `city` VALUES ('2', '2', '上海', '2');
INSERT INTO `city` VALUES ('3', '3', '浙江', '3');
