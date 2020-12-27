CREATE TABLE course_1 (
	cid BIGINT ( 20 ) PRIMARY KEY,
	cname VARCHAR ( 50 ) NOT NULL,
	user_id BIGINT ( 20 ) NOT NULL,
    cstatus VARCHAR ( 10 ) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_user` (
  `user_id` bigint(20) NOT NULL,
  `username` varchar(50) NOT NULL,
  `ustatus` varchar(50) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_udict` (
  `dictid` bigint(20) NOT NULL,
  `ustatus` varchar(100) NOT NULL,
  `uvalue` varchar(100) NOT NULL,
  PRIMARY KEY (`dictid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order` (
  `order_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `status` varchar(50) NOT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;