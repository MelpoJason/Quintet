CREATE DATABASE IF NOT EXISTS quintet DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

DROP TABLE IF EXISTS sys_user;
CREATE TABLE sys_user (
  id       INTEGER(15)  NOT NULL AUTO_INCREMENT
  COMMENT '用户“id”',
  username VARCHAR(255) NOT NULL
  COMMENT '用户“用户名”',
  password VARCHAR(255) NOT NULL
  COMMENT '用户“密码”',
  status   INT(1)       NOT NULL
  COMMENT '用户“用户状态”',
  PRIMARY KEY (id)
)
  DEFAULT CHARSET = utf8;