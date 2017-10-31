DROP TABLE IF EXISTS `appuser_message`;
CREATE TABLE `appuser_message` (
  `id` varchar(32) DEFAULT NULL,
  `message` varchar(500) DEFAULT NULL,
  `senddate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `appuser_message` VALUES ('1', '1', '2017-07-28');