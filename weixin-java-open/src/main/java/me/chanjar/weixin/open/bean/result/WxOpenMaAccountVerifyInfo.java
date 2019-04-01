package me.chanjar.weixin.open.bean.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 微信认证信息
 * @author Maxwell.Lee
 * @date 2019-03-29 11:00
 * @since 1.0.0
 */
@Data
@EqualsAndHashCode
public class WxOpenMaAccountVerifyInfo implements Serializable {
  private static final long serialVersionUID = 8211406108204144378L;

  /**
   * 是否资质认证（1：是，0：否）若是，拥有微信认证相关的权限。
   */
  @SerializedName("qualification_verify")
  private Boolean  qualificationVerify;

  /**
   * 是否名称认证（1：是，0：否）对于公众号（订阅号、服务号），是名称认证，微信客户端才会有微信认证打勾的标识。
   */
  @SerializedName("naming_verify")
  private Boolean  namingVerify;

  /**
   * 是否需要年审（true：是，false：否）（qualification_verify = true时才有该字段）
   */
  @SerializedName("annual_review")
  private Boolean annualReview;

  /**
   * 年审开始时间，时间戳（qualification_verify = true时才有该字段）
   */
  @SerializedName("annual_review_begin_time")
  private Long    annualReviewBeginTime;

  /**
   * 年审截止时间，时间戳（qualification_verify = true时才有该字段）
   */
  @SerializedName("annual_review_end_time")
  private Long    annualReviewEndTime;


}
