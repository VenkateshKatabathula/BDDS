package com.daointerfaces;

import java.sql.SQLException;

import com.beans.OrderBean;

public interface OrderRequestDao 
{
public int setRequestDetails(OrderBean orderBean) throws SQLException,ClassNotFoundException;
}
