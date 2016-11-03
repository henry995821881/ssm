/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : mysecurity

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2016-11-03 14:48:41
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
INSERT INTO `t_authoritie` VALUES ('0002', '57');
INSERT INTO `t_authoritie` VALUES ('0006', '58');

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
  `create_time` datetime default NULL,
  `salt` varchar(64) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_users
-- ----------------------------
INSERT INTO `t_users` VALUES ('0006', '420A8475AF494EBB05522FDC0BAA5A85', 'sdfsdf', '1', '0', 'efsdf', 'sdfsdf', '2016-11-03 14:19:52', '202DCFAC4A4732AD899674B386024F1A');
INSERT INTO `t_users` VALUES ('0001', '384E8A7F5B408FCA82A7F894710B7BA2', 'sadasd', '1', '0', 'qwewqe', 'dsfsdf', '2016-11-03 14:38:35', 'B8740594E256D8124150E09F99ABFF3F');
INSERT INTO `t_users` VALUES ('0002', 'D5801C04AD871BFABD3C8C7CE1433E91', 'ewrer', '1', '0', 'werwere', 'dfsdf', '2016-11-03 14:39:05', '0BAB80403E52C0A2163776A49CA88512');

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
INSERT INTO `t_users_attempts` VALUES ('0006', '2016-11-03 14:46:28', '2');
INSERT INTO `t_users_attempts` VALUES ('0001', '2016-11-03 14:46:41', '1');
INSERT INTO `t_users_attempts` VALUES ('0002', '2016-11-03 14:39:05', '0');
