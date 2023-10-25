package com.example.service;

import com.example.dto.CustomerDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MockSoapService extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/xml");
        resp.setCharacterEncoding("UTF-8");
        resp.setStatus(HttpServletResponse.SC_OK);

        String xml = getMockResponse();

        resp.getWriter().println(xml);
    }

    private String getMockResponse() throws JsonProcessingException {
        var customer = new CustomerDTO(1, "Jhon", "Smith", "jhon.smith@gmail.com", "888-888-8888");
        var mapper = new XmlMapper();
        return mapper.writeValueAsString(customer);
    }
}