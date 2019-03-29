package me.chanjar.weixin.open.bean.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Maxwell.Lee
 * @date 2019-03-29 16:05
 * @since 1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WxOpenMaAccountNickNameAuditResult extends WxOpenResult {
  private static final long serialVersionUID = -8163319082024592458L;

  /**
   * 审核昵称
   */
  @SerializedName("nickname")
  private String  nickName;

  /**
   * 审核状态，1：审核中，2：审核失败，3：审核成功
   */
  @SerializedName("audit_stat")
  private Integer auditStat;

  /**
   * 失败原因
   */
  @SerializedName("fail_reason")
  private String  failReason;

  /**
   * 审核提交时间
   */
  @SerializedName("create_time")
  private Long    createTime;

  /**
   * 审核完成时间
   */
  @SerializedName("audit_time")
  private Long    auditTime;



}
