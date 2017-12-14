/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2017-11-07 19:12:12 UTC)
 * on 2017-12-14 at 01:23:16 UTC 
 * Modify at your own risk.
 */

package com.appspot.hackwinds.camera.model;

/**
 * Model definition for ModelCameraMessagesCameraMessage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the camera. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ModelCameraMessagesCameraMessage extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("image_url")
  private java.lang.String imageUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String info;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean premium;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("refresh_interval") @com.google.api.client.json.JsonString
  private java.lang.Long refreshInterval;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("refresh_method")
  private java.lang.String refreshMethod;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean refreshable;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("video_url")
  private java.lang.String videoUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("web_url")
  private java.lang.String webUrl;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getImageUrl() {
    return imageUrl;
  }

  /**
   * @param imageUrl imageUrl or {@code null} for none
   */
  public ModelCameraMessagesCameraMessage setImageUrl(java.lang.String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getInfo() {
    return info;
  }

  /**
   * @param info info or {@code null} for none
   */
  public ModelCameraMessagesCameraMessage setInfo(java.lang.String info) {
    this.info = info;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public ModelCameraMessagesCameraMessage setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPremium() {
    return premium;
  }

  /**
   * @param premium premium or {@code null} for none
   */
  public ModelCameraMessagesCameraMessage setPremium(java.lang.Boolean premium) {
    this.premium = premium;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getRefreshInterval() {
    return refreshInterval;
  }

  /**
   * @param refreshInterval refreshInterval or {@code null} for none
   */
  public ModelCameraMessagesCameraMessage setRefreshInterval(java.lang.Long refreshInterval) {
    this.refreshInterval = refreshInterval;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRefreshMethod() {
    return refreshMethod;
  }

  /**
   * @param refreshMethod refreshMethod or {@code null} for none
   */
  public ModelCameraMessagesCameraMessage setRefreshMethod(java.lang.String refreshMethod) {
    this.refreshMethod = refreshMethod;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRefreshable() {
    return refreshable;
  }

  /**
   * @param refreshable refreshable or {@code null} for none
   */
  public ModelCameraMessagesCameraMessage setRefreshable(java.lang.Boolean refreshable) {
    this.refreshable = refreshable;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getVideoUrl() {
    return videoUrl;
  }

  /**
   * @param videoUrl videoUrl or {@code null} for none
   */
  public ModelCameraMessagesCameraMessage setVideoUrl(java.lang.String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getWebUrl() {
    return webUrl;
  }

  /**
   * @param webUrl webUrl or {@code null} for none
   */
  public ModelCameraMessagesCameraMessage setWebUrl(java.lang.String webUrl) {
    this.webUrl = webUrl;
    return this;
  }

  @Override
  public ModelCameraMessagesCameraMessage set(String fieldName, Object value) {
    return (ModelCameraMessagesCameraMessage) super.set(fieldName, value);
  }

  @Override
  public ModelCameraMessagesCameraMessage clone() {
    return (ModelCameraMessagesCameraMessage) super.clone();
  }

}
