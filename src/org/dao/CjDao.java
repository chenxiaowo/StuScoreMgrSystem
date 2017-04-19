package org.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Cjb;
import org.model.Dlb;
import org.model.Kcb;
import org.model.Xsb;

public interface CjDao {
	public void xgOneCj(String xh,String kch,int cj);
	public void xgAllCj(List<Cjb> cjbs);
	public void addCj(String xh,String kch,int cj);
	public List<Cjb> getCjs();
	public Xsb getOneXs(String xh);
	public Kcb getOneKc(String kch);
	public void delOneCj(String xh,String kch);
	public List<Cjb> getGrCjs(String xh);
	public String getOneKcM(String kch);
	public String getOneXsM(String xh);
}
