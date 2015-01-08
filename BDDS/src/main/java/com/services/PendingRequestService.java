package com.services;

import java.sql.SQLException;
import com.daofactory.DaoFactory;
import com.daointerfaces.PendingRequestDao;

public class PendingRequestService {
public int  getPendingRequestService(int orderID) throws ClassNotFoundException, SQLException
{
	PendingRequestDao pendingrequestdao=DaoFactory.getPendingRequests();
	return pendingrequestdao.updateStatus(orderID);
}
}
