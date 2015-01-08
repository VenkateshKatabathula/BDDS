package com.daointerfaces;

import java.sql.SQLException;

public interface PendingRequestDao 
{
public int updateStatus(int orderID) throws ClassNotFoundException, SQLException;
}
