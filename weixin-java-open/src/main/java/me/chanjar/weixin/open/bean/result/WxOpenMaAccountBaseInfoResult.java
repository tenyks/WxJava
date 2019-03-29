package me.chanjar.weixin.open.bean.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 小程序帐号基本信息；
 * @author Maxwell.Lee
 * @date 2019-03-29 10:59
 * @since 1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WxOpenMaAccountBaseInfoResult extends WxOpenResult {
  private static final long serialVersionUID = -3551952282962313863L;

  /**
   * 帐号appid
   */
  @SerializedName("appid")
  private String  appId;

  /**
   * 帐号类型（1：订阅号，2：服务号，3：小程序）
   */
  @SerializedName("account_type")
  private Integer accountType;

  /**
   * 主体类型（1：企业）
   */
  @SerializedName("principal_type")
  private Integer principalType;

  /**
   * 主体名称
   */
  @SerializedName("principal_name")
  private String  principalName;

  /**
   * 实名验证状态（1：实名验证成功，2：实名验证中，3：实名验证失败）
   * 调用接口1.1创建帐号时，realname_status会初始化为2
   * 对于注册方式为微信认证的帐号，资质认证成功时，realname_status会更新为1
   * 注意！！！当realname_status不为1时，帐号只允许调用本文档内的以下API：
   *    （即无权限调用其他API）微信认证相关接口（参考2.x） 帐号设置相关接口（参考3.x）
   */
  @SerializedName("realname_status")
  private Integer realNameStatus;

  /**
   * 微信认证信息
   */
  @SerializedName("wx_verify_info")
  private WxOpenMaAccountVerifyInfo   verifyInfo;

  /**
   * 功能介绍信息
   */
  @SerializedName("signature_info")
  private WxOpenMaAccountSignatureInfo  signatureInfo;

  /**
   * 头像信息
   */
  @SerializedName("head_image_info")
  private WxOpenMaAccountHeadImageInfo  headImageInfo;
}
