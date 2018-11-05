--  auth
DROP TABLE IF EXISTS `auth`;

CREATE TABLE `auth` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `auth_name` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

insert  into `auth`(`id`,`auth_name`) values
(1,'user:add'),
(2,'user:delete'),
(3,'user:update'),
(4,'user:query');

-- role
DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

insert  into `role`(`id`,`role_name`) values
(1,'admin'),
(2,'guest'),
(3,'clerk'),
(4,'manager');

-- role_auth
DROP TABLE IF EXISTS `role_auth`;

CREATE TABLE `role_auth` (
  `role_id` int(11) DEFAULT NULL,
  `auth_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert  into `role_auth`(`role_id`,`auth_id`) values
(1,1),
(1,3),
(1,4),
(2,4),
(3,1),
(3,4),
(4,2),
(4,3),
(4,4),
(1,2);

-- user
DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL,
  `password` varchar(64) NOT NULL,
  `salt` varchar(64) NOT NULL DEFAULT '8d78869f470951332959580424d4bf4f',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- user_role
DROP TABLE IF EXISTS `user_role`;

CREATE TABLE `user_role` (
  `user_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert  into `user_role`(`user_id`,`role_id`) values
(1,1),
(2,2),
(3,3),
(4,4);