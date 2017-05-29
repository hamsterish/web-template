CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(12) NOT NULL,
  `gender` varchar(22) DEFAULT NULL,
  `first_name` varchar(120) NOT NULL,
  `last_name` varchar(120) NOT NULL,
  `phone_number` varchar(22) NOT NULL,
  `email` varchar(120) DEFAULT NULL,
  `birth` date DEFAULT NULL,
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_id_uindex` (`id`),
  UNIQUE KEY `user_email_uindex` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;