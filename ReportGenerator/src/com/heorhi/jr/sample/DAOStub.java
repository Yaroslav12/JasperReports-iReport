package com.heorhi.jr.sample;

import java.util.ArrayList;

public class DAOStub {

	public ArrayList<DataBean> getDataBeanList() {
		ArrayList<DataBean> dataBeanList = new ArrayList<DataBean>();
		DataBean tempBean = new DataBean();
		tempBean.setName("����");
		tempBean.setDiscipline("������");
		tempBean.setAbsence(2);
		dataBeanList.add(tempBean);

		tempBean = new DataBean();
		tempBean.setName("����");
		tempBean.setDiscipline("�������");
		tempBean.setAbsence(3);
		dataBeanList.add(tempBean);

		tempBean = new DataBean();
		tempBean.setName("���");
		tempBean.setDiscipline("English");
		tempBean.setAbsence(5);
		dataBeanList.add(tempBean);

		return dataBeanList;
	}
}