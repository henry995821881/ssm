INSERT INTO `t_user` VALUES ('0001', '123', 'h', 'yy@.com', 'yy');
INSERT INTO `t_user` VALUES ('0002', '123', 't', 'tt@.com', 'tt');

INSERT INTO `t_authoritie` VALUES ('0001', 57);
INSERT INTO `t_authoritie` VALUES ('0002', 58);


CREATE TABLE `t_authoritie` (
  `user_id` varchar(10) NOT NULL,
  `authority` int(5) NOT NULL,
  UNIQUE KEY `ix_auth_username` (`user_id`,`authority`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_authoritie` (
  `user_id` varchar(10) NOT NULL,
  `authority` int(5) NOT NULL,
  UNIQUE KEY `ix_auth_username` (`user_id`,`authority`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


