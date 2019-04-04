package me.chanjar.weixin.open.api.impl;

import me.chanjar.weixin.common.api.PersistenceRepository;

/**
 * 微信开放平台的持久化配置Storage实现；
 *
 * @author Maxwell.Lee
 * @date 2019-04-04 11:27
 * @since 1.0.0
 */
public class WxOpenPersistenceConfigStorage extends WxOpenInMemoryConfigStorage {

  private final static Integer MaxTtlInSecond = 86400 * 365 * 5;//5年；

  private final static String COMPONENT_VERIFY_TICKET_KEY = "wx:component_verify_ticket";
  private final static String COMPONENT_ACCESS_TOKEN_KEY = "wx:component_access_token";

  private final static String AUTHORIZER_REFRESH_TOKEN_KEY = "wx:authorizer_refresh_token";
  private final static String AUTHORIZER_ACCESS_TOKEN_KEY = "wx:authorizer_access_token";
  private final static String JSAPI_TICKET_KEY = "wx:jsapi_ticket:";
  private final static String CARD_API_TICKET_KEY = "wx:card_api_ticket:";

  private final PersistenceRepository<String, String> repository;

  private String componentAppId;

  public WxOpenPersistenceConfigStorage(PersistenceRepository<String, String> repository) {
    this.repository = repository;
  }

  @Override
  public void setComponentAppId(String componentAppId) {
    super.setComponentAppId(componentAppId);

    this.componentAppId = componentAppId;
  }

  @Override
  public String getComponentVerifyTicket() {
    return repository.getValue(componentAppId, COMPONENT_VERIFY_TICKET_KEY);
  }

  @Override
  public void setComponentVerifyTicket(String componentVerifyTicket) {
    repository.save(componentAppId, COMPONENT_VERIFY_TICKET_KEY, componentVerifyTicket, 600);
  }

  @Override
  public String getComponentAccessToken() {
    return repository.getValue(componentAppId, COMPONENT_ACCESS_TOKEN_KEY);
  }

  @Override
  public boolean isComponentAccessTokenExpired() {
    Long ttl = repository.getTtl(componentAppId, COMPONENT_ACCESS_TOKEN_KEY);

    return (ttl == null || ttl < 2);
  }

  @Override
  public void expireComponentAccessToken(){
    repository.remove(componentAppId, COMPONENT_ACCESS_TOKEN_KEY);
  }

  @Override
  public void updateComponentAccessToken(String componentAccessToken, int expiresInSeconds) {
    repository.save(componentAppId, COMPONENT_ACCESS_TOKEN_KEY, componentAccessToken, expiresInSeconds - 200);
  }

  @Override
  public String getAuthorizerRefreshToken(String appId) {
    return repository.getValue(appId, AUTHORIZER_REFRESH_TOKEN_KEY);
  }

  @Override
  public void setAuthorizerRefreshToken(String appId, String authorizerRefreshToken) {
    repository.save(appId, AUTHORIZER_REFRESH_TOKEN_KEY, authorizerRefreshToken, MaxTtlInSecond);
  }

  @Override
  public String getAuthorizerAccessToken(String appId) {
    return repository.getValue(appId, AUTHORIZER_ACCESS_TOKEN_KEY);
  }

  @Override
  public boolean isAuthorizerAccessTokenExpired(String appId) {
    Long ttl = repository.getTtl(appId, AUTHORIZER_ACCESS_TOKEN_KEY);

    return (ttl == null || ttl < 2);
  }

  @Override
  public void expireAuthorizerAccessToken(String appId) {
    repository.remove(appId, AUTHORIZER_ACCESS_TOKEN_KEY);
  }

  @Override
  public void updateAuthorizerAccessToken(String appId, String authorizerAccessToken, int expiresInSeconds) {
    repository.save(appId, AUTHORIZER_ACCESS_TOKEN_KEY, authorizerAccessToken, expiresInSeconds - 200);
  }

  @Override
  public String getJsapiTicket(String appId) {
    return repository.getValue(appId, JSAPI_TICKET_KEY);
  }

  @Override
  public boolean isJsapiTicketExpired(String appId) {
    Long ttl = repository.getTtl(appId, JSAPI_TICKET_KEY);

    return (ttl == null || ttl < 2);
  }

  @Override
  public void expireJsapiTicket(String appId) {
    repository.remove(appId, JSAPI_TICKET_KEY);
  }

  @Override
  public void updateJsapiTicket(String appId, String jsapiTicket, int expiresInSeconds) {
    repository.save(appId, JSAPI_TICKET_KEY, jsapiTicket, expiresInSeconds - 200);
  }

  @Override
  public String getCardApiTicket(String appId) {
    return repository.getValue(appId, CARD_API_TICKET_KEY);
  }

  @Override
  public boolean isCardApiTicketExpired(String appId) {
    Long ttl = repository.getTtl(appId, CARD_API_TICKET_KEY);
    return (ttl == null || ttl < 2);
  }

  @Override
  public void expireCardApiTicket(String appId) {
    repository.remove(appId, CARD_API_TICKET_KEY);
  }

  @Override
  public void updateCardApiTicket(String appId, String cardApiTicket, int expiresInSeconds) {
    repository.save(appId, CARD_API_TICKET_KEY, cardApiTicket, expiresInSeconds - 200);
  }

}
