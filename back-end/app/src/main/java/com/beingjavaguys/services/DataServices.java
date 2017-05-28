package com.beingjavaguys.services;

import java.util.List;

import com.beingjavaguys.model.Message;

public interface DataServices {
    public List<Message> getMessages(String login) throws Exception;
/*
	public boolean addEntity(Employee employee) throws Exception;
	public Employee getEntityById(long id) throws Exception;
	public List<Employee> getEntityList() throws Exception;
	public boolean deleteEntity(long id) throws Exception;*/
}
