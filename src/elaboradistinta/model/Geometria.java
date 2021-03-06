/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package elaboradistinta.model;

import org.orm.*;
import org.hibernate.Query;
import java.util.List;

public class Geometria {
	public Geometria() {
	}
	
	public static Geometria loadGeometriaByORMID(int ID) {
		try {
			PersistentSession session = elaboradistinta.model.CoedilPersistentManager.instance().getSession();
			return loadGeometriaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Geometria getGeometriaByORMID(int ID) {
		try {
			PersistentSession session = elaboradistinta.model.CoedilPersistentManager.instance().getSession();
			return getGeometriaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Geometria loadGeometriaByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = elaboradistinta.model.CoedilPersistentManager.instance().getSession();
			return loadGeometriaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Geometria getGeometriaByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = elaboradistinta.model.CoedilPersistentManager.instance().getSession();
			return getGeometriaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Geometria loadGeometriaByORMID(PersistentSession session, int ID) {
		try {
			return (Geometria) session.load(elaboradistinta.model.Geometria.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Geometria getGeometriaByORMID(PersistentSession session, int ID) {
		try {
			return (Geometria) session.get(elaboradistinta.model.Geometria.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Geometria loadGeometriaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Geometria) session.load(elaboradistinta.model.Geometria.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Geometria getGeometriaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Geometria) session.get(elaboradistinta.model.Geometria.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Geometria[] listGeometriaByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = elaboradistinta.model.CoedilPersistentManager.instance().getSession();
			return listGeometriaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Geometria[] listGeometriaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = elaboradistinta.model.CoedilPersistentManager.instance().getSession();
			return listGeometriaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Geometria[] listGeometriaByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From elaboradistinta.model.Geometria as Geometria");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Geometria[]) list.toArray(new Geometria[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Geometria[] listGeometriaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From elaboradistinta.model.Geometria as Geometria");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Geometria[]) list.toArray(new Geometria[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Geometria loadGeometriaByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = elaboradistinta.model.CoedilPersistentManager.instance().getSession();
			return loadGeometriaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Geometria loadGeometriaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = elaboradistinta.model.CoedilPersistentManager.instance().getSession();
			return loadGeometriaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Geometria loadGeometriaByQuery(PersistentSession session, String condition, String orderBy) {
		Geometria[] geometrias = listGeometriaByQuery(session, condition, orderBy);
		if (geometrias != null && geometrias.length > 0)
			return geometrias[0];
		else
			return null;
	}
	
	public static Geometria loadGeometriaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Geometria[] geometrias = listGeometriaByQuery(session, condition, orderBy, lockMode);
		if (geometrias != null && geometrias.length > 0)
			return geometrias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateGeometriaByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = elaboradistinta.model.CoedilPersistentManager.instance().getSession();
			return iterateGeometriaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static java.util.Iterator iterateGeometriaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = elaboradistinta.model.CoedilPersistentManager.instance().getSession();
			return iterateGeometriaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static java.util.Iterator iterateGeometriaByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From elaboradistinta.model.Geometria as Geometria");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static java.util.Iterator iterateGeometriaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From elaboradistinta.model.Geometria as Geometria");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Geometria loadGeometriaByCriteria(GeometriaCriteria geometriaCriteria) {
		Geometria[] geometrias = listGeometriaByCriteria(geometriaCriteria);
		if(geometrias == null || geometrias.length == 0) {
			return null;
		}
		return geometrias[0];
	}
	
	public static Geometria[] listGeometriaByCriteria(GeometriaCriteria geometriaCriteria) {
		return geometriaCriteria.listGeometria();
	}
	
	public static Geometria createGeometria() {
		return new elaboradistinta.model.Geometria();
	}
	
	public boolean save() {
		try {
			elaboradistinta.model.CoedilPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean delete() {
		try {
			elaboradistinta.model.CoedilPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean refresh() {
		try {
			elaboradistinta.model.CoedilPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean evict() {
		try {
			elaboradistinta.model.CoedilPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	private int ID;
	
	private float base;
	
	private float altezza;
	
	private float lunghezza;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setBase(float value) {
		this.base = value;
	}
	
	public float getBase() {
		return base;
	}
	
	public void setAltezza(float value) {
		this.altezza = value;
	}
	
	public float getAltezza() {
		return altezza;
	}
	
	public void setLunghezza(float value) {
		this.lunghezza = value;
	}
	
	public float getLunghezza() {
		return lunghezza;
	}
	
	public Geometria(float b, float a, float l) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public Geometria(Object valueAt, Object valueAt2, Object valueAt3) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
