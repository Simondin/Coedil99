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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class GeometriaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final FloatExpression base;
	public final FloatExpression altezza;
	public final FloatExpression lunghezza;
	
	public GeometriaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		base = new FloatExpression("base", this);
		altezza = new FloatExpression("altezza", this);
		lunghezza = new FloatExpression("lunghezza", this);
	}
	
	public GeometriaCriteria(PersistentSession session) {
		this(session.createCriteria(Geometria.class));
	}
	
	public GeometriaCriteria() throws PersistentException {
		this(elaboradistinta.model.CoedilPersistentManager.instance().getSession());
	}
	
	public Geometria uniqueGeometria() {
		return (Geometria) super.uniqueResult();
	}
	
	public Geometria[] listGeometria() {
		java.util.List list = super.list();
		return (Geometria[]) list.toArray(new Geometria[list.size()]);
	}
}

