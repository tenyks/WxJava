package me.chanjar.weixin.open.bean.result;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.ArrayList;
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
  private Long  first;

  /**
   * 二级类目ID，（必要）；
   */
  @SerializedName("second")
  private Long  second;

  /**
   * 资质名称（key字段）和资质图片（value字段），（按需填写）；
   */
  private List<WxOpenMaKeyValue>  certicates;

  public static void main(String[] args) {
    Gson GSON = new Gson();

    WxOpenMaCategoryItem item = new WxOpenMaCategoryItem();
    item.first = 1L;
    item.second = 2L;

    List<WxOpenMaCategoryItem> items = new ArrayList<>();
    items.add(item);

    JsonObject req = new JsonObject();
    JsonArray array = GSON.toJsonTree(items, new TypeToken<List<WxOpenMaCategoryItem>>() {}.getType()).getAsJsonArray();
    req.add("categories", array);

    System.out.println(GSON.toJson(req));
  }
}
