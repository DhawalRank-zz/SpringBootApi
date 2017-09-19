USE `concretepage`;
-- Dumping structure for table concretepage.articles
DROP TABLE `Users`;
CREATE TABLE `Users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(200) UNIQUE NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`, `username`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
-- Dumping data for table concretepage.articles: ~3 rows (approximately)
INSERT INTO `Users` (`id`, `username`, `password`) VALUES
	(1, 'dhawal', 'dhawal'),
	(2, 'rank', 'dhawal'); 