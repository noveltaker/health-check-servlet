package org.noveltaker.healthcheck.information;

public class Information {

  public Information() {
    this.application = new Application();
  }

  private final Application application;

  public Application getApplication() {
    return application;
  }
}
