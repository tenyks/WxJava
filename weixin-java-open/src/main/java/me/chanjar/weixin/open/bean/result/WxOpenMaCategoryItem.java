package me.chanjar.weixin.open.bean.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * @author Maxwell.Lee
 * @date 2019-04-09 15:20
 * @since 1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WxOpenMaCategoryItem implements Serializable {
  private static final long serialVersionUID = 4895236110816634508L;

  /**
   * 一级类目ID，（必要）；
   */
  @SerializedName("first")
  private Long  firstId;

  /**
   * 二级类目ID，（必要）；
   */
  @SerializedName("second")
  private Long  secondId;

  /**
   * 资质名称（key字段）和资质图片（value字段），（按需填写）；
   */
  private List<WxOpenMaKeyValue>  certicates;

}
