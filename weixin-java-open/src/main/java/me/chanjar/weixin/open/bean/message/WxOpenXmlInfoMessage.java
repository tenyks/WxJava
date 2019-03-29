package me.chanjar.weixin.open.bean.message;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import lombok.Data;
import me.chanjar.weixin.common.util.xml.XStreamCDataConverter;

import java.io.Serializable;

/**
 * @author Maxwell.Lee
 * @date 2019-03-27 15:18
 * @since 1.0.0
 */
@Data
@XStreamAlias("info")
public class WxOpenXmlInfoMessage implements Serializable {
  private static final long serialVersionUID = 1279310377992060928L;

  @XStreamAlias("name")
  @XStreamConverter(value = XStreamCDataConverter.class)
  private String  name;

  @XStreamAlias("code")
  @XStreamConverter(value = XStreamCDataConverter.class)
  private String  code;

  @XStreamAlias("code_type")
  private Integer codeType;

  @XStreamAlias("legal_persona_wechat")
  @XStreamConverter(value = XStreamCDataConverter.class)
  private String  legalPersonaWechat;

  @XStreamAlias("legal_persona_name")
  @XStreamConverter(value = XStreamCDataConverter.class)
  private String  legalPersonaName;

  @XStreamAlias("component_phone")
  @XStreamConverter(value = XStreamCDataConverter.class)
  private String  componentPhone;

}
