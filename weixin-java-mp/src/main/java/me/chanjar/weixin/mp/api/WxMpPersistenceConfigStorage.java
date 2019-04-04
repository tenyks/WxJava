package me.chanjar.weixin.mp.api;

import me.chanjar.weixin.common.api.PersistenceRepository;
import me.chanjar.weixin.mp.enums.TicketType;

/**
 * 基于DB的微信配置provider.
 *
 * @author Maxwell.Lee
 * @date 2019-04-03 15:00
 * @since 1.0.0
 */
public class WxMpPersistenceConfigStorage extends WxMpInMemoryConfigStorage {
  private static final long serialVersionUID = -8376331172225717154L;

  private static final String AccessTokenKey = "wx:access_token";

  private final PersistenceRepository<String, String> repository;

  private String  appId;


  public WxMpPersistenceConfigStorage(PersistenceRepository<String, String>   repository) {
      this.repository = repository;
  }

  /**
   * 每个公众号生成独有的存储key.
   */
  @Override
  public void setAppId(String appId) {
    super.setAppId(appId);

    this.appId = appId;
  }

  private String getTicketKey(TicketType type) {
    return String.format("wx:ticket:%s", type.getCode());
  }

  @Override
  public String getAccessToken() {
    return repository.getValue(appId, AccessTokenKey);
  }

  @Override
  public boolean isAccessTokenExpired() {
    Long ttl = repository.getTtl(appId, AccessTokenKey);
    return  (ttl == null || ttl < 2);
  }

  @Override
  public synchronized void updateAccessToken(String accessToken, int expiresInSeconds) {
    repository.save(appId, AccessTokenKey, accessToken, expiresInSeconds - 200);
  }

  @Override
  public void expireAccessToken() {
    repository.remove(appId, AccessTokenKey);
  }

  @Override
  public String getTicket(TicketType type) {
    return repository.getValue(appId, AccessTokenKey);
  }

  @Override
  public boolean isTicketExpired(TicketType type) {
    Long ttl = repository.getTtl(appId, getTicketKey(type));
    return (ttl == null || ttl < 2);
  }

  @Override
  public synchronized void updateTicket(TicketType type, String jsapiTicket, int expiresInSeconds) {
    repository.save(appId, getTicketKey(type), jsapiTicket, expiresInSeconds - 200);
  }

  @Override
  public void expireTicket(TicketType type) {
    repository.remove(appId, getTicketKey(type));
  }

}
