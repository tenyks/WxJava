package me.chanjar.weixin.open.bean.result;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author Maxwell.Lee
 * @date 2019-04-09 15:21
 * @since 1.0.0
 */
@Data
@EqualsAndHashCode()
public class WxOpenMaKeyValue implements Serializable {
  private static final long serialVersionUID = 8158758877414199555L;

  private String key;

  private String  value;

}
