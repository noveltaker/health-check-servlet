package org.noveltaker.healthcheck;

import com.noveltaker.healthcheck.information.Information;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
    name = HealthCheckConstants.DEFAULT_NAME,
    description = HealthCheckConstants.DEFAULT_DESCRIPTION,
    urlPatterns = {HealthCheckConstants.DEFAULT_URL_PATTERNS})
public class HealthCheckServlet extends HttpServlet {

  private final Information information;

  private final String contentType = "application/json";

  public HealthCheckServlet() {
    information = new Information();
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {

    ObjectMapper objectMapper = new ObjectMapper();

    resp.setContentType(contentType);

    resp.setStatus(HttpServletResponse.SC_OK);

    try {
      resp.getWriter().println(objectMapper.writeValueAsString(information));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
