package me.chanjar.weixin.open.bean.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 功能介绍信息
 * @author Maxwell.Lee
 * @date 2019-03-29 11:03
 * @since 1.0.0
 */
@Data
@EqualsAndHashCode
public class WxOpenMaAccountSignatureInfo implements Serializable {
  private static final long serialVersionUID = -5861648568055049877L;

  /**
   * 功能介绍
   */
  @SerializedName("signature")
  private String  signature;

  /**
   * 功能介绍已使用修改次数（本月）
   */
  @SerializedName("modify_used_count")
  private Integer modifyUsedCount;

  /**
   * 功能介绍修改次数总额度（本月）
   */
  @SerializedName("modify_quota")
  private Integer modifyQuota;

}
