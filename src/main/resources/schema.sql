CREATE SCHEMA IF NOT EXISTS `Student`;

CREATE TABLE IF NOT EXISTS `course_details` (
  `course_id` int(11) NOT NULL auto_increment,
  `course_name` varchar(255) NOT NULL,
  `course_desc` varchar(255) NOT NULL,
  PRIMARY KEY  (`course_id`)
) ;