package github.oldataraxia.server.entity;

public interface UserDOField {
    String TABLE_NAME = "user";
    String ID = "u_id";
    String GMT_CREATE = "u_gmt_create";
    String GMT_MODIFIED = "u_gmt_modified";
    String DELETED = "u_is_deleted";
    String VERSION = "u_version";
    String USERNAME = "u_username";
    String SALT = "u_salt";
    String PASSWORD = "u_password";
    String NFC = "u_nfc";
}
