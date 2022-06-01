package github.oldataraxia.server.Entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(UserDOField.TABLE_NAME)
public class UserDo{
    @TableId(value= UserDOField.ID, type = IdType.AUTO)
    private Long userId;

    @TableField(value = UserDOField.GMT_CREATE, fill = FieldFill.INSERT)
    private Instant gmtCreate;

    @TableField(value = UserDOField.GMT_MODIFIED, fill = FieldFill.INSERT_UPDATE)
    private Instant gmtModified;

    @TableField(value = UserDOField.DELETED)
    @TableLogic(value = "0", delval = "1")
    private Integer deleted;

    @TableField(value = UserDOField.VERSION)
    @Version
    private Integer version;

    @TableField(value = UserDOField.USERNAME)
    private String userName;

    @TableField(value = UserDOField.SALT)
    private String salt;

    @TableField(value = UserDOField.PASSWORD)
    private String passwd;

    @TableField(value = UserDOField.NFC)
    private String nfc;

    @TableField(value = UserDOField.ROLE)
    private String role;

}
