package me.chanjar.weixin.open.bean.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 头像信息
 * @author Maxwell.Lee
 * @date 2019-03-29 11:05
 * @since 1.0.0
 */
@Data
@EqualsAndHashCode
public class WxOpenMaAccountHeadImageInfo implements Serializable {
  private static final long serialVersionUID = -853146786888662546L;

  /**
   * 头像url
   */
  @SerializedName("head_image_url")
  private String  headImageUrl;

  /**
   * 头像已使用修改次数（本月）
   */
  @SerializedName("modify_used_count")
  private Integer modifyUsedCount;

  /**
   * 头像修改次数总额度（本月）
   */
  @SerializedName("modify_quota")
  private Integer modifyQuota;

}
