package me.chanjar.weixin.open.bean.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 小程序当前隐私设置
 *
 * @author Maxwell.Lee
 * @date 2019-03-29 17:30
 * @since 1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WxOpenMaSearchStatusResult extends WxOpenResult {
  private static final long serialVersionUID = 1602337957398459305L;

  /**
   * 1表示不可搜索，0表示可搜索
   */
  @SerializedName("status")
  private Integer status;
}
