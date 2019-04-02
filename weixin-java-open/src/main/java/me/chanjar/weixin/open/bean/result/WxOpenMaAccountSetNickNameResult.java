package me.chanjar.weixin.open.bean.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Maxwell.Lee
 * @date 2019-03-29 15:46
 * @since 1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WxOpenMaAccountSetNickNameResult extends WxOpenResult {
  private static final long serialVersionUID = 6542718534283801670L;

  /**
   * 结果描述；
   */
  @SerializedName("wording")
  private String  wording;

  /**
   * 申请记录ID；
   */
  @SerializedName("audit_id")
  private Long    auditId;


}
