package com.capgemini.JDBC.dao;

import java.util.List;

import com.capgemini.JDBC.hotel.Hotel;

public interface hotelDAO {
public List<Hotel> getAllInfo();
public  boolean Add();
public void delete();
public void update();
public Object getOrder();

}
