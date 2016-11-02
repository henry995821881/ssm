/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : mysecurity

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2016-11-02 13:38:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_authoritie
-- ----------------------------
DROP TABLE IF EXISTS `t_authoritie`;
CREATE TABLE `t_authoritie` (
  `user_name` varchar(10) NOT NULL,
  `authority` int(5) NOT NULL,
  UNIQUE KEY `ix_auth_username` (`user_name`,`authority`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_authoritie
-- ----------------------------
INSERT INTO `t_authoritie` VALUES ('0001', '57');
INSERT INTO `t_authoritie` VALUES ('0002', '58');

-- ----------------------------
-- Table structure for t_users
-- ----------------------------
DROP TABLE IF EXISTS `t_users`;
CREATE TABLE `t_users` (
  `user_name` varchar(10) NOT NULL,
  `user_pw` varchar(128) NOT NULL,
  `nick_name` varchar(50) default NULL,
  `enable` char(1) default '1',
  `locked` char(1) default '0',
  `email` varchar(50) default NULL,
  `description` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_users
-- ----------------------------
INSERT INTO `t_users` VALUES ('0001', '202CB962AC59075B964B07152D234B70', 'henry', '1', '0', 'qq.com', 'ghhh');
INSERT INTO `t_users` VALUES ('0002', '202CB962AC59075B964B07152D234B70', 'yang', '1', '1', '163.com', '163');
