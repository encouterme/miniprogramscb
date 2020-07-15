/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : miniprogram

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2020-07-13 15:35:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `activities`
-- ----------------------------
DROP TABLE IF EXISTS `activities`;
CREATE TABLE `activities` (
  `activity_id` int(11) NOT NULL AUTO_INCREMENT,
  `activity_title` varchar(255) NOT NULL,
  `activity_content` varchar(255) NOT NULL,
  `activity_beginTime` varchar(255) NOT NULL,
  `activity_endTime` varchar(255) DEFAULT NULL,
  `activity_isDeleted` int(11) NOT NULL,
  `activity_mainPicture` varchar(255) NOT NULL,
  `
is_timeOut` int(11) NOT NULL,
  `member_num` int(11) NOT NULL,
  PRIMARY KEY (`activity_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of activities
-- ----------------------------

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(255) NOT NULL,
  `admin_year` varchar(255) NOT NULL,
  `admin_depart` varchar(255) NOT NULL,
  `admin_phone` varchar(255) NOT NULL,
  `admin_password` varchar(255) NOT NULL,
  `admin_time` varchar(255) NOT NULL,
  `admin_state` char(1) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------

-- ----------------------------
-- Table structure for `annc`
-- ----------------------------
DROP TABLE IF EXISTS `annc`;
CREATE TABLE `annc` (
  `annc_id` int(11) NOT NULL AUTO_INCREMENT,
  `annc_title` varchar(255) NOT NULL,
  `annc_content` varchar(255) NOT NULL,
  `annc_time` datetime NOT NULL,
  `annc_menber` varchar(255) NOT NULL,
  `annc_img01` varchar(255) DEFAULT NULL,
  `annc_img02` varchar(255) DEFAULT NULL,
  `annc_img03` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`annc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of annc
-- ----------------------------

-- ----------------------------
-- Table structure for `comment`
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `comment_id` int(11) NOT NULL AUTO_INCREMENT,
  `comment_content` varchar(2048) NOT NULL,
  `comment_postTime` datetime NOT NULL,
  `comment_ownerId` int(11) NOT NULL,
  `comment_num` int(11) NOT NULL,
  `comment_userId` int(11) NOT NULL,
  `comment_state` int(11) NOT NULL,
  `comment_usernname` varchar(30) NOT NULL,
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `department_id` int(11) NOT NULL AUTO_INCREMENT,
  `department_name` varchar(255) NOT NULL,
  `department_introduce` varchar(255) NOT NULL,
  `department_image` varchar(255) NOT NULL,
  `leader_name` varchar(255) NOT NULL,
  `leader_qq` varchar(255) NOT NULL,
  PRIMARY KEY (`department_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', 'JAVA', '语言编程，最强逻辑；高端手法，玩转转盘', 'src.image.department.01', '彭飞琪', '1060471057');

-- ----------------------------
-- Table structure for `image`
-- ----------------------------
DROP TABLE IF EXISTS `image`;
CREATE TABLE `image` (
  `image_id` int(11) NOT NULL AUTO_INCREMENT,
  `activity_id` int(11) NOT NULL,
  `image_src` varchar(255) NOT NULL,
  `image_isDeleted` int(11) NOT NULL,
  PRIMARY KEY (`image_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of image
-- ----------------------------

-- ----------------------------
-- Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `message_id` int(11) NOT NULL AUTO_INCREMENT,
  `message_content` varchar(255) NOT NULL,
  `message_time` datetime NOT NULL,
  `u_id` int(11) DEFAULT NULL,
  `admin_id` int(11) DEFAULT NULL,
  `a_id` int(11) NOT NULL,
  PRIMARY KEY (`message_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------

-- ----------------------------
-- Table structure for `registration`
-- ----------------------------
DROP TABLE IF EXISTS `registration`;
CREATE TABLE `registration` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_username` varchar(255) NOT NULL,
  `user_grade` int(11) NOT NULL,
  `user_department` varchar(255) NOT NULL,
  `user_major` varchar(255) NOT NULL,
  `user_phoneNum` varchar(255) NOT NULL,
  `user_email` varchar(255) NOT NULL,
  `activity_id` varchar(255) NOT NULL,
  `
Is_pass` int(11) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of registration
-- ----------------------------

-- ----------------------------
-- Table structure for `reply`
-- ----------------------------
DROP TABLE IF EXISTS `reply`;
CREATE TABLE `reply` (
  `reply_id` int(11) NOT NULL AUTO_INCREMENT,
  `reply_postTime` datetime NOT NULL,
  `reply_content` varchar(2048) NOT NULL,
  `reply_userId` int(11) NOT NULL,
  `reply_commentId` int(11) NOT NULL,
  `reply _state` int(11) NOT NULL,
  `reply_for_userId` int(11) NOT NULL,
  `reply_for_username` varchar(30) DEFAULT NULL,
  `reply_username` varchar(30) NOT NULL,
  PRIMARY KEY (`reply_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reply
-- ----------------------------
