package me.chanjar.weixin.open.bean.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Maxwell.Lee
 * @date 2019-03-29 16:19
 * @since 1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WxOpenMaCheckNickNameResult extends WxOpenResult {
  private static final long serialVersionUID = -4778207416396779335L;

  /**
   * 是否命中关键字策略。若命中，可以选填关键字材料
   */
  @SerializedName("hitCondition")
  private Boolean   hit_condition;

  /**
   * 命中关键字的说明描述（给用户看的）
   */
  @SerializedName("wording")
  private String    wording;


}
