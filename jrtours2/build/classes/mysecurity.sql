/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : mysecurity

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2016-11-03 13:08:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_authoritie
-- ----------------------------
DROP TABLE IF EXISTS `t_authoritie`;
CREATE TABLE `t_authoritie` (
  `user_name` varchar(10) NOT NULL,
  `authority` int(5) NOT NULL default '57',
  UNIQUE KEY `ix_auth_username` (`user_name`,`authority`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_authoritie
-- ----------------------------
INSERT INTO `t_authoritie` VALUES ('0001', '57');
INSERT INTO `t_authoritie` VALUES ('0002', '58');
INSERT INTO `t_authoritie` VALUES ('0003', '57');

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
  `description` varchar(50) default NULL,
  `create_time` datetime default NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_users
-- ----------------------------
INSERT INTO `t_users` VALUES ('0001', '202CB962AC59075B964B07152D234B70', 'henry', '1', '0', 'qq.com', 'ghhh', '2016-11-02 10:49:42');
INSERT INTO `t_users` VALUES ('0002', '202CB962AC59075B964B07152D234B70', 'yang', '1', '0', '163.com', '163', '2016-10-10 10:49:48');
INSERT INTO `t_users` VALUES ('0003', '202CB962AC59075B964B07152D234B70', 'sdf', '1', '0', 'ersfd', 'vxdsf', '2016-11-03 12:40:36');

-- ----------------------------
-- Table structure for t_users_attempts
-- ----------------------------
DROP TABLE IF EXISTS `t_users_attempts`;
CREATE TABLE `t_users_attempts` (
  `user_name` varchar(10) NOT NULL,
  `last_attempts_time` datetime default NULL,
  `error_attempts_num` int(5) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_users_attempts
-- ----------------------------
INSERT INTO `t_users_attempts` VALUES ('0001', '2016-11-03 10:07:55', '0');
INSERT INTO `t_users_attempts` VALUES ('0002', '2016-11-03 10:07:18', '0');
INSERT INTO `t_users_attempts` VALUES ('0003', '2016-11-03 12:40:36', '0');
