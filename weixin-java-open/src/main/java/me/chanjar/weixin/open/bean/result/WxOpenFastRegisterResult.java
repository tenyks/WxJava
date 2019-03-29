package me.chanjar.weixin.open.bean.result;

import cn.binarywang.wx.miniapp.util.json.WxMaGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import me.chanjar.weixin.open.util.json.WxOpenGsonBuilder;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

/**
 * @author Maxwell.Lee
 * @date 2019-03-28 12:00
 * @since 1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WxOpenFastRegisterResult implements Serializable {
  private static final long serialVersionUID = 5930013480340292108L;

  @SerializedName("errcode")
  private Integer errCode;

  @SerializedName("errmsg")
  private String errMsg;

  public static WxOpenFastRegisterResult fromJson(String json) {
    return WxMaGsonBuilder.create().fromJson(json, WxOpenFastRegisterResult.class);
  }

  /**
   * 请求是否成功.
   */
  public boolean isSuccess() {
    return errCode != null && errCode.equals(0);
  }

  @Override
  public String toString() {
    return WxOpenGsonBuilder.create().toJson(this);
  }
}
