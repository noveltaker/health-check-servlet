package org.noveltaker.healthcheck.information;

import java.io.Serializable;

class Application implements Serializable {

  private static final long serialVersionUID = 316993715233967023L;

  protected Application() {}

  private final String status = "OK";

  public String getStatus() {
    return status;
  }
}
