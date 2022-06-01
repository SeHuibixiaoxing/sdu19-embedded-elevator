create table user (
  `u_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `u_gmt_create` datetime(0) DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `u_gmt_modified` datetime(0)  DEFAULT CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `u_is_deleted` tinyint(4) UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否删除, 0.否, 1.是',
  `u_version` int(10) UNSIGNED NOT NULL DEFAULT 0 COMMENT '乐观锁字段',
  `u_nfc` char(127) NOT NULL COMMENT 'NFC',
  `u_username` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci COMMENT '用户账号, 英文、数字、下划线组成',
  `u_salt` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '密码加盐',
  `u_password` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci COMMENT '用户密码',
  `u_role` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci COMMENT '用户权限',
  PRIMARY KEY (`u_id`)
)