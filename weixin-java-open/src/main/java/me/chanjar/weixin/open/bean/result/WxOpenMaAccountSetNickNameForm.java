package me.chanjar.weixin.open.bean.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * 小程序名称设置及改名表单；
 * @author Maxwell.Lee
 * @date 2019-03-29 15:41
 * @since 1.0.0
 */
@Data
public class WxOpenMaAccountSetNickNameForm implements Serializable {
  private static final long serialVersionUID = 3502233866993288891L;

  /**
   * 昵称	必填
   */
  @SerializedName("nick_name")
  private String  nickName;

  /**
   * 身份证照片–临时素材mediaId	个人号必填
   */
  @SerializedName("id_card")
  private String  idCardImgId;

  /**
   * 组织机构代码证或营业执照– 临时素材 mediaId	 组织号必填
   */
  @SerializedName("license")
  private String  licenseImgId;

  /**
   * 其他证明材料---临时素材 mediaId	选填
   */
  @SerializedName("naming_other_stuff_1")
  private String  namingOtherStuff1ImgId;

  /**
   * 其他证明材料---临时素材 mediaId	选填
   */
  @SerializedName("naming_other_stuff_2")
  private String  namingOtherStuff2ImgId;



}
